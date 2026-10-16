package com.codealpha.ecommerce.exception;

public class ErrorResponse {
    public int status;
    private String message;
    public ErrorResponse(int status,String message){
        this.status =status;
        this.message =message;
    }
    public int getStatus(){
        return status;
    }

    public String getMessage() {
        return message;
    }
}
