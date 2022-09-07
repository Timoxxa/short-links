package com.tim.links;

import com.tim.links.controller.HelloController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    public void testHelloController() {
        assertEquals("Hello!", helloController.hello());
    }
}
