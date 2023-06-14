package example01;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {

    public static double getAreaOfFigures(Figure[] figures) {
        double area = 0;
        for (int i = 0; i < figures.length; i++) {
            area += figures[i].area(); // area = area + figures[i].area()
        }

        return area;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, 10, 15);
        Rectangle r2 = new Rectangle(1, 1, 12, 14);
        Ellipse e1 = new Ellipse(5, 1, 10, 12);
        Ellipse e2 = new Ellipse(5, 1, 14, 11);

        Figure[] array = {r1, r2, e1, e2};

        System.out.println(getAreaOfFigures(array));



    }
}
