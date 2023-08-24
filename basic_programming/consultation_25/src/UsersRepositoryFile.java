import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/**
 * 8/24/2023
 * SimpleProject2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersRepositoryFile {

    private final String fileName;

    public UsersRepositoryFile(String fileName) {
        this.fileName = fileName;
    }

    public void save(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(user.getFirstName() + " " + user.getLastName() + " " + user.getCreatedDateTime().toString());
            writer.newLine();
        } catch (IOException e) {
            throw new IllegalStateException("Проблема работы с файлами" + e.getMessage());
        }
    }
}
