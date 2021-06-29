package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @GetMapping("/math/pi")
    public String getPiMethod() {
        double pi = Math.PI;
        return "" + pi;
    }

    @GetMapping("/math/calculate")
    public int add(@RequestParam int x, @RequestParam int y) {
        return x + y;
    }

    @PostMapping("/math/sum")
    public int add(@RequestParam int x, @RequestParam int y, @RequestParam int z) {
        return x + y + z;
    }

}