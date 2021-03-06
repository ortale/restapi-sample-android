package br.com.rodolfoortale.brighthr.listeners;

import br.com.rodolfoortale.brighthr.interfaces.OnRequestCallbackInterface;
import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;

/**
 * Listener that tells listener about an login callback event
 */

public class OnLoginCallbackListener {
    private OnRequestCallbackInterface apiRequestCallbackInterface;

    /**
     *
     * @param apiRequestCallbackInterface
     */
    public void addAPICallbackListener(OnRequestCallbackInterface apiRequestCallbackInterface) {
        this.apiRequestCallbackInterface = apiRequestCallbackInterface;
    }

    /**
     *
     * @param userResponse
     */
    public void onResponseCallback(UserResponse userResponse) {
        if (apiRequestCallbackInterface != null) {
            apiRequestCallbackInterface.onResponseCallback(userResponse);
        }
    }

    /**
     *
     * @param errorResponse
     */
    public void onFailureCallback(ErrorResponse errorResponse) {
        if (apiRequestCallbackInterface != null) {
            apiRequestCallbackInterface.onFailureCallback(errorResponse);
        }
    }
}
