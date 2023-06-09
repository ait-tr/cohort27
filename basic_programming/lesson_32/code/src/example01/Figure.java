package example01;

public class Figure {
    private final static String COLORS = "Red Green Yellow Black Blue";
    private final static String DEFAULT_COLOR = "Black";
    // координаты центра фигуры
    private int x;
    private int y;

    private String color; // null

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = DEFAULT_COLOR;
    }

    public void setColor(String color) {
        if (COLORS.contains(color)) { // проверяем, содержится ли строка color в строке COLORS
            this.color = color;
        } else {
            this.color = DEFAULT_COLOR;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}
