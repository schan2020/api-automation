package apiTests;

import org.testng.annotations.Test;

import io.restassured.response.Response;

//import io.restassured.specification.RequestSpecification;

import org.testng.Assert;

import io.restassured.RestAssured;

public class GetPost {
	@Test
	public void getAllPosts() {
		Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

}
