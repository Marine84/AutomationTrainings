package com.epam.webservices.training.tests;

import static io.restassured.RestAssured.get;

import com.epam.webservices.training.RestAssuredCustomServiceBase;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class RestAssuredCustomServiceTest extends RestAssuredCustomServiceBase {
    //Marine's implementation
	@Test //check status code
	public void checkStatusCode1() {
		Response res = get("/get/all");
		Assert.assertEquals(200, res.getStatusCode());
        System.out.println(res.getStatusCode());

		// Another way of implementation
//		given().get("http://services.groupkt.com/country/get/all").then().statusCode(200).log().all();
	}

	@Test // test that second country in the list is Albania
	public void ValidateQueryParameter(){
		Response res = get("/get/all");
		String json = res.asString();
		JsonPath jp = new JsonPath(json);
		Assert.assertEquals("Albania", jp.get("RestResponse.result[2].name"));
		String str = jp.get("RestResponse.result[2].name");
		System.out.println(str);
	}
}
