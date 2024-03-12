package com.phonebook.tests;


import com.phonebook.dto.AuthRequestDto;
import com.phonebook.dto.AuthResponseDto;
import com.phonebook.dto.ErrorDto;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class LoginRATests extends TestBase {

    AuthRequestDto auth = AuthRequestDto.builder()
            .username("")
            .password("")
            .build();

    @Test
    public void loginSuccessTest() {
        AuthResponseDto dto = given()
                .contentType("application/json")
                .body(auth)
                .when()
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AuthResponseDto.class);
        System.out.println(dto.getToken());
    }

    @Test
    public void loginSuccessTest2() {
        String responseToken = given()
                .contentType("application/json")
                .body(auth)
                .when()
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .body(containsString("token"))
                .extract().path("token");
        System.out.println(responseToken);
    }

    @Test
    public void loginWithWrongEmailTest() {
     //   ErrorDto errorDto =
                given()
                .contentType(ContentType.JSON)
                .body(AuthRequestDto.builder()
                        .username("krossgmail.com")
                        .password("Kross12345$")
                        .build())
                .when()
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(401)
                .assertThat().body("message",containsString("Login or Password incorrect"))
                .assertThat().body("error",equalTo("Unauthorized"));
               // .extract().response().as(ErrorDto.class);
       // System.out.println(errorDto.getError() + " *** " + errorDto.getMessage());
    }
}
