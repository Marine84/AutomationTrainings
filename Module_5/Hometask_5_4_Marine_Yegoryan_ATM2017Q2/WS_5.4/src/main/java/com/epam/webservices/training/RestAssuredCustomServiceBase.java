package com.epam.webservices.training;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestAssuredCustomServiceBase {
    @BeforeSuite(alwaysRun = true)
    public void initTest(){
        //custom mock service URL
        RestAssured.baseURI = "http://services.groupkt.com/country";
    }
}
