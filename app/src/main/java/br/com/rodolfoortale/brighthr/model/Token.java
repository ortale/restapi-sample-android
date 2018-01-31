package br.com.rodolfoortale.brighthr.model;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class Token {
    private String token;
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
