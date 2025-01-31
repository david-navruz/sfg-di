package com.udemy.sfgdi.controllers;

import com.udemy.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SfgController {

    private final GreetingService greetingService;


    public SfgController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  sayHello() {
         return greetingService.sayGreeting();
    }


}
