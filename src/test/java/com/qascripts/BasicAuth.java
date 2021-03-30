package com.qascripts;

import org.junit.Test;
import utility.Utils;

import static io.restassured.RestAssured.given;

public class BasicAuth {
    public String URL="http://postman-echo.com/basic-auth";
    public String USERNAME= Utils.getProperties("postman_username");
    public String PASSWORD=Utils.getProperties("postman_password");

    @Test
    public void basicPreemptiveAuth(){

        given()
                .auth()
                .preemptive()
                .basic(USERNAME,PASSWORD)
                .when()
                .get(URL)
                .then()
                .log()
                .body();
    }
    @Test
    public void basicChallengedAuth(){
        given()
                .auth()
               // .preemptive()
                .basic(USERNAME,PASSWORD)
                .when()
                .get(URL)
                .then()
                .log()
                .body();
    }

}
