package ua.hypson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.hypson.domain.Greeting;
import ua.hypson.service.GreetingService;

@RestController
public class HelloAzureController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String helloAzure() {
        greetingService.save(new Greeting("Hello from automatic deploy from Jenkins!"));
        return greetingService.getGreeting(1L).getMessage();
    }
}
