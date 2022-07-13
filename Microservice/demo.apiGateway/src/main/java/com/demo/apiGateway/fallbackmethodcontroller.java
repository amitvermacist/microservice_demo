package com.demo.apiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackmethodcontroller {
    @GetMapping("/userServicefallback")
    public String userServiceFallbackMethod(){
        return "user service taking longer that expection";
    }

    @GetMapping("/depServicefallback")
    public String DepServiceFallbackMethod(){
        return "dep service taking longer that expection";
    }
}
