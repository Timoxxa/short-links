package com.tim.links;

import com.tim.links.controller.HelloController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void test() {
        String actual = new HelloController().hello();
        assertEquals("hello", actual);
    }
}