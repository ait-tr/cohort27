package lesson_05.task_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;

public class CatSave {

    public static void main(String[] args) {

//        try {
//            File file = new File("cat.json");
//            file.createNewFile();
//
//            Cat cat = new Cat(3, "Чёрный", 4.56);
//            System.out.println("Созданный объект:");
//            System.out.println(cat);
//
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.writeValue(file, cat);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        File file = new File("cat.json");

        try (FileWriter writer = new FileWriter(file, true)) {

            file.createNewFile();

            Cat cat = new Cat(3, "Чёрный", 4.56);
            System.out.println("Созданный объект:");
            System.out.println(cat);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(writer, cat);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}