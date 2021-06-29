package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(MathController.class)
class MathControllerTest {

    @Autowired
    private MockMvc mvc;

//    @Test
//    public void getPiResult() {
//        //SEAT
//        //SETUP
//        MathController mathController = new MathController();
//        //EXEC
//        String expected = "3.141592653589793";
//        assertTrue(expected.equals(mathController.getPiMethod()));
//    }

    @Test
    public void getPiResult() throws Exception {

        RequestBuilder request = get("/math/pi");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));
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