# Lesson 28

## 01. Композиция - продолжение

* Разбор задачи об автобусе и водителе

```
Автобус
    number - номер
    driver - ссылка на водителя
    
    setDriver() - позволяет задать водителя
    
Водитель 
    name - имя
    experience - опыт
    bus - ссылка на автобус
    
    setBus() - позволяет задать автобус
    
Необходимо сделать так, чтобы у водителя был автобус, а у автобуса был водитель
и это были одни и те же люди и автобусы.

Как это обеспечить?

Мы хотим, чтобы когда водителю назначался автобус, автобусу автоматически
назначался этот водитель.

composition.Bus bus = new composition.Bus(...);
composition.Driver marsel = new composition.Driver(...);

marsel.setBus(bus); // мне надо, чтобы у автобуса был водитель Марсель

Надо правильно реализовать composition.Driver.setBus():

this.bus = bus; // кладем этот автобус этому водителю
this.bus.setDriver(this); // одновременно кладем автобусу нас самих (этого же водителя)

Надо правильно реализовать composition.Bus.setDriver():
this.driver.free(); // освобождаем предыдущего водителя
this.driver = driver; // задаем нового водителя
```

## 02. Статические члены классов

* `Статическое поле` - поле, указанное с модификатором static. Данное поле общее для всех объектов класса.
* Статическое поле - аналог глобальной переменной.
* К статическому полю следует обращаться через название класса (можно даже без создания объектов

* `Статический метод` - метод, который относится к классу, а не к объекту. Можно вызывать через название класса.
* Примерами статических методов могут быть методы класса `Math` и `Arrays`
* Для вызова статического метода не нужно создавать объект
* Статический метод может работать ТОЛЬКО со статическими полями.
* Статический метод может вызывать ТОЛЬКО статические методы текущего класса
* Их применяют если нужно реализовать функциональность, не трeбующую наличия объекта