# Lesson 14

## 01. switch-case

* Синтаксический сахар над многократным `if-else-if`

* Обший синтаксис:

```java
switch (ПЕРЕМЕННАЯ) {
  case ЗНАЧЕНИЕ_1:
    // блок операций при значении_1
    break;
  case ЗНАЧЕНИЕ_2:
    // блок операций при значении_2
    break;
  case ЗНАЧЕНИЕ_3:
    // блок операций при значении_3
    break;
  default:
    // блок операций, если переменная не принимает ни одно из значений
}
```

## 02. Строки

* Строка - это класс (встроенный тип, ссылочный, как массив), по факту тип String содержит внутри себя массив символов
* Каждый экземпляр строки - объекты

### Операции над строками

* Строку можно явно превратить в массив символов:

```java
public char[] toCharArray()
```

```java
String word = "Marsel";
char[] letters = word.toCharArray();
```

* Строку можно создать на основе массива:

```java
char[] wordArray = {'h', 'e', 'l', 'l', 'o'};
String newWord = new String(wordArray);
```

* Можно получить отдельный символ в строке (в скобках указываем индекс, номер нужного символа):

```java
public char charAt(int index)
```

```java
char letter = word.charAt(2);
```

* Можно найти номер нужного символа (либо первого либо последнего):

```java
public int indexOf(int ch)
```

```java
String word = "Marsels";
int indexOfA = word.indexOf('A'); // -1
int indexOfS = word.indexOf('s'); // 3
int lastIndexOfS = word.lastIndexOf('s'); // 6
```

* Можно проверить, начинается ли строка с какой-то другой строки

```java
public boolean startsWith(String prefix) 
```

```java
String word = "Marsels";
boolean e = word.startsWith("Mar"); // true
boolean e1 = word.startsWith("Iva"); // false
```

* Можно проверить, кончается ли строка на какую-то другую строку

```java
String word = "Marsels";
boolean e1 = word.endsWith("aaa"); // false
```

* Можно проверить, содержится ли одна строка в другой

```java
public boolean contains(CharSequence s)
```

```java
String word = "Marsels";
boolean e = word.contains("sel"); // true
boolean e1 = word.contains("ers"); // false
```

* Получить длину строки

```java
public int length()
```

```java
String word = "Marsels";
System.out.println(word.length());
```

* Можно работать с регистром текста:

```java
System.out.println(word.toLowerCase()); // marsel
System.out.println(word.toUpperCase()); // MARSEL
```

## 03. String pool

* В целях экономии памяти, все явно заданные (литеральные) и совпадающие в коде строки идентифицируются как один объект с единственным адресом в памяти:

```java
String s1 = "Marsel";
String s2 = "Marsel";

System.out.println(s1 == s2); // true, поскольку s1 и s2 содержат адрес одного и того же объекта

String s3 = scanner.nextLine();
String s4 = scanner.nextLine();

System.out.println(s3 == s4); // false, поскольку s3 и s4 содержат ссылки на разные объекты строк, даже если сами строки одинаковые, их размещение в памяти определяется в момент работы программы, а не ее запуска
```

![image](https://raw.githubusercontent.com/ait-tr/cohort27/main/basic_programming/lesson_14/img/1.png)

## Словарик

* `contains` - содержится