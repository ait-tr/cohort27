public class Main3 {

    public static Car findCarWithMinMileage(Car[] array) {
        // предполагаем, что первый элемент массива - это машина с минимальным пробегом
        Car min = array[0];
        // пробежаться по всем машинам, начиная с первой
        for (int i = 1; i < array.length; i++) {
            // посмотрим, не меньше ли пробег у i-ой машины по сравнению с той, которая min?
            if (array[i].mileage < min.mileage) {
                // если пробег i-ой машины меньше, следовательно, нужно ее сделать min
                min = array[i];
            }
        }
        // возвращаем машину с минимальным пробегом
        return min;
    }

    public static int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Car audi = new Car("Audi", "Blue", 100);
        Car bmw = new Car("BMW", "Red", 45);
        Car fiat = new Car("Fiat", "Grey", 400);
        Car renault = new Car("Renault", "Yellow", 10);
        Car mercedes = new Car("Mercedes", "Black", 50);
        Car ford = new Car("Ford", "White", 150);

        // явная инициализация массива
        Car[] cars = {audi, bmw, fiat, renault, mercedes, ford};

        Car minMileageCar = findCarWithMinMileage(cars);

        System.out.println(minMileageCar.color + " " + minMileageCar.model);

        System.out.println(cars.length);

    }
}
