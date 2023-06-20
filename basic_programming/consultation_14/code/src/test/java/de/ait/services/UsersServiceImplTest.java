package de.ait.services;

import de.ait.repositories.UsersRepositoryArrayImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceImplTest {

    private UsersServiceImpl usersService;

    @BeforeEach
    public void setUp() {
        this.usersService = new UsersServiceImpl(new UsersRepositoryArrayImpl());
    }

    @Test
    public void testGetCountUsersWithoutOrders() {
        int actual = usersService.countOfUsersWithoutOrders();
        int expected = 2;
        assertEquals(expected, actual);
    }
}