package dev.mouhieddine.helloworldservice.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HelloWorldController.BASE_URL)
public class HelloWorldController {
    public static final String BASE_URL = "/api/v1/hello";

    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }
}
