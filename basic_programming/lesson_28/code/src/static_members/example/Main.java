package static_members.example;

public class Main {
    public static void main(String[] args) {
        Building b = new Building("1", "10");
        Building b2 = new Building("2", "10");

        b.income();
        b2.income();
    }
}
