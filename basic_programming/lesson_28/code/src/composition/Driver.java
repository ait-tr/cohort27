package composition;

public class Driver {
    private String name; // имя водителя
    private int experience; // опыт водителя
    private Bus bus; // ссылка на автобус, которым будет управлять водитель

    public Driver(String name, int experience) { // конструктор водителя
        if (name != null) {
            this.name = name;
        } else {
            this.name = "NO_NAME";
        }

        this.setExperience(experience); // задаем возраст с помощью другого метода
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) { // метод для того, чтобы изменить опыт вождения
        if (experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    public void setBus(Bus bus) { // метод для того, чтобы задать водителю ссылку на автобус
        if (bus != null) { // если автобус ненулевой
            this.bus = bus; // кладем этот автобус этому водителю
            this.bus.setDriver(this); // просим автобус, который мы только что положили зафиксировать за собой водителя
        } else {
            System.err.println("Какой-то неправильный автобус :(");
        }
    }

    public void tellAbout() { // метод, который печатает в консоль информацию о водителе
        // выводим информацию о самом водителе
        System.out.print("Я водитель - " + name + ", мой опыт вождения - " + experience + ",");

        if (bus != null) { // если есть автобус у водителя
            // вывожу информацию о номере этого автобуса
            System.out.println(" мой автобус с номером " + this.bus.getNumber());
        } else {
            System.out.println(" у меня пока нет автобуса :(");
        }
    }

    public void drive() { // позволяет автобусу поехать
        if (bus != null) { // если автобус у водителя есть
            System.out.println("Водитель " + name + " поехал");
            bus.go(); // вызываем у этого автобуса метод go()
        } else {
            System.out.println(name + " : А автобуса нет!");
        }
    }

    public void free() { // освобождает водителя от автобуса
        System.out.println("Водитель " + name + " освобожден от управления " + this.bus.getNumber());
        this.bus = null;
    }
}
