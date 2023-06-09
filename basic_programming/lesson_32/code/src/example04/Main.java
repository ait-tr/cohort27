package example04;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Andreas", 35);
        Developer developer = new Developer("Leonid", 52, "Java");
        Student student = new Student("Marsel", 29, 3.2);
        Blogger blogger = new Blogger("Eminem", 50, "RAP");

        human.go();
        developer.go();
        student.go();
        blogger.go();

        Human h1, h2, h3, h4;

        h1 = human;
        h2 = developer;
        h3 = student;
        h4 = blogger;

        blogger.saySomething();
//        h4.saySomething();

        // developer - Я домой не иду
        // human - Я человек, иду домой
        developer.go(); // Я домой не иду
        h2.go();// Я домой не иду
        blogger.go(); // Я человек, иду домой
        h4.go(); //  Я человек, иду домой

        developer.go(25);
//        h2.go(100);
    }
}
