package org.base;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseClass {

	@BeforeClass
	public static void tc01() {
	       // getdriver("https://www.facebook.com/");
			System.out.println("url Launched Successfuly");
	}
	@Before
	public void tc02() {
		System.out.println("test2");
	}
	@Test
	public void tc03() {
		System.out.println("test3");
	}
	@After
	public void tc04() {
		System.out.println("test4");
	}
	
	@AfterClass
	public static void tc05() {
		System.out.println("test5");
	}
	
	
	
	
	
	 
		 
 }

