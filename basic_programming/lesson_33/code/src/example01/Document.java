package example01;

import java.time.LocalDate;

/**
 * 6/12/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class Document {
    protected LocalDate createdDate; // дата выпуска документа
    private String name; // название документа

    public Document(String name) {
        this.name = name;
        this.createdDate = LocalDate.now(); // взяли текущую дату
    }

    public Document(String name, String createdDate) {
        this.name = name;
        this.createdDate = LocalDate.parse(createdDate); // дату можно передать как строку
    }

    public Document(String name, LocalDate createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public boolean isValid() {
        return true;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public String getName() {
        return name;
    }
}
