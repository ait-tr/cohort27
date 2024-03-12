package com.phonebook.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static final String token = "";

    public static final String AUTH = "Authorization";

    @BeforeMethod
    public void init() {
        RestAssured.baseURI = "https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath = "v1";
    }
}
