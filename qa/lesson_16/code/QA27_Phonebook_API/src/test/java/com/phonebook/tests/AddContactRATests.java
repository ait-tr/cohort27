package com.phonebook.tests;

import com.phonebook.dto.ContactDto;
import com.phonebook.dto.MessageDto;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class AddContactRATests extends TestBase{

    @Test
    public void addContactSuccessTest() {
        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan@gm.com")
                .phone("1234567890")
                .address("Berlin")
                .description("goalkeeper")
                .build();

        MessageDto message = given()
                .header(AUTH, token)
                .body(contactDto)
                .contentType(ContentType.JSON)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",containsString("Contact was added!"))
                .extract().response().as(MessageDto.class);
        System.out.println(message.getMessage());
        //Contact was added! ID: 58e37a1d-b721-4864-8bad-cab0005f2434
    }
}
