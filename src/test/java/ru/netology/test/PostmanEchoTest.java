package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi bro")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi bro"));
    }
}
