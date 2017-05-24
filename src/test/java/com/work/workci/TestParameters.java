package com.work.workci;

import org.testng.annotations.Test;

public class TestParameters {
	
	@Test
	public void display()
	{
		System.out.println(System.getProperty("browserName"));
	}

}
