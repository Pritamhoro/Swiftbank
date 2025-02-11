package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgetPassword 
{
	@Test(description = "Verify user forget password is working --")
	public void ForgetPasswordTest()
	{
		AuthService authService=new AuthService();
		Response reposne=authService.ForgetPassword("dummy.user@gmail.com");
		System.out.println(reposne.asPrettyString());
		
	}
}
