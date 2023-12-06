package de.aittr.g_27_rest_demo.repositories;

import de.aittr.g_27_rest_demo.domain.SimpleCat;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

@Repository
public class CatRepository implements CrudRepository<SimpleCat> {

    private File file = new File("cat.txt");
    private String delimiter = ";";

    @Override
    public SimpleCat save(SimpleCat obj) {
        return null;
    }

    @Override
    public SimpleCat getById(int id) {
        return null;
    }

    @Override
    public List<SimpleCat> getAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            return reader.lines() // stream of strings "1;3;black;4.56"
                    .map(line -> line.split(delimiter))
                    // "1;3;black;4.56" -> ["1", "3", "black", "4.56"]
                    .map(array -> new SimpleCat( // arrays -> cats
                            Integer.parseInt(array[0]),
                            Integer.parseInt(array[1]),
                            array[2],
                            Double.parseDouble(array[3])
                    ))
                    .toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<SimpleCat> cats = new CatRepository().getAll();
        System.out.println();
    }

    @Override
    public void deleteById(int id) {

    }
}