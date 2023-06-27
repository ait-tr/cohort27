package example02;

/**
 * 6/27/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void deleteAll() {
        // куча другого кода
        this.usersRepository.clear();
    }
}
