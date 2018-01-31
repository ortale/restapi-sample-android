package br.com.rodolfoortale.brighthr.listeners;

import br.com.rodolfoortale.brighthr.interfaces.OnRequestCallbackInterface;
import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class OnLoginCallbackListener {
    private OnRequestCallbackInterface apiRequestCallbackInterface;

    public void addAPICallbackListener(OnRequestCallbackInterface apiRequestCallbackInterface) {
        this.apiRequestCallbackInterface = apiRequestCallbackInterface;
    }

    public void onResponseCallback(UserResponse userResponse) {
        if (apiRequestCallbackInterface != null) {
            apiRequestCallbackInterface.onResponseCallback(userResponse);
        }
    }

    public void onFailureCallback(ErrorResponse errorResponse) {
        if (apiRequestCallbackInterface != null) {
            apiRequestCallbackInterface.onFailureCallback(errorResponse);
        }
    }
}
