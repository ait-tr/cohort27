package example00;

/**
 * 6/23/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Марсель", 29, "Java");
        System.out.println(programmer.getLanguage());
        programmer.work();

        Student student = new Student("Вадим", 17);

//        Human human = programmer;
        Human human = student;
//        System.out.println(human.getLanguage());
//        human.work();
        if (human instanceof Programmer) {
            Programmer programmer1 = (Programmer) human; // нисходящее преобразование
        }

    }
}
