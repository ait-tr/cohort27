# Lesson 27

## 01. Композиция

* Отношение между классами - когда один класс может включать в себя экземпляр другого класса.

## Методы доступа

* геттер - получение значения поля

```
public int getAge () {
    return age;
}
```

* сеттер - для изменения значения поля

```
public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else this.age = 0;
}
```

* Если вы хотите, чтобы поле нельзя было менять на протяжении жизни программы - просто не делаем сеттер

## Как реализовать "Композицию"

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_27/img/1.png)

```
class A {
    private B b;
    
    public void setB(B b) {
        this.b = b;
    }
    
    public void method() {
        this.b.someMethod();
    }
}

class B {
    public void someMethod() {
    }
}

A a1 = new A();
B b1 = new B();

a1.setB(b1);

a1.method();
```

