import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 8/24/2023
 * SimpleProject2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {
    private String firstName;
    private String lastName;

    private LocalDateTime createdDateTime;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDateTime = LocalDateTime.now();
    }

    User(String firstName, String lastName, LocalDateTime dateTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDateTime = dateTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}
