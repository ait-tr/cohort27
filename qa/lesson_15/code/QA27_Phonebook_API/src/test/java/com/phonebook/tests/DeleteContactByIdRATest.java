package com.phonebook.tests;

import com.phonebook.dto.ContactDto;
import com.phonebook.dto.MessageDto;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class DeleteContactByIdRATest extends TestBase{

    String id;

    @BeforeMethod
    public void precondition() {
        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan@gm.com")
                .phone("1234567890")
                .address("Berlin")
                .description("goalkeeper")
                .build();

        String message = given()
                .header(AUTH, token)
                .body(contactDto)
                .contentType(ContentType.JSON)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().path("message");

        String[] all = message.split(": ");
        id = all[1];
    }

    @Test
    public void deleteContactByIdSuccessTest() {
       // MessageDto dto =
        given()
                .header(AUTH, token)
                .when()
                .delete("contacts/" + id)
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",equalTo("Contact was deleted!"));
            //    .extract().response().as(MessageDto.class);
      //  System.out.println(dto.getMessage());
    }
}
