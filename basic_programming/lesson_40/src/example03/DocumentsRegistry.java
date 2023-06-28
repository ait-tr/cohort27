package example03;

import java.time.LocalDateTime;

/**
 * 6/28/2023
 * cohort27
 *
 * Реестр документов (хранилище)
 * Реестр может хранить документы ТОЛЬКО ОДНОГО ТИПА
 * Т.е. реестр не может хранить одновременно справки и лицензии
 * @author Marsel Sidikov (AIT TR)
 */
public class DocumentsRegistry<E> {
    public DocumentItem<E>[] items;
    public int count;

    public DocumentsRegistry() {
        this.items = new DocumentItem[10];
    }

    /**
     * Добавление нового документа в реестр
     * @param document добавляемый документ
     */
    public void add(E document) {
        DocumentItem<E> documentItem
                = new DocumentItem<>(document, LocalDateTime.now());

        items[count] = documentItem;
        count++;
    }
}
