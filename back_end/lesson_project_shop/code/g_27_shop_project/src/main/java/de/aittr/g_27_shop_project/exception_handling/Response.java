package de.aittr.g_27_shop_project.exception_handling;

public class Response {

    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}