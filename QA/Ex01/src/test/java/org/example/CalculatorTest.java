package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cl = new Calculator();
     @Test
    public void testAdd() {
         assertEquals(4, cl.add(2, 2));
     }
}
