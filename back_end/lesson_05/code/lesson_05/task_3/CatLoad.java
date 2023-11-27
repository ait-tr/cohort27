package lesson_05.task_3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class CatLoad {

    public static void main(String[] args) {

        try {
            File file = new File("cat.xml");

            JAXBContext context = JAXBContext.newInstance(Cat.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object cat = unmarshaller.unmarshal(file);
            System.out.println(cat);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}