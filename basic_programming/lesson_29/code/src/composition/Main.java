package composition;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator(5);
        UsersService usersService = new UsersService(validator);
        usersService.signUp("sidikov.m@gmaik.com", "qwer");
    }
}