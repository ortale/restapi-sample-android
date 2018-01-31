package br.com.rodolfoortale.brighthr.model;

/**
 * Created by rodolfoortale on 31/01/2018.
 */

public class UserResponse {
    private Integer companyId;
    private Integer userId;
    private String companyTimeZoneName;
    private String userTimeZoneName;
    private Boolean hasFixedWorkingTimePattern;

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
}
