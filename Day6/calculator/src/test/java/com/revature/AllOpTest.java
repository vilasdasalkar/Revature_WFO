package com.revature;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.sum.MathOperations;

public class AllOpTest {

    private MathOperations mathOperations;

    @BeforeEach
    public void setUp() {
        mathOperations = new MathOperations();
        System.out.println("Setting up...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down...");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests...");
    }

    @Test
    public void testAddPositive() {
        double num1 = 10;
        double num2 = 5;
        double result = mathOperations.add(num1, num2);
        System.out.println("Running testAddPositive...");
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testSubtractPositive() {
        double num1 = 10;
        double num2 = 5;
        double result = mathOperations.subtract(num1, num2);
        System.out.println("Running testSubtractPositive...");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMultiplyPositive() {
        double num1 = 10;
        double num2 = 5;
        double result = mathOperations.multiply(num1, num2);
        System.out.println("Running testMultiplyPositive...");
        Assertions.assertEquals(50, result);
    }

    @Test
    public void testDividePositive() {
        double num1 = 10;
        double num2 = 5;
        double result = mathOperations.divide(num1, num2);
        System.out.println("Running testDividePositive...");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        double num1 = 10;
        double num2 = 0;
        System.out.println("Running testDivideByZero...");

        try {
            mathOperations.divide(num1, num2);
            Assertions.fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

}
