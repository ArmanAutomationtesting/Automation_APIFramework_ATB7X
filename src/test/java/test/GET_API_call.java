package test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GET_API_call {


    @Test
    public void Get_call_1() {


        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .log().all()
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }

    @Test
    public void Get_call_2(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .log().all()
                .when().log().all().get()
                .then().log().all().statusLine("HTTP/1.1 200 OK");
    }

}

