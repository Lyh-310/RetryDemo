package com.example.retrydemo;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryDemoService {


    @Retryable(maxAttempts = 3, value = {RetryDemoException.class})
    public String doRetry() throws RetryDemoException {
        try {
            doRetrySubMethod();
        } catch (RetryDemoException e) {
            System.out.println("Caught a RetryDemoException");
            throw e;
        }
        return "";
    }

    private void doRetrySubMethod() throws RetryDemoException {
        throw new RetryDemoException("A RetryDemoException");
    }

    @Recover
    public String recoverMethod() {
        return "Recovered";
    }
}
