package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {
int sum ;
	Calculator c = new Calculator();
	@BeforeAll
	public  static void testDbConn() {
		System.out.println("DB coonection is up");
	}
	
	@BeforeEach
	public void testStartUp() {
		sum = 0;
		System.out.println("sum = 0");
	}
	@Test
	public void testAdd() {
		
		sum = c.add(100,200);
		Assertions.assertEquals(300,sum,"checked add method");
	}
	@Test
	public void testAdd1() {
		
		sum = c.add(100,200);
		Assertions.assertEquals(300,sum,"checked add method");
	}
	
	@AfterEach
	public  void testShutDown() {
		sum = 0;
		System.out.println("shut down sum = 0");
	}
	@AfterAll
	public  static void testDbConnNulll() {
		System.out.println("DB coonection is null");
	}
	

}
