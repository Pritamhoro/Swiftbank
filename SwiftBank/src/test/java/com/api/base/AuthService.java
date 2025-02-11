package com.api.base;

import java.util.HashMap;
import java.util.Map;

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
	
	public Response ForgetPassword(String emailaddress)
	{
		HashMap<Object, Object> payload=new HashMap<Object, Object>();
		payload.put("email", emailaddress);
		return postRequest(payload,BASE_PATH+"forgot-password");
	}
}
