package com.phonebook.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteAllContactsRATests extends TestBase{

    @Test
    public void deleteAllContactsSuccessTest() {
      //  String message =
                given()
                .header(AUTH, token)
                .when()
                .delete("contacts/clear")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",equalTo("All contacts was deleted!"));
                //.extract().path("message");
     //   System.out.println(message);
    }
}
