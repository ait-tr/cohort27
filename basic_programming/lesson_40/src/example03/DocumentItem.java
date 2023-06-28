package example03;

import java.time.LocalDateTime;

/**
 * 6/28/2023
 * cohort27
 *
 * Класс, который описывает один документ в нашем реестре
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class DocumentItem<T> {
    /**
     * Поле, которое хранит документ определенного типа
     */
    private T document;
    /**
     * Дата создания документа
     */
    private LocalDateTime createdAt;

    public DocumentItem(T document, LocalDateTime createdAt) {
        this.document = document;
        this.createdAt = createdAt;
    }
}
