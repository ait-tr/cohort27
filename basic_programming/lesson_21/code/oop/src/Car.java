public class Car {
    // поля, fields
    String model;
    String color;
    int mileage;

    Car() {
        this.model = "DEFAULT";
        this.color = "BLACK";
        this.mileage = 1;
    }

    Car(String model, String color, int mileage) {
        this.model = model;
        this.color = color;
        // проверяем, а не кладут ли в пробег отрицательное значение
        if (mileage >= 0) {
            // если со значением все ок
            // кладем его в поле
            this.mileage = mileage;
        } else {
            this.mileage = 0;
        }
    }
}
