package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathControllerTest {

    @Test
    public void getPiResult(){
        //SEAT
        //SETUP
        MathController mathController = new MathController();
        //EXEC
        String expected = "3.141592653589793";
        assertTrue(expected.equals(mathController.getPiMethod()));
    }
}