package br.com.rodolfoortale.brighthr.interfaces;

import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public interface OnRequestCallbackInterface {
    void onResponseCallback(UserResponse userResponse);
    void onFailureCallback(ErrorResponse errorResponse);
}
