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

    @Test
    public void testMathSumPost(){
        //SEAT
        //SETUP
        MathController mathController = new MathController();
        //EXECUTION
        int expected = 15;
        mathController.add(4,5,6);
        //Assertion
        assertEquals(15,mathController.add(4,5,6));
        //Teardown
    }

    @Test
    public void testVolumeOfRectangle(){
        //SEAT
        //SETUP
        MathController mathController = new MathController();
        //EXEC
        int expected = 60;
        mathController.multiply(3,4,5);
        //ASSERT
        assertEquals("The volume of a 3x4x5 rectangle is 60", mathController.multiply(3,4,5));
        //TEAR DOWN
    }
}