## Работа с boolean в тестах

```
public boolean isEmpty() {
    //...
}

@Test
public void testIsEmptyTrue() throws Exception {
    service.deleteAll();
    assertTrue(service.isEmpty());
}

@Test
public void testIsEmptyFalse() throws Exception {
    service.add("Hello!");
    assertFalse(service.isEmpty());
}
```

# На что писать тесты?

1. Выбираются критические участки - которые часто подвергаются рефакторингу, которые являются важными для бизнеса.
2. Нет разницы они `void` или `не void` - и то и то можно протестировать.
3. В void-методах можно протестировать "вызов" других методов:

```
При вызове у usersService метода deleteAll при этом должен быть вызван clear() у usersRepository 
```

