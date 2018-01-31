package br.com.rodolfoortale.brighthr.interfaces;

import br.com.rodolfoortale.brighthr.model.User;
import br.com.rodolfoortale.brighthr.model.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public interface IAPI {
    @POST("users/new")
    Call<UserResponse> createUser(@Body User user);
}