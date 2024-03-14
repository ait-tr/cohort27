package com.phonebook.tests;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class ModifyContactErrorTests extends TestBase {

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
    public void modifyContactWrongEmailFormatError400Test() {
        given()
                .contentType(ContentType.JSON)
                .body(ContactDto.builder()
                        .id(id)
                        .name("Adam")
                        .lastName("Kross")
                        .email("krossgm.com")
                        .phone("1234567890")
                        .address("Hamburg")
                        .description("goalkeeper")
                        .build())
                .header(AUTH, token)
                .when()
                .put("contacts")
                .then()
                .assertThat().statusCode(400)
                .assertThat().body("message.email",containsString("must be a well-formed email address"));
    }

    @Test
    public void modifyContactInvalidPhoneError400Test() {
        given()
                .contentType(ContentType.JSON)
                .body(ContactDto.builder()
                        .id(id)
                        .name("Adam")
                        .lastName("Kross")
                        .email("kross@gm.com")
                        .phone("123456")
                        .address("Hamburg")
                        .description("goalkeeper")
                        .build())
                .header(AUTH, token)
                .when()
                .put("contacts")
                .then()
                .assertThat().statusCode(400)
                .assertThat().body("message.phone",containsString("Phone number must contain only digits! And length min 10, max 15!"));
    }

    @Test
    public void modifyContactWrongTokenError401Test() {

                  given()
                .contentType(ContentType.JSON)
                .body(ContactDto.builder()
                        .id(id)
                        .name("Adam")
                        .lastName("Kross")
                        .email("kross@gm.com")
                        .phone("1234567890")
                        .address("Hamburg")
                        .description("goalkeeper")
                        .build())
                .header(AUTH, "kdsjfawpef")
                .when()
                .put("contacts")
                .then()
                .assertThat().statusCode(401)
                .assertThat().body("message",containsString("JWT strings must contain exactly 2 period characters"));
    }

    @Test
    public void modifyNotExistedContactError404Test() {

        given()
                .contentType(ContentType.JSON)
                .body(ContactDto.builder()
                        .id("12345")
                        .name("Adam")
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
                .assertThat().statusCode(404);
                //  .assertThat().body("message",containsString("Contact with id: 12345 not found in your contacts!"));
        // bug - status code 400
    }

    @AfterMethod
    public void postCondition() {
        given()
                .header(AUTH, token)
                .when()
                .delete("contacts/" + id);

    }
}
