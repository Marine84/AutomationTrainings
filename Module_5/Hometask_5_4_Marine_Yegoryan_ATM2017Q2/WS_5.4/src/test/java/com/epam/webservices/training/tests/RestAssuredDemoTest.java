package com.epam.webservices.training.tests;


import static io.restassured.RestAssured.given;

import com.epam.webservices.training.RestAssuredDemoBase;
import com.epam.webservices.training.model.post.Post;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class RestAssuredDemoTest extends RestAssuredDemoBase {

    //Training implementation
    @Test (priority = 1)
    public void checkStatusCode2() {
        Response rp = given().get("/posts").andReturn();
        int actualStatusCode = rp.getStatusCode();
        System.out.println("Test1: Status Code is equal to " + actualStatusCode);
        Assert.assertEquals(actualStatusCode, 200);
    }

    @Test (priority = 2)
    public void checkResponseHeader() {
        Response rp = given().get("/posts").andReturn();
        String valueOfContentTypeHeader = rp.getHeader("content-type");
        System.out.println("Test2: Content-type is equal to " + rp.getHeader("content-type"));
        Assert.assertTrue(valueOfContentTypeHeader.contains("application/json"));
    }

    @Test(priority = 3)
    public void checkResponseBody() {
        Response rp = given().get("/posts").andReturn();
        Post[] posts = rp.as(Post[].class);
        System.out.println("Test3: Body length is equal to " + posts.length);
        Assert.assertEquals(posts.length, 100);
    }

    @Test (priority = 4)
    public void checkFirstResponseUserID() {
        Response rp = given().get("/posts").andReturn();
        Post[] posts = rp.as(Post[].class);
        String usrID = posts[1].getUserId().toString();
        Assert.assertEquals(usrID, "1");

        // this part of code just for me bzbzum ei vor mi qich jokei ed post[] classy iranic incha nerkaytacnum :-)
        Post[] myList = new Post[100];
        System.out.println("Test4:");
        int j = 0;
        for (int i = 0; i < myList.length; i++) {
            if (posts[i].getUserId().equals(2))
            {
                //Find and print all response USER_IDs, where it is equal to 2
                myList[j] = posts[i];

                System.out.println("response ID = " + i + ";   Response UserId = " + myList[j].getUserId().toString());
                j++;
                //Assert that UserID for 10 - 20 responses are equal to "2"
                if (i >=10 && i < 20) {
                    Assert.assertEquals(posts[i].getUserId().toString(), "2");
                }
            }
        }
    }
}
