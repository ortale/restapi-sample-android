package br.com.rodolfoortale.brighthr.api;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import br.com.rodolfoortale.brighthr.interfaces.APIInterface;
import br.com.rodolfoortale.brighthr.interfaces.OnRequestCallbackInterface;
import br.com.rodolfoortale.brighthr.listeners.OnLoginCallbackListener;
import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class APIRequest {
    private Context context;
    private OnLoginCallbackListener onLoginCallbackListener;
    private APIInterface apiInterface;
    private ErrorResponse errorResponse;

    public APIRequest(Context context, OnRequestCallbackInterface onRequestCallbackInterface) {
        this.context = context;

        onLoginCallbackListener = new OnLoginCallbackListener();
        onLoginCallbackListener.addAPICallbackListener(onRequestCallbackInterface);
    }

    public void login(final String username, String password) {
        apiInterface = APIClient.getClient().create(APIInterface.class);

        errorResponse = new ErrorResponse();

        if (!isNetworkAvailable()) {
            errorResponse.setErrorMessage(APICons.kErrorBadConnection);
            return;
        }

        Call<UserResponse> call = apiInterface.createUser(username, password);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.code() == 200) {
                    UserResponse userResponse = response.body();

                    if (userResponse != null) {
                        onLoginCallbackListener.onResponseCallback(userResponse);
                    }
                    else {
                        errorResponse.setErrorMessage(APICons.kErrorOther);
                        onLoginCallbackListener.onFailureCallback(errorResponse);
                    }
                }

                else if (response.code() == 403) {
                    errorResponse.setErrorMessage(APICons.kError403);
                    onLoginCallbackListener.onFailureCallback(errorResponse);
                }

                else {
                    errorResponse.setErrorMessage(APICons.kErrorOther);
                    onLoginCallbackListener.onFailureCallback(errorResponse);
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                call.cancel();
                errorResponse.setErrorMessage(APICons.kErrorOther);
                onLoginCallbackListener.onFailureCallback(errorResponse);
            }
        });
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
