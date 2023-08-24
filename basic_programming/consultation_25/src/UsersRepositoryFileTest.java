import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

// тестируем класс, который сохраняет что-то в файл
class UsersRepositoryFileTest {

    // имя временного файла, с которым будет работать ваш класс
    private static final String TEST_FILE_NAME = "users_for_text.txt";

    // класс, который вы будете тестировать
    private UsersRepositoryFile usersRepository;

    // метод, который будет вызываться перед каждым тестом автоматически
    @BeforeEach
    public void setUp() throws Exception {
        // создаем объект для тестового файла
        File file = new File(TEST_FILE_NAME);
        // создаем сам файл (его точно нет, потому что мы потом его всегда удаляем)
        // если файл все-таки был
        if (file.exists()) {
            // мы его удалим
            file.delete();
        }
        // создадим заново
        file.createNewFile();
        // настраиваем наш класс на работу с тестовым файлом
        usersRepository = new UsersRepositoryFile(TEST_FILE_NAME);
    }

    @Test
    public void save() throws Exception {
        // создаем объект, который запишем в файл
        User user = new User("Marsel",
                "Sidikov",
                LocalDateTime.of(2000, 2, 2, 10, 0));
        // сохраняем объект в файл
        usersRepository.save(user);
        // смотрим, что находится в файле
        BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE_NAME));
        // считываем из этого тестового файла строку
        String userLine = reader.readLine();
        // проверяем эту строку с заранее заданной
        assertEquals("Marsel Sidikov 2000-02-02T10:00", userLine);
    }

    // данный метод выполняется после каждого теста
    @AfterEach
    public void tearDown() throws Exception {
        File file = new File(TEST_FILE_NAME);
        // удаляем созданный для теста файл
        file.delete();
    }
}