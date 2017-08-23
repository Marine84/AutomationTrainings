package com.epam.webservices.training;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestAssuredDemoBase
{
    @BeforeSuite(alwaysRun = true)
   public void initTest(){
        //Training URI
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
