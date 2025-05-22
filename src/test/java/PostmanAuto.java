import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class PostmanAuto {

    RequestSpecification SpecUrl = given().baseUri("https://postman-echo.com/");


    @DisplayName("Get Request")
    @Test
    public void GetRequest(){
        SpecUrl.given()
                .contentType("application/json")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
        .when()
                .get("/get")
        .then().log().body().statusCode(200)
                .and().body("args.foo1", equalTo("bar1"))
                .and().body("args.foo2", equalTo("bar2"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                ;
    }

    @DisplayName("Post Request: raw text")
    @Test
     public void PostRequestRaw(){
        SpecUrl.given()
             .body("This is expected to be sent back as part of response body.")
     .when()
             .post("/post")
     .then()
             .log().body().statusCode(200)
             .and().body("data", equalTo("This is expected to be sent back as part of response body."))
             .and().body("headers.x-forwarded-proto", equalTo("https"))
             .and().body("headers.host", equalTo("postman-echo.com"))
             .and().body("headers.accept", equalTo("*/*"))
             .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
             .and().body("headers.x-forwarded-port", equalTo("443"))
             .and().body("headers.content-length", equalTo("58"))
             .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
            ;
    }

    @DisplayName("Post Request: x-www-form-urlencoded")
    @Test
    public void PostRequestFormUrlenCoded(){
        SpecUrl.given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParams("foo1", "bar1")
                .formParam("foo2", "bar2")
        .when()
                .post("/post")
        .then()
                .log().body().statusCode(200)
                .and().body("form.foo1", equalTo("bar1"))
                .and().body("form.foo2", equalTo("bar2"))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-length", equalTo("19"))
                .and().body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=utf-8"))
        ;
    }

    @DisplayName("Put Request")
    @Test
    public void PutRequest() {
        SpecUrl.given()
                .body("This is expected to be sent back as part of response body.")
        .when()
                .put("/put")
        .then()
                .log().body().statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
        ;
    }

    @DisplayName("Patch Request")
    @Test
    public void PatchRequest() {
        SpecUrl.given()
                .body("This is expected to be sent back as part of response body.")
        .when()
                .patch("/patch")
        .then()
                .log().body().statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
        ;
    }

    @DisplayName("Delete Request")
    @Test
    public void DeleteRequest() {
        SpecUrl.given()
                .body("This is expected to be sent back as part of response body.")
        .when()
                .delete("/delete")
        .then()
                .log().body().statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."))
                .and().body("headers.x-forwarded-proto", equalTo("https"))
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
        ;
    }

}

