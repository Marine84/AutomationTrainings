package com.epam.webservices.training.tests;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import com.epam.webservices.training.RestAssuredConfiguration;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredDemoTest extends RestAssuredConfiguration {

	//Marine's implementation
	@Test
	public void checkStatusCode1() {
		Response res = get("/get/all");
		Assert.assertEquals(200, res.getStatusCode());

		// Another way of implementation
//		given().get("http://services.groupkt.com/country/get/all").then().statusCode(200).log().all();
	}

	@Test
	public void ValidateQueryParameter(){
		Response res = get("/get/all");
		String json = res.asString();
		JsonPath jp = new JsonPath(json);
		Assert.assertEquals("Albania", jp.get("RestResponse.result[2].name"));
		String str = jp.get("RestResponse.result[2].name");
		System.out.println(str);

		//Another way of implementation
//		given().when().get("http://services.groupkt.com/country/get/all").then()
//				.body("RestResponse.result[2].name",equalTo("Albania"));
//		String str = (given().get("http://services.groupkt.com/country/get/all").then().body("RestResponse.result[2].name",equalTo("Albania")).toString());
//		System.out.println(str);
	}

	//Training implementation
/*	@Test
	public void checkStatusCode2() {
		Response rp = given().get("/posts").andReturn();	
		int actualStatusCode = rp.getStatusCode();
		System.out.println(actualStatusCode);
		Assert.assertEquals(actualStatusCode, 200);
	}
	
	@Test
	public void checkResponseHeader() {
		Response rp = given().get("/posts").andReturn();	
		String valueOfContentTypeHeader = rp.getHeader("content-type");
		Assert.assertTrue(valueOfContentTypeHeader.contains("application/json"));
	}
	@Test
	public void checkResponseBody() {
		Response rp = given().get("/posts").andReturn();	
		Post[] posts = rp.as(Post[].class);
		Assert.assertEquals(posts.length, 100);
	}*/
}
