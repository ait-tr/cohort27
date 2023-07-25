package example02;

/**
 * 7/25/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        User marsel = new User("sidikov.marsel@gmail.com", "qwerty007", User.Role.ADMIN);
        User vadim = new User("vadim@gmail.com", "qwerty008", User.Role.USER);
        User kenan = new User("kenan@gmail.com", "qwerty009", User.Role.MANAGER);

//        marsel.confirm();
//        marsel.verify();
//        marsel.ban();
//        marsel.delete();

        marsel.setColor(User.Color.RED);

        System.out.println(marsel.getColor().getValue() + marsel.getEmail() + User.Color.RESET.getValue());
        marsel.setColor(User.Color.BLUE);
        System.out.println(marsel.getColor().getValue() + marsel.getEmail() + User.Color.RESET.getValue());
    }
}
