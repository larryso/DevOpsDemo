package com.larry.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/index")
public class IndexController {
    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello(@RequestParam String name){
        String greetingMsg = "Hello "+ name;
        return new ResponseEntity(greetingMsg, HttpStatus.OK);
    }
}
