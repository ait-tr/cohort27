package example05;

public class Box {
    private Figure3D[] figures; // массив фигур
    private int count; // сколько уже есть фигур

    public Box() {
        this.figures = new Figure3D[10];
        this.count = 0;
    }

    public void add(Figure3D figure) {
        this.figures[count] = figure;
        count++;
    }

    public double volume() {
        double result = 0;
        for (int i = 0; i < count; i++) {
            result = result + figures[i].volume();
        }

        return result;
    }
}
