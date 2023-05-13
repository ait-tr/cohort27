package example_05;

// что нам нужно, чтобы записывать показания по температуре?
// массив, где бы мы это все дело хранили
public class TemperatureRegistry {
    private double[] temperatures; // массив, который хранит всю информацию о температурах

    private int count; // сколько всего записей было сделано

    // если я создаю реестр температур, а значит нужно выделить память под массив
    public TemperatureRegistry(int maxDaysCount) {
        this.temperatures = new double[maxDaysCount]; // выделение памяти
    }

    // сделаем возможность добавлять температуру
    // value - значение
    public void addTemperature(double value) {
        // проверяем, а не переборщили ли мы с записями
        if (count == temperatures.length) {
            System.err.println("Все записи уже сделаны!");
            // остановить выполнение addTemperature
            return;
        }

        if (value >= -93.2 && value <= 56.7) { // если температура адекватная
            // добавляем
            temperatures[count] = value; // кладем значение в массив
            count++; // увеличили количество значений
        } else {
            // ничего не делаем
            System.err.println("Странная температура - " + value);
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();
    }
}
