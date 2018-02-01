package br.com.rodolfoortale.brighthr.interfaces;

import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;

/**
 * Interface that communicates between view and requests
 */

public interface OnRequestCallbackInterface {
    void onResponseCallback(UserResponse userResponse);
    void onFailureCallback(ErrorResponse errorResponse);
}
