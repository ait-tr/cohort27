package com.phonebook.tests;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ModifyContactSuccessTests extends TestBase {

    String id;

    @BeforeMethod
    public void precondition() {
        ContactDto dto = ContactDto.builder()
                .name("Adam")
                .lastName("Kross")
                .email("kross@gm.com")
                .phone("1234567890")
                .address("Koblenz")
                .description("goalkeeper")
                .build();

        String message = given()
                .contentType(ContentType.JSON)
                .header(AUTH, token)
                .body(dto)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().path("message");

        String[] split = message.split(": ");
        id = split[1];
    }

    @Test
    public void modifyContactTest() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        given()
                .contentType(ContentType.JSON)
                .body(ContactDto.builder()
                        .id(id)
                        .name("Adam" + i)
                        .lastName("Kross")
                        .email("kross@gm.com")
                        .phone("1234567890")
                        .address("Hamburg")
                        .description("goalkeeper")
                        .build())
                .header(AUTH, token)
                .when()
                .put("contacts")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message", equalTo("Contact was updated"));
    }

    @AfterMethod
    public void postCondition() {
        given()
                .header(AUTH, token)
                .when()
                .delete("contacts/" + id);

    }
}
