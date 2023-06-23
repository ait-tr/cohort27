## Task 36

```
Написать реализацию метода toString(int[] intArray) для массива целых чисел. Использовать StringBuilder. Иллюстрация того, как это должно работать: Arrays.toString()
```

## Task 36*

```
  исследуем нарушение симметрии equals():
  Создать класс Point2D c полями x,y: integer
  Переопределить метод equals()
  Унаследовать от Point2D класс ColorPoint2D
  - добавив поле color
  - Переопределить метод equals() в ColorPoint2D
  Создать объект a = new Point2D(x, y)
  Создать объект b = new ColoredPoint2D(x, y, "Red")
  Убедиться что a.equals(b), но !b.equals(a)
  Объяснить: почему?
```
