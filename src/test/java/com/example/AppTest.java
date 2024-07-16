package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(2, 3);
        assertTrue(result == 5);
    }
}
