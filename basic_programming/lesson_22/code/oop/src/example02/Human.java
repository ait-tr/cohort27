package example02;

public class Human {
    // поле - количество шагов
    int stepsCount;
    // пустой конструктор
    Human() {
        stepsCount = 0;
    }

    // методы - функции и процедуры, которые объявлены внутри класса
    void go() {
        this.stepsCount++;
    }
}
