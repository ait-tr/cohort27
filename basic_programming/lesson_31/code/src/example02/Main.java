package example02;

public class Main {
    public static void main(String[] args) {
        Human marsel = new Human("Marsel", "Sidikov");

        marsel.setAge(29);
        marsel.wakeUp();
        marsel.setMarried(true);

        System.out.println("Марсель спит - " + marsel.isSleep() );
        System.out.println("Марсель женат - " + marsel.isMarried());
        System.out.println(marsel.getAge());
        System.out.println(marsel.getFirstName() + " " + marsel.getLastName());

        Developer kenan = new Developer("Kenan", "Iusibovi", "1011010111");
        kenan.setAge(27);
        kenan.goToSleep();
        kenan.setMarried(true);
        kenan.setExperience(15);

        System.out.println("Кенан спит - " + kenan.isSleep());
        System.out.println("Кенан женат - " + kenan.isMarried());
        System.out.println(kenan.getAge());
        System.out.println(kenan.getFirstName() + " " + kenan.getLastName());

        Student ustinya = new Student("Ustinya", "Petrova", 5.0);
        Student ivan = new Student(4.5);
        ivan.setAge(19);
        ivan.setMarried(true);

        marsel.go();
        kenan.go();
        ustinya.go();

    }
}
