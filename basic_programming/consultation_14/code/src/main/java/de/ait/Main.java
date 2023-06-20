package de.ait;

/**
 * 6/20/2023
 * simple-project
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    enum Type {
        CONFIRMED, NOT_CONFIRMED, CANCELED
    }

    public static void main(String[] args) {
        String value = "CONFIRMED";
        Type parsedType = Type.valueOf(value);
        System.out.println(parsedType);
    }
}
