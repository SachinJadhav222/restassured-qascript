package qascripts;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LocalJSONServer {
    // To up the local server  go to terminal ang run json-server --watch db.json
    public String URL = "http://localhost:3000/posts";

    @Test
    public void getLocalJsonServer() {
        given()
                .when()
                .get(URL)
                .then()
                .log()
                .body();

    }

    @Test
    public void postRequest() {
        String payload = " {\n" +
                "        \"title\": \"newsac1231\",\n" +
                "        \"body\": \"new sac-body2\",\n" +
                "        \"id\": 18\n" +
                "    }";
       // System.out.println(payload);
            given()
                .contentType(ContentType.JSON)
                    .body(payload)
                    .post(URL)
                    .then()
                    .statusCode(201)
                    .log()
                    .body();


    }
    @Test
    public void deleteRequest() {
        given()
                .contentType(ContentType.JSON)
                .delete(URL+"/1")
                .then()
                .statusCode(200)
                .log()
                .body();
    }
}
