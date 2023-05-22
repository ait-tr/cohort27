package example02;

public class Main {
    // обсудить геттерами
    public static void main(String[] args) {
        User u1 = new User("Marsel", 29);
        User u2 = new User("Ruslan", 41);
        User u3 = new User();
        User u4 = new User();
        User u5 = new User("", -10);

        System.out.println(u1.getName() + " " + u1.getAge());
        u1.makeOlder();
        System.out.println(u1.getName() + " " + u1.getAge());

//        u1.name = "Marsel";
//        u1.age = -10;
//
//        u2.name = "Ruslan";
//        u2.age = 41;
    }
}
