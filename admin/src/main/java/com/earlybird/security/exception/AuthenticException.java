package com.earlybird.security.exception;

/**
 * Created by codingBoy on 16/11/18.
 */
public class AuthenticException extends Exception
{

    //异常信息
    private String message;

    public AuthenticException(String message)
    {
        super(message);
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
