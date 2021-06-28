package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/math/pi")
    public String getPiMethod(){
        double pi = Math.PI;
        return "" + pi;
    }
}
