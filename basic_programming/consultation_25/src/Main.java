/**
 * 8/24/2023
 * SimpleProject2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        UsersRepositoryFile usersRepositoryFile = new UsersRepositoryFile("users.txt");
        usersRepositoryFile.save(new User("Marsel", "Sidikov"));
        usersRepositoryFile.save(new User("Vika", "Vika"));
        usersRepositoryFile.save(new User("Dima", "Dima"));
    }
}
