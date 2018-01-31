package br.com.rodolfoortale.brighthr.api;

import retrofit2.Retrofit;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class APIClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
