package com.revature;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import calculator.sum.Calculator;

public class CalculatorTest {
	
	
	@Test
	public void testSumPositive(){
		Calculator calculator=new Calculator();
		int input1=10;
		int input2=10;
		int result=0;
		
		System.out.println("......Positive....");
		
		result=calculator.sum(input1, input2);
		
		Assertions.assertEquals(20, result);
		
	}
	@Test
	public void testSumNegative(){
		Calculator calculator=new Calculator();
		
		int input1=10;
		int input2=10;
		int result=0;
		System.out.println("..........Nigative....");
		
		result=calculator.sum(input1, input2);
		
		Assertions.assertEquals(10, result);
		
	}
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("beforeEach......");
	}
	@AfterEach
	public void afterEachEachMethod() {
		System.out.println("afterEach......");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll......");
		
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll ......");
	}

}
