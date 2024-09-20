package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    // Base URI
    private static final String BASE_URI = "https://api.example.com";

    public static Response get(String endpoint) {
        return given()
                .baseUri(BASE_URI)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response post(String endpoint, Object body) {
        return given()
                .baseUri(BASE_URI)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    // More methods like put, delete, etc.
}
