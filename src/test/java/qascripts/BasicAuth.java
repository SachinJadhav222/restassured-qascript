package qascripts;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BasicAuth {
    public String URL="http://postman-echo.com/basic-auth";
    public String USERNAME="postman";
    public String PASSWORD="password";

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
