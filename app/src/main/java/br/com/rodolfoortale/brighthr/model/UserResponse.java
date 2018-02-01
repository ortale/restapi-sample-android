package br.com.rodolfoortale.brighthr.model;

import com.google.gson.annotations.SerializedName;

/**
 * UserResponse class for Retrofit
 */

public class UserResponse {
    @SerializedName("companyId")
    private Integer companyId;

    @SerializedName("userId")
    private Integer userId;

    @SerializedName("companyTimeZoneName")
    private String companyTimeZoneName;

    @SerializedName("userTimeZoneName")
    private String userTimeZoneName;

    @SerializedName("hasFixedWorkingTimePattern")
    private Boolean hasFixedWorkingTimePattern;

    @SerializedName("token")
    private Token token;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyTimeZoneName() {
        return companyTimeZoneName;
    }

    public void setCompanyTimeZoneName(String companyTimeZoneName) {
        this.companyTimeZoneName = companyTimeZoneName;
    }

    public String getUserTimeZoneName() {
        return userTimeZoneName;
    }

    public void setUserTimeZoneName(String userTimeZoneName) {
        this.userTimeZoneName = userTimeZoneName;
    }

    public Boolean getHasFixedWorkingTimePattern() {
        return hasFixedWorkingTimePattern;
    }

    public void setHasFixedWorkingTimePattern(Boolean hasFixedWorkingTimePattern) {
        this.hasFixedWorkingTimePattern = hasFixedWorkingTimePattern;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
