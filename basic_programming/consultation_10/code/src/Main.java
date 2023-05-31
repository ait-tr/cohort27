import repositories.UsersRepository;
import repositories.UsersRepositoryImpl;
import services.UsersService;

public class Main {
    public static void main(String[] args) {
        // хотим работать с именами пользователей,
        // но длина имени не может быть меньше 3
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt");
        UsersService usersService = new UsersService(usersRepository);

        System.out.println(usersService.findAll());
    }
}
