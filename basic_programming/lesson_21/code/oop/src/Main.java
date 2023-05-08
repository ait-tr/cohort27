public class Main {
    // вывести автомобиль с минимальным пробегом
    public static void main(String[] args) {
        // создали объект
        // Car - название типа (класс)
        // car1 - объектная переменная, содержит ссылку на объект (указатель), экземпляр класса (объект)
        // объектная_переменная.название_поля = значение;
        // 1. используем пустой конструктор, если хотим задать свои начальные значения для каждого нового объекта
        // 2. используем конструктор с параметрами, если хотим задать конкретные начальные значения для конкретного объекта
        // также конструктор позволяет контролировать значения, которыми мы инициализируем объект
        Car car1 = new Car();

        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.mileage);

        // задали значения полей
        car1.color = "Green";
        car1.model = "BMW";
        car1.mileage = 100;

        System.out.println(car1.color + " " + car1.model + " " + car1.mileage);

        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.mileage);

        Car car2 = new Car();

        car2.color = "Red";
        car2.model = "Mercedes";
        car2.mileage = 10;

        Car car3 = new Car("Audi", "Blue", -10);
        System.out.println(car3.mileage);

    }
}
