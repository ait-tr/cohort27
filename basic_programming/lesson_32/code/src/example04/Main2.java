package example04;

public class Main2 {

    // метод, принимает на вход массив людей
    // ему не важно, какие это люди
    // важно то, что можно у всех вызвать метод go
    // потому что этот метод есть у Human
    // а значит есть у всех потомков
    public static void goAll(Human[] humans) { // заставляет всех людей идти
        for (int i = 0; i < humans.length; i++) {
            humans[i].go(); // у каждого элемента массива вызываем go()
        }
    }

    public static void main(String[] args) {
        Human human = new Human("Andreas", 35);
        Developer developer = new Developer("Leonid", 52, "Java");
        Student student = new Student("Marsel", 29, 3.2);
        Blogger blogger = new Blogger("Eminem", 50, "RAP");

        // int[] a = {4, 2, 5, 6};
        Human[] humans = {human, developer, student, blogger};
        goAll(humans);
    }
}
