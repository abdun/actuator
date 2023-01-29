package com.noor.actuator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {
    @GetMapping(value="/user",  produces = MediaType.TEXT_PLAIN_VALUE)
        public String getName() {
        return "My name is Ilahi";
    }
}
