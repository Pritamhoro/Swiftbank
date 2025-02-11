package com.api.base;

import com.api.models.Request.LoginRequest;
import com.api.models.Request.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService
{
	private final static String BASE_PATH="/api/auth/";
	public Response login(LoginRequest payload)
	{
		return postRequest(payload, BASE_PATH+"login");
	}
	
	public Response Signup(SignupRequest payload)
	{
		return postRequest(payload, BASE_PATH+"signup");
	}
}
