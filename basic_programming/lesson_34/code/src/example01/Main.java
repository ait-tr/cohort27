package example01;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        // Figure figure1 = new Figure(); // figure1 - объектная переменная
        // Figure figure2 = new Figure(10, 14); // figure2 - объектная переменная
        Figure figure;
        Rectangle rectangle = new Rectangle(1, 1, 10, 15);
        figure = rectangle;

//        figure1.move(5, 5);
//        figure2.move(6, 6);

        System.out.println(figure.area());
    }
}
