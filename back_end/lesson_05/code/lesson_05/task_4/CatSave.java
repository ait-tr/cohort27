package lesson_05.task_4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class CatSave {

    public static void main(String[] args) {

        try {
            File file = new File("cat.xml");
            file.createNewFile();

            Owner owner = new Owner("Bob", "+111111");
            List<Food> food = List.of(
                    new Food("Hills", 4),
                    new Food("Purina", 5)
            );

            Cat cat = new Cat(3, "Чёрный", 4.56, owner, food);
            System.out.println("Созданный объект:");
            System.out.println(cat);

            JAXBContext context = JAXBContext.newInstance(Cat.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(cat, file);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}