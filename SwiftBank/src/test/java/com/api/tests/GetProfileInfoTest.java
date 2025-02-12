package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileMangementService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;

import io.restassured.response.Response;

public class GetProfileInfoTest 
{
	@Test(description = "Verify the user profile information")
	public void GetProfileInfo()
	{
		LoginRequest loginRequest=new LoginRequest("Admin", "Admin@1234");
		AuthService authservice=new AuthService();
		Response response=authservice.login(loginRequest);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		
		UserProfileMangementService userProfileMangementService=new UserProfileMangementService();
		Response reponse=userProfileMangementService.UserProfile(loginResponse.getToken());
		System.out.println(reponse.asPrettyString());
	}
}
