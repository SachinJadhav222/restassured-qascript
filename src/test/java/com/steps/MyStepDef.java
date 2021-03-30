package com.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utility.Utils;

import static io.restassured.RestAssured.given;

public class MyStepDef {
    RequestSpecification request;
    Response response;

    @Given("User set the base API url {string}")
    public void userSetTheBaseAPIUrl(String base_url0) {
        RestAssured.baseURI = base_url0;
    }

    @Then("User authenticate API request with {string}")
    public void userAuthenticateAPIRequestWith(String token) {
       request= given()
                .auth()
                .oauth2(Utils.getProperties(token));
    }

    @And("^User sends GET request to get all repos$")
    public void userSendsGETRequestToGetAllRepos() {
        String path = "/user/repos";
        response = request
                .get(path)
                .then()
                .extract()
                .response();


    }

    @Then("User validates the response code {string}")
    public void userValidatesTheResponseCode(String statusCode) {
        response.then().log().body();
        Assert.assertEquals(Integer.parseInt(statusCode), response.getStatusCode());
    }
}
