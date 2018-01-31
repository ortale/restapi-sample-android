package br.com.rodolfoortale.brighthr.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class User {
    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
