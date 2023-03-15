import java.util.Scanner; // подключаем библиотеку для работы с вводом данных

public class MyClass {
    public static void main(String args[]) {
        Scanner s;
        s = new Scanner(System.in); // создаем сканнер для чтения данных
        
        String firstName = s.next(); // считываем слово из консоли
        String lastName = s.next();
        int age = s.nextInt();
        double height = s.nextDouble();
        s.nextLine(); // пустой вызов позволит перейти на новую строку
        String message = s.nextLine();
        String secondMessage = s.nextLine();

        System.out.println(firstName + ", " + lastName + ", " + age
        + ", " + height + ", message = " + message
        + ", second message = " + secondMessage);
        
        // Stdin Inputs Anna Klimenkova 18
        // Anna, Klimenkova, 18
    }
}
