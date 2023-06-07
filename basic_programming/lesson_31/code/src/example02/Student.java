package example02;

public class Student extends Human {

    private double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        super(firstName, lastName);
        this.averageMark = averageMark;
    }

    public Student(double averageMark) {
        super("Иван", "Иванов");
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void go() {
        System.out.println("А я студент, хожу в университет!");
    }
}
