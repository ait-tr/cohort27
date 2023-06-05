package oop;

class User {
    public static int currentUsersCount = 0;
    private int age;
    public User(int age) {
        increaseCurrentUsersCount();
        if (isCorrectAge(age)) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    private static void increaseCurrentUsersCount() {
        currentUsersCount++;
    }

    private boolean isCorrectAge(int age) {
        return age >= 0 && age <= 120;
    }
    public void aging() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isCorrectAge(age)) {
            this.age = age;
        }
    }
}