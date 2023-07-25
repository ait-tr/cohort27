package example02;

/**
 * 7/25/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {

    public enum Role {
        ADMIN, USER, MANAGER
    }

    public enum State {
        NOT_CONFIRMED, CONFIRMED, BANNED, VERIFIED, NOT_VERIFIED, DELETED
    }

    public enum Color {

        GRAY("\033[0;37m"),
        RED("\033[0;31m"),
        BLUE( "\033[0;34m"),
        RESET("\033[0m");

        private final String color;

        private Color(String value) {
            this.color = value;
        }

        public String getValue() {
            return color;
        }
    }

    private String email;
    private String password;

    private Role role;

    private State state;

    private Color color;

    public User(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.state = State.NOT_CONFIRMED;
    }

    public Color getColor() {
        return color;
    }

    public String getEmail() {
        return email;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void confirm() {
        if (this.state.equals(State.NOT_CONFIRMED)) {
            this.state = State.CONFIRMED;
        } else {
            throw new IllegalStateException("Нельзя подтвердить пользователя" + this.state);
        }
    }

    public void verify() {
        if (this.state.equals(State.CONFIRMED)) {
            this.state = State.VERIFIED;
        } else {
            throw new IllegalStateException("Нельзя проверить пользователя: " + this.state);
        }
    }

    public void decline() {
        if (this.state.equals(State.CONFIRMED)) {
            this.state = State.NOT_VERIFIED;
        } else {
            throw new IllegalStateException("Нельзя проверить пользователя: " + this.state);
        }
    }

    public void delete() {
        if (this.state.equals(State.NOT_VERIFIED) || this.state.equals(State.VERIFIED)) {
            this.state = State.DELETED;
        } else {
            throw new IllegalStateException("Нельзя удалить пользователя: " + this.state);
        }
    }

    public void ban() {
        if (!this.state.equals(State.DELETED)) {
            this.state = State.BANNED;
        } else {
            throw new IllegalStateException("Нельзя забанить пользователя" + this.state);
        }
    }
}
