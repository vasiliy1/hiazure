package ua.hypson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAzureController {

    @RequestMapping("/")
    public String helloAzure() {
        return "Hello, Azure";
    }
}
