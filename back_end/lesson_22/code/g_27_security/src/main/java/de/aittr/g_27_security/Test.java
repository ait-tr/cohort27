package de.aittr.g_27_security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

    public static void main(String[] args) {

        // Получение зашифрованного пароля
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "qwe";
        System.out.println(encoder.encode(password));
    }
}