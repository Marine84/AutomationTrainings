package com.epam.webservices.training;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;

public class RestAssuredConfiguration
{
    @BeforeSuite(alwaysRun = true)
   public void initTest(){
        RestAssured.baseURI = "http://services.groupkt.com/country";

        //Training URI
//		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
    }
}
