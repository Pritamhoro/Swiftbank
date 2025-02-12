package com.api.base;

import io.restassured.response.Response;

public class UserProfileMangementService extends BaseService 
{
	private final String BASE_PATH="/api/users/";
	
	public Response UserProfile(String token)
	{
		SetAccessToken(token);
		return getRequest(BASE_PATH+"profile");
	}
}
