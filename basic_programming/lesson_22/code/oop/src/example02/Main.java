package example02;

public class Main {
    public static void main(String[] args) {
        Human marsel = new Human();
        marsel.stepsCount = 10;

        marsel.go();

        System.out.println(marsel.stepsCount); // 11

        Human vika = new Human();
        vika.stepsCount = 30000;
        vika.go();
        vika.go();

        System.out.println(vika.stepsCount); // 30 002
    }
}
