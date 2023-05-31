package composition;

public class Bus {
    private String number; // номер автобуса

    private Driver driver; // ссылка на водителя

    private Passenger[] passengers; // массив пассажиров
    private int count; // количество пассажиров в автобусе

    public Bus(String number) { // конструктор - принимает на вход какой-то номер
        if (number != null && !number.equals("")) { // проверка номера - он должен быть не null и не пустым
            this.number = number;
        } else {
            this.number = "NO_NUMBER";
        }
        this.passengers = new Passenger[5]; // выделили память на пять элементов массива
    }

    public String getNumber() {
        return number;
    } // метод для получения номера

    public void setDriver(Driver driver) { // метод для фиксации водителя
        if (this.driver != null) { // если предыдущий водитель был - освобождаем его от управления
            this.driver.free(); // освобождаем предыдущего водителя
        }
        this.driver = driver; // задаем нового водителя
    }

    public void go() { // метод, который заставляет ехать автобус, с сообщением об имени водителя
        if (driver == null) {
            System.err.println("Нет водителя!");
        } else {
            System.out.println("Автобус - " + number
                    + " в пути, под управлением - " + driver.getName());

            for (int i = 0; i < count; i++) {
                passengers[i].tellAbout();
            }
        }
    }

    public void addPassenger(Passenger passenger) {
        if (count < passengers.length) {
            this.passengers[count] = passenger;
            this.count++;
        } else {
            System.err.println("Мест нет!");
        }
    }
}
