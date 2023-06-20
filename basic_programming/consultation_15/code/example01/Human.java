package example01;

/**
 * 6/20/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {
    private int age;
    private boolean isWork;

    private String name;

    public Human(int age, boolean isWork, String name) {
        this.age = age;
        this.isWork = isWork;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWork() {
        return isWork;
    }

    @Override
    public String toString() {
        return "Human(" + "age - " + age + ", isWork - " + isWork + ")";
    }

    @Override
    public boolean equals(Object obj) {
        // 1. проверим, а не передали ли нам null
        if (obj == null) {
            return false;
        }
        // 2. проверим, а не передали ли нам тот же самый объект
        if (this == obj) {
            return true;
        }
        // 3. проверим, а передали ли нам объект того же типа, что и у нас
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // теперь мы уверены, что нам передали другой ненулевой объект нашего же класса
        // нисходящее преобразование
        // от предка к потомку - можно делать только тогда, когда мы точно уверены какой там тип
        Human that = (Human) obj;
        // сравниваем отдельные поля
        return this.age == that.age &&
                this.isWork == that.isWork &&
                this.name.equals(that.name);
    }
}
