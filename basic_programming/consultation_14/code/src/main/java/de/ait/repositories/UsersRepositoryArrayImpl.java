package de.ait.repositories;

import de.ait.models.User;

import java.util.Arrays;
import java.util.List;

/**
 * 6/20/2023
 * simple-project
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersRepositoryArrayImpl implements UsersRepository {
    @Override
    public List<User> findAll() {
        return Arrays.asList(new User(false),
                new User(true), new User(false));
    }
}
