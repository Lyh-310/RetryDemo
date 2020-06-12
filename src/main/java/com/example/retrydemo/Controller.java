package com.example.retrydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {

    @Autowired
    private RetryDemoService retryDemoService;


    @GetMapping(value = "/retry")
    public String doRetry() {
        String response = "";
        try {
            response = retryDemoService.doRetry();
        } catch (Exception e) {
            System.out.println("Caught an exception in Controller");
        }
        return response;
    }
}
