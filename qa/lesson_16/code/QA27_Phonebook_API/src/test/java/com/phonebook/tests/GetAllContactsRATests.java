package com.phonebook.tests;

import com.phonebook.dto.AllContactsDto;
import com.phonebook.dto.ContactDto;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllContactsRATests extends TestBase{

    @Test
    public void getAllContactsSuccessTest() {
        AllContactsDto allContactsDto = given()
                .header(AUTH, token)
                .when()
                .get("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AllContactsDto.class);

        for (ContactDto contact: allContactsDto.getContacts()) {
            System.out.println(contact.getId() + " *** " + contact.getName());
            System.out.println("===========================================");
        }
    }

    /*  6866da77-66a8-4648-b159-e2823fab2a90 *** Oliver
        777c1551-e139-475b-bcf4-d0211cdc56ed *** Oliver  */
}
