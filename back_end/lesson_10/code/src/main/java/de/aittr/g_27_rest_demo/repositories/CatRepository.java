package de.aittr.g_27_rest_demo.repositories;

import de.aittr.g_27_rest_demo.domain.Cat;
import de.aittr.g_27_rest_demo.domain.SimpleCat;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class CatRepository implements CrudRepository<Cat> {

    private File file = new File("cat.txt");
    private String delimiter = ";";
    private int currentId;

    public CatRepository() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> lines = reader.lines().toList();
            String lastLine = lines.get(lines.size() - 1);
            String[] linesArray = lastLine.split(delimiter);
            currentId = Integer.parseInt(linesArray[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cat save(Cat obj) {
        try (FileWriter writer = new FileWriter(file, true)) {
            obj.setId(++currentId);
            StringBuilder builder = new StringBuilder();
            builder.append(obj.getId())
                    .append(delimiter)
                    .append(obj.getAge())
                    .append(delimiter)
                    .append(obj.getColor())
                    .append(delimiter)
                    .append(obj.getWeight())
                    .append("\n");
            writer.write(builder.toString());
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cat getById(int id) {
        return getAll().stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cat> getAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            return new ArrayList<>(reader.lines() // stream of strings "1;3;black;4.56"
                    .map(line -> line.split(delimiter))
                    // "1;3;black;4.56" -> ["1", "3", "black", "4.56"]
                    .map(array -> new SimpleCat( // arrays -> cats
                            Integer.parseInt(array[0]),
                            Integer.parseInt(array[1]),
                            array[2],
                            Double.parseDouble(array[3])
                    ))
                    .toList());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Cat cat = new SimpleCat(777, 9, "рыжий", 9.87);
        new CatRepository().save(cat);
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
    }

    @Override
    public void deleteById(int id) {

    }
}