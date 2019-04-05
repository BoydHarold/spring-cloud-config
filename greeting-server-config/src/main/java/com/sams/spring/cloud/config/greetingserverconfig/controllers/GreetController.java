package com.sams.spring.cloud.config.greetingserverconfig.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetController {
    @Value("${message.default.welcome}")
    private String welcomeMessage;

    @Value("${message.default.goodbye}")
    private String goodBye;

    @RequestMapping("/welcome")
    public String welcome() {
        return welcomeMessage;
    }
    @RequestMapping("/bye")
    public String bye() {
        return goodBye;
    }
}
