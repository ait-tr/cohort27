package lesson_05.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CatSave {

    public static void main(String[] args) {

        try {
            File file = new File("cat.json");
            file.createNewFile();

            Owner owner = new Owner("Bob", "+111111");
            List<Food> food = List.of(
                    new Food("Hills", 4),
                    new Food("Purina", 5)
            );

            Cat cat = new Cat(3, "Чёрный", 4.56, owner, food);
            System.out.println("Созданный объект:");
            System.out.println(cat);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, cat);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}