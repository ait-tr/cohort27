package example04;

public class Student extends Human {
    private double averageMark;

    public Student(String name, int age, double averageMark) {
        super(name, age);
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void go() {
        System.out.println("Я - " + name +", безработный студент :( иду покушать. Но моя оценка - " + averageMark);
    }
}
