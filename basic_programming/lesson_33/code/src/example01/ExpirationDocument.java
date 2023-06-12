package example01;


import java.time.LocalDate;

/**
 * 6/12/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class ExpirationDocument extends Document { // документ, у которого есть срок действия

    protected LocalDate expiredDate; // когда заканчивается документ

    public ExpirationDocument(String name) {
        super(name);
    }

    public ExpirationDocument(String name, String createdDate) {
        super(name, createdDate);
    }

    public boolean isExpired() {
        // дата окончания документа до текущей даты
        return expiredDate.isBefore(LocalDate.now());
    }

    public boolean isValid() {
        // документ со сроком валидный когда дата окончания стоит после даты создания
        return expiredDate.isAfter(createdDate);
    }
}
