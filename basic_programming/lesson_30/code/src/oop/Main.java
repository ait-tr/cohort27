package oop;

public class Main {
    public static void main(String[] args) {
        System.out.println(User.currentUsersCount);
        User user = new User(29);
        user.aging();
        user.setAge(-10);
        System.out.println(user.getAge());
        User user2 = new User(41);
        User user3 = new User(35);
        System.out.println(User.currentUsersCount);
        User user4 = user3;
        user4.aging();
        System.out.println(user3.getAge());

    }
}
