import java.util.Scanner;

public class Main2 {
    // считать информацию о машинах с консоли и сохранить в массив
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // создали массив из пяти объектных переменных
        Car[] cars = new Car[5];
        int count = 0;

        while (true) {
            // считали данные о машине
            String model = scanner.nextLine();
            String color = scanner.nextLine();
            int mileage = scanner.nextInt();
            scanner.nextLine();
            // создаем объект машины
            Car car = new Car(model, color, mileage);
            // кладем машину в массив
            cars[count] = car;
            count++;
        }
    }
}
