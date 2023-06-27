package example02;

/**
 * 6/27/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryListImpl();
        UsersService usersService = new UsersService(usersRepository);
    }
}
