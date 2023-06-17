package task24Star;

/**
 * 6/17/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        //34 56 32 19 10 16 15 11
        MyArray myArray = new MyArray();
        myArray.add(0);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.removeRange(6, 9);

        myArray.add(777);
    }
}
