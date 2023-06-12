package example01;

import java.time.LocalDate;

/**
 * 6/12/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Attorney extends ExpirationDocument { // доверенность
    private String who; // кто доверяет
    private String whom; // на кого выписана доверенность

    // дата создания документа - текущая дата
    public Attorney(String name, String who, String whom, String expiredDate) {
        super(name); // вызов конструктора с одним параметром у предка
        this.who = who;
        this.whom = whom;
        this.expiredDate = LocalDate.parse(expiredDate);
    }

    public Attorney(String name, String who, String whom,
                    String createdDate, String expiredDate) {
        super(name, createdDate); // вызываю конструктор с двумя параметрами у предка
        this.who = who;
        this.whom = whom;
        this.expiredDate = LocalDate.parse(expiredDate);
    }

    public String getWho() {
        return who;
    }

    public String getWhom() {
        return whom;
    }

    public boolean isValid() {
        return super.isValid() && who != null && whom != null;
    }
}
