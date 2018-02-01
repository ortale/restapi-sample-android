package br.com.rodolfoortale.brighthr.model;

/**
 * Error Response class for Retrofit
 */

public class ErrorResponse {
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
