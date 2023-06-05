package task26;

public class Channel {
    private Program[] programs; // набор программ
    private int countOfPrograms; // количество добавленных программ

    public Channel() {
        this.programs = new Program[10]; // создаем массив для максимум 10 программ
    }

    public void addProgram(Program program) { // метод для добавления программы

    }

    public void showProgram() { // метод для демонстрации случайной программы
        // TODO: определить номер случайной программы и напечатать название этой программы
        int randomNumber = 5;
        System.out.println(programs[randomNumber].getName());
    }
}
