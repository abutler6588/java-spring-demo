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

    @Test
    public void testAddOperation(){
        //SEAT
        //SETUP
        MathController mathController = new MathController();
        String expected = "10";
        assertEquals(10,10);

    }
}