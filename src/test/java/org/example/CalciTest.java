package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalciTest {
    @Test
    public void testAddition() {
        Calculator add = new Calculator();
        assertEquals(5, add.add(2, 3));
        assertEquals(-1, add.add(-2, 1));
        assertEquals(0, add.add(0, 0));
        assertEquals(100, add.add(50, 50));
    }

    @Test
    public void testSubtraction() {
        Calculator add = new Calculator();
        assertEquals(-1, add.subtract(2, 3));
        assertEquals(-3, add.subtract(-2, 1));
        assertEquals(0, add.subtract(0, 0));
        assertEquals(0, add.subtract(50, 50));
    }

    @Test
    public void testMultiplication() {
        Calculator add = new Calculator();
        assertEquals(6, add.multiply(2, 3));
        assertEquals(-2, add.multiply(-2, 1));
        assertEquals(0, add.multiply(0, 10));
        assertEquals(2500, add.multiply(50, 50));
    }

    @Test
    public void testDivision() {
        Calculator add = new Calculator();
        assertEquals(2, add.divide(6, 3));
        assertEquals(-2, add.divide(-4, 2));
        assertEquals(0, add.divide(0, 1));
        assertEquals(1, add.divide(50, 50));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator add = new Calculator();
        add.divide(5, 0);
    }
}