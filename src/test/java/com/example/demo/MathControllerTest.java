package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
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

//    @Test
//    public void testAddOperation(){
//        //SEAT
//        //SETUP
//        MathController mathController = new MathController();
//        String expected = "10";
//        assertEquals(10,10);
//    }

    @Test
    public void testAddOperation() throws Exception {

        RequestBuilder request = get("/math/calculate?operation=add&x=4&y=6");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("10"));
    }

//    @Test
//    public void testMathSumPost(){
//        //SEAT
//        //SETUP
//        MathController mathController = new MathController();
//        //EXECUTION
//        int expected = 15;
//        mathController.add(4,5,6);
//        //Assertion
//        assertEquals(15,mathController.add(4,5,6));
//        //Teardown
//    }

    @Test
    public void testMathSumPost() throws Exception {

        RequestBuilder request = post("/math/sum?x=4&y=5&z=6");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

//    @Test
//    public void testVolumeOfRectangle(){
//        //SEAT
//        //SETUP
//        MathController mathController = new MathController();
//        //EXEC
//        int expected = 60;
//        mathController.multiply(3,4,5);
//        //ASSERT
//        assertEquals("The volume of a 3x4x5 rectangle is 60", mathController.multiply(3,4,5));
//        //TEAR DOWN
//    }

    @Test
    public void testVolumeOfRectangle() throws Exception {

        RequestBuilder request = post("/math/volume/3/4/5");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 3x4x5 rectangle is 60"));
    }

    @Test
    public void testAreaOfCircle() throws Exception {
        RequestBuilder request = post("/math/area")
                .param("radius", "4")
                .param("type", "circle");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("The area of a 4 circle is 50.26548245743669"));
    }

//    @Test
//    public void testAreaOfRectangle() throws Exception {
//
//        RequestBuilder request = post("/math/area")
//                .param("length", "4")
//                .param("width", "5")
//                .param("radius", "4")
//                .param("type", "rectangle");
//
//        this.mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string("The area of a 4x5 rectangle is 20"));
//    }
    @Test
    public void testMultiply() throws Exception {
        RequestBuilder request = post("/math/area")
                .param("width", "5")
                .param("length", "4")
                .param("type", "rectangle");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("The area of a 4x5 rectangle is 20"));
    }

    @Test
    public void testTicketTotal() throws Exception {

        MockHttpServletRequestBuilder request = post("/flights/tickets/total")
                .contentType(MediaType.APPLICATION_JSON)
                .content("\"{\\\"tickets\\\":[{\\\"passenger\\\":{\\\"firstName\\\":\\\"Some name\\\",\\\"lastName\\\":\\\"Some other name\\\"},\\\"price\\\":200},{\\\"passenger\\\":{\\\"firstName\\\":\\\"Name B\\\",\\\"lastName\\\":\\\"Name C\\\"},\\\"price\\\":150}]}\"\n");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("350"));

    }

}