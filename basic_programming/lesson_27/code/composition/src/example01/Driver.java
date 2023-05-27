package example01;

public class Driver {
    private String name;
    private int experience;
    private Bus bus; // ссылка на автобус, которым будет управлять водитель

    public Driver(String name, int experience) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "NO_NAME";
        }

        this.setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    public void setBus(Bus bus) { // принимает на вход какой-то автобус bus, точнее ссылку на него
        if (bus != null) { // проверяем, что ссылка не пустая
            this.bus = bus; // кладем адрес объекта в поле this.bus
            this.bus.setDriver(this); // кладем автобусу водителя (нас самих)
        } else {
            System.err.println("Какой-то неправильный автобус :(");
        }
    }

    public void tellAbout() { // метод, который выводит в консоль информацию о водителе (о самом себе)
        System.out.print("Я водитель - " + name + ", мой опыт вождения - " + experience + ",");

        if (bus != null) { // если был автобус
            System.out.println(" мой автобус с номером " + this.bus.getNumber()); // выводим его номер
        } else {
            System.out.println(" у меня пока нет автобуса :("); // если не было, просто не обращаемся к нему
        }
    }

    public void drive() {
        if (bus != null) {
            System.out.println("Водитель " + name + " поехал");
            bus.go(); // вызвали у автобуса метод для того, чтобы он поехал
        } else {
            System.out.println(name + " : А автобуса нет!");
        }
    }
}
