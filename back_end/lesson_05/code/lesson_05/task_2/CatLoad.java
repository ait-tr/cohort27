package lesson_05.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CatLoad {

    public static void main(String[] args) {

        try {
            File file = new File("cat.json");

            ObjectMapper mapper = new ObjectMapper();
            Cat cat = mapper.readValue(file, Cat.class);

            System.out.println(cat);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}