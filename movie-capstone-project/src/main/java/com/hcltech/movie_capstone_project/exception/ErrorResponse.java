package com.hcltech.movie_capstone_project.exception;

public class ErrorResponse {
    private int statusCode;
    private String message;

    public ErrorResponse() {
    }

    public ErrorResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public ErrorResponse(String message)
    {
        super();
        this.message = message;
    }
}
