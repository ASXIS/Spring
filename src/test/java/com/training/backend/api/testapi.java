package com.training.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testapi {

    @GetMapping
    public  String test(){
        return  "Hell Map";
    }
}
