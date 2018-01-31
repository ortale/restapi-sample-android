package br.com.rodolfoortale.brighthr.api;

import br.com.rodolfoortale.brighthr.interfaces.APIInterface;
import br.com.rodolfoortale.brighthr.interfaces.OnRequestCallbackInterface;
import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.User;
import br.com.rodolfoortale.brighthr.model.UserResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class APIRequest {
    private OnRequestCallbackInterface apiRequestCallbackInterface;
    private APIInterface apiInterface;
    private ErrorResponse errorResponse;

    public APIRequest() {

    }

    public void login(String username, String password) {
        apiInterface = APIClient.getClient().create(APIInterface.class);

        errorResponse = new ErrorResponse();

        User user = new User();
        user.setUsername(username);

        Call<UserResponse> call = apiInterface.createUser(user);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.code() == 200) {
                    UserResponse user = response.body();
                }

                else if (response.code() == 403) {
                    errorResponse.setErrorMessage(APICons.kError403);
                }

                else {
                    errorResponse.setErrorMessage(APICons.kErrorOther);
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                call.cancel();
                errorResponse.setErrorMessage(APICons.kErrorOther);
            }
        });
    }
}
