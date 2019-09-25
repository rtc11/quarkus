package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {

    @Test
    void isAlive() {
        given()
                .when().get("/internal/alive")
                .then()
                .statusCode(200);
    }

    @Test
    void isReady() {
        given()
                .when().get("/internal/ready")
                .then()
                .statusCode(200);
    }
}