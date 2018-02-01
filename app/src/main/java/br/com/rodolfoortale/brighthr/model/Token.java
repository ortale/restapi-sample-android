package br.com.rodolfoortale.brighthr.model;

import com.google.gson.annotations.SerializedName;

/**
 * Token class for Retrofit
 */

public class Token {
    @SerializedName("token")
    private String token;

    @SerializedName("userId")
    private Integer userId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
