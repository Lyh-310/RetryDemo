package com.example.retrydemo;

public class RetryDemoException extends Exception {
    public RetryDemoException() {
        super();
    }

    public RetryDemoException(String message) {
        super(message);
    }

    public RetryDemoException(String message, Throwable cause) {
        super(message, cause);
    }

    public RetryDemoException(Throwable cause) {
        super(cause);
    }

    protected RetryDemoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
