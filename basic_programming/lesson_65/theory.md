# Method References (Ссылки на методы)

In Java, method references provide a way to refer to methods or constructors of classes without invoking them. They are a concise way to express lambda expressions when those lambda expressions simply call a single method. Method references can make your code more readable and maintainable by reducing the verbosity of lambda expressions.

В Java ссылки на методы предоставляют способ обращения к методам или конструкторам классов без их непосредственного вызова. Это краткий способ выразить лямбда-выражения, когда эти выражения просто вызывают один метод. Ссылки на методы могут сделать ваш код более читаемым и поддерживаемым, уменьшая избыточность лямбда-выражений.

Method references are often used in functional programming and with the Java Streams API, where you frequently perform operations on collections of data.

Ссылки на методы часто используются в функциональном программировании и с Java Streams API, где часто выполняют операции над коллекциями данных.

There are four main types of method references:

Существует четыре основных типа ссылок на методы:

1. **Reference to a Static Method:** This type of method reference is used when you want to refer to a static method of a class.

   Ссылка на статический метод: Этот тип ссылки на метод используется, когда вы хотите обратиться к статическому методу класса.

   ```java
   // Lambda expression
   Function<Integer, Double> squareRoot = x -> Math.sqrt(x);
   
   // Method reference
   Function<Integer, Double> squareRootRef = Math::sqrt;
   ```

2. **Reference to an Instance Method of a Particular Object:** This type of method reference is used when you want to refer to an instance method of a specific object.

   Ссылка на метод экземпляра конкретного объекта: Этот тип ссылки на метод используется, когда вы хотите обратиться к методу экземпляра определенного объекта.

   ```java
   String str = "Hello, World!";
   
   // Lambda expression
   Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
   
   // Method reference
   Consumer<String> printUpperCaseRef = str::toUpperCase;
   ```

3. **Reference to an Instance Method of an Arbitrary Object of a Particular Type:** This type of method reference is used when you want to refer to an instance method of an object that will be passed later as an argument.

   Ссылка на метод экземпляра произвольного объекта определенного типа: Этот тип ссылки на метод используется, когда вы хотите обратиться к методу экземпляра объекта, который будет передан позже как аргумент.

   ```java
   // Lambda expression
   Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
   
   // Method reference
   Comparator<String> lengthComparatorRef = String::compareTo;
   ```

4. **Reference to a Constructor:** This type of method reference is used when you want to refer to a constructor of a class. It is often used in the context of creating instances through factories or builders.

   Ссылка на конструктор: Этот тип ссылки на метод используется, когда вы хотите обратиться к конструктору класса. Он часто используется в контексте создания экземпляров через фабрики или билдеры.

   ```java
   // Lambda expression
   Supplier<List<String>> listSupplier = () -> new ArrayList<>();
   
   // Method reference
   Supplier<List<String>> listSupplierRef = ArrayList::new;
   ```

Method references use the double colon (`::`) operator to separate the class or object from the method name. The method reference syntax is closely related to the concept of functional interfaces in Java, which are interfaces that have only one abstract method (like `Runnable`, `Consumer`, etc.).

Ссылки на методы используют оператор двойного двоеточия (::), чтобы отделить класс или объект от имени метода. Синтаксис ссылок на методы тесно связан с концепцией функциональных интерфейсов в Java, которые представляют собой интерфейсы, имеющие только один абстрактный метод (например, `Runnable`, `Consumer` и т. д.).

In summary, method references provide a more concise and readable way to express lambda expressions that call a single method. They are particularly useful in scenarios where you are working with functional interfaces, lambda expressions, and the Java Streams API.

В заключение, ссылки на методы предоставляют более краткий и читаемый способ выражения лямбда-выражений, вызывающих только один метод. Они особенно полезны в сценариях, где вы работаете с функциональными интерфейсами, лямбда-выражениями и Java Streams API.
