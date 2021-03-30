package qascripts;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GitHubOAuthAPI {
    public String API_TOKEN="833a6ca4f2eae66e1ac4df8ea87f0747a9f1b10d";
    public String baseURL="https://api.github.com";

    @Test
    public void verifyRepos(){
        String new_url=baseURL+"/user/repos";
        given()
                .auth()
                .oauth2(API_TOKEN)
                .when()
                .get(new_url)
                .then()
                .log()
                .body();
    }

    // Query parameter   http://api.openweathermap.org/data/2.5/weather?q=mumbai&appid=db7d5f609a876b02b5b9181293b46f73
    // Query parameters are used to filter out resources
    // http://postman-echo.com/basic-auth


    @Test
    public void verifyQueryParamRepos(){
        String new_url=baseURL+"/user/repos";
        given()
                .auth()
                .oauth2(API_TOKEN)
                .queryParams("sort","created")
                .queryParams("direction","desc")
                .when()
                .get(new_url)
                .then()
                .log()
                .body();
    }

    // Path parameters  GET /users/:username/repos
    // - Parameters are used to identify resources
    @Test
    public void verifyPathParamRepos(){
        String new_url=baseURL+"/users/{username}/repos";
        given()
                .auth()
                .oauth2(API_TOKEN)
                .pathParam("username","sachinjadhav222")
                .when()
                .get(new_url)
                .then()
                .log()
                .body();
    }

}
