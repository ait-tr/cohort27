package de.aittr.g_27_shop_project.exception_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 2 способ - простановка аннотации непосредственно на классе исключения
// Минус - не позволяет отправить клиенту информативное сообщение
// Плюс - это глобальный обработчик и реагирует на исключения,
// выброшенные в любом классе проекта.
@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class SecondTestException extends RuntimeException {

    public SecondTestException(String message) {
        super(message);
    }
}