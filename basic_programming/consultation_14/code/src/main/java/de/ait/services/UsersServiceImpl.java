package de.ait.services;

import de.ait.models.User;
import de.ait.repositories.UsersRepository;

import java.util.List;

/**
 * 6/20/2023
 * simple-project
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersServiceImpl {

    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    /**
     * Возвращает количество пользователей без заказов
     * @return целое число - количество пользователей
     */
    public int countOfUsersWithoutOrders() {
        List<User> users = usersRepository.findAll();
        int result = 0;
        for (User user : users) {
            if (!user.isHasOrders()) {
                result++;
            }
        }

        return result;
    }
}
