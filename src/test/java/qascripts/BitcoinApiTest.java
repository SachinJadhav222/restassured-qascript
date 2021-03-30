package qascripts;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BitcoinApiTest {
    public String URL="https://api.coindesk.com/v1/bpi/currentprice.json";
    @Test
    public void checkStatusCode(){
        //given() - pre conditon of the test like query param ,path  param etc
        // when() - perform perticular action

        given().when().get(URL).then().statusCode(200);
    }

    @Test
    public void getStatusCode(){
        // This will get the status code
       int statusCode = given().when().get(URL).getStatusCode();
       System.out.println("STatus code- "+statusCode);
        Assert.assertTrue(statusCode==200);
    }
    @Test
    public void getResponseBody(){
        //This will log response body into the console
        given().when().get(URL).then().log().body();

    }


}
