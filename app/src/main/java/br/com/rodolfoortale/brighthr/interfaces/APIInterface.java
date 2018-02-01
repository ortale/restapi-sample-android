package br.com.rodolfoortale.brighthr.interfaces;

import br.com.rodolfoortale.brighthr.model.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public interface APIInterface {
    @FormUrlEncoded
    @POST("Account/PostValidateUser")
    Call<UserResponse> createUser(@Field("username") String username, @Field("password") String password);
}
