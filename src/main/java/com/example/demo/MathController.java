package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MathController {
//
//    private double width;
//    private double lenght;
//    private double height;

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

//    //rectangle
//    @PostMapping("/math/area")
//    public String multiply(@RequestParam String length, @RequestParam String width, @RequestParam String type, @RequestParam String radius) {
//        if (type.equals("circle")) {
//            int rad = Integer.parseInt(radius);
//            return "The area of a " + radius +  " circle is " +  Math.PI * rad * rad;
//        } else if(type.equals("rectangle")){
//            int legnth1 = Integer.parseInt(length);
//            int width1 = Integer.parseInt(width);
//            return "The area of a " + length + "x" + width + " rectangle is " + legnth1 * width1;
//        } else return "error";
//    }
    //test
    @PostMapping("/math/area")
    public String multi2(@RequestParam Map<String, String> body) {
        if (body.get("type").equals("circle")){
            int rad = Integer.parseInt(body.get("radius"));
            return "The area of a " + body.get("radius") +  " circle is " +  Math.PI * rad * rad;
        }else if(body.get("type").equals("rectangle")){
            int len = Integer.parseInt(body.get("length"));
            int wid = Integer.parseInt(body.get("width"));
            return "The area of a " + body.get("length") + "x" + body.get("width") + " rectangle is " + len * wid;
        } else return "error";
    }

    //circle
    //PI * radius^2
//    @PostMapping("/math/area")
//    public String multiply(@RequestBody String circle) {
//        return "The area of a " + radius +  " circle is " +  Math.PI * radius * radius;
//    }
}