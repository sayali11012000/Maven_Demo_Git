package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
//Additional support while executing 
	// afailed assumption results in test being terminated
	//when to use--- if test case fsiled ...do not continue further
	//100th line of code --- error at 10th line
class AssumptionsTest {
 int num;
	 @Test
	    void testOnDev()
	    {
	        System.setProperty("ENV", "DEV");
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
	        System.out.println(" continue execution");
	        num = 100;
	    }

	    @Test
	    void testOnProd()
	    {
	        System.setProperty("ENV", "PROD");
	        Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")),AssumptionsTest::message);
	        System.out.println(" don't continue execution");
	    num = 54;
	    }

	    private static String message () {
	        return "TEST Execution Failed :: ";
	    }
}
