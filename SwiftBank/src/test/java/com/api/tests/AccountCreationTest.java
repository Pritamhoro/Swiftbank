package com.api.tests;

import java.net.ResponseCache;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest 
{
	@Test(description = "verify the user is being created")
	
	public void Account_Creation()
	{
		SignupRequest Signuprequest=new SignupRequest.Builder().username("FirstL")
		.email("test.user@1234.com")
		.firstName("first")
		.lastName("last")
		.password("star123")
		.mobileNumber("1234567890")
		.build();
		AuthService authService=new AuthService();
		Response response=authService.Signup(Signuprequest);
		System.out.print(response.asPrettyString());
		
	}
}
