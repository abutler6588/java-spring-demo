package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    private double width;
    private double lenght;
    private double height;

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

    @PostMapping("/math/volume/{length}/{width}/{height}")
    public String multiply(@PathVariable int length, @PathVariable int width, @PathVariable int height) {
        return "The volume of a " + length + "x" + width + "x" + height + " rectangle is " + length * width * height;
    }

    //rectangle
    @PostMapping("/math/area/{length}/{width}")
    public String multiply(@PathVariable int length, @PathVariable int width) {
        return "The area of a " + length + "x" + width + " rectangle is " + length * width;
    }

    //circle
    //PI * radius^2
    @PostMapping("/math/area/{radius}")
    public String multiply(@PathVariable int radius) {
        return "The area of a " + radius +  " circle is " +  Math.PI * radius * radius;
    }
}