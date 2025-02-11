package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import com.api.models.Request.LoginRequest;

import io.restassured.specification.RequestSpecification;

public class BaseService 
{
	//Handling the BASE_URI & Creating the REQUEST , handling the RESPONSE
	
	private final static String BASE_URI="http://64.227.160.186:8080";
	private RequestSpecification requestspecification;
	
	public BaseService()
	{
		requestspecification=given().baseUri(BASE_URI);
	}
	
	protected Response postRequest(Object payload,String endpoint)
	{
		return requestspecification.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		.post(endpoint);
	}
}
