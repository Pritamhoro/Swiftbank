package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;

import io.restassured.response.Response;

public class LoginApiTest 
{
	@Test(description = "Verify the login API is working fine")
	public void login() 
	{
		LoginRequest loginRequest=new LoginRequest("Admin", "Admin@1234");
		AuthService authservice=new AuthService();
		Response response=authservice.login(loginRequest);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		
		System.out.print(loginResponse.getEmail());
		Assert.assertNotNull(loginResponse.getToken());
		System.out.print(response.asPrettyString());
		
	}
}
