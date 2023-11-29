package app.test;

public class Main {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB(classA);
        classA.setClassB(classB);
    }
}