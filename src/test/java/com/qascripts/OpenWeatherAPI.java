package com.qascripts;

import org.junit.Assert;
import org.junit.Test;
import utility.Utils;

import static io.restassured.RestAssured.given;

public class OpenWeatherAPI {
    public String URL = "http://api.openweathermap.org/data/2.5/weather";
    public String API_KEY = Utils.getProperties("open_weather_api_key");
    public String cityName = "mumbai";

    @Test
    public void getWeatherByCityName() {

        given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .log()
                .body();

    }

    @Test
    public void validateCountry() {
        String country = given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .extract()
                .path("sys.country");
        System.out.println(country);
        Assert.assertTrue(country.equals("IN"));
    }
    @Test
    public void validateWeather() {
        String weather = given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .extract()
                .path("weather[0].icon");
        System.out.println(weather);
        //Assert.assertTrue(weather.equals(""));
    }

    @Test
    public void validateHeaders(){
        given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .log()
                .headers();
    }

    @Test
    public void validateServerHeader(){
        given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .assertThat()
                .header("Server","openresty");
    }
    @Test
    public void validateContentTypeHeader(){
        given()
                .queryParams("q", cityName)
                .queryParams("appid", API_KEY)
                .when()
                .get(URL)
                .then()
                .assertThat()
                .header("Content-Type","application/json; charset=utf-8");
    }


}
