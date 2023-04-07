package com.project.extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest {

	@Test
	public void logoutUser() {

		System.out.println("This test is for logout user");
	}

	@Test(enabled = false) //enabled=false when you dont want to execute 
	public void failing() {
		Assert.fail("deliverately failing");

	}
}
