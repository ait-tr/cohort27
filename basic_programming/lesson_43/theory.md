# Exceptions (Исключения)

In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. Exceptions are used to handle error conditions and exceptional situations that can occur during the runtime of a program. When an exception occurs, it is said to be "thrown."

В Java исключение - это событие, которое происходит во время выполнения программы и нарушает нормальный ход выполнения инструкций. Исключения используются для обработки ошибочных условий и исключительных ситуаций, которые могут возникнуть во время работы программы. Когда возникает исключение, говорят, что оно "выбрасывается".

Java provides a hierarchy of exception classes that are derived from the base class `java.lang.Exception`. This hierarchy allows you to catch exceptions at different levels of specificity, from broad categories like `Exception` to more specific exceptions like `NullPointerException` or `FileNotFoundException`.

Java предоставляет иерархию классов исключений, которые происходят от базового класса `java.lang.Exception`. Эта иерархия позволяет перехватывать исключения на разных уровнях специфичности, от широких категорий, таких как `Exception`, до более конкретных исключений, например `NullPointerException` или `FileNotFoundException`.

You can also create your own custom exception classes by extending the `Exception` class or one of its subclasses. This allows you to define and handle your own application-specific exceptions.

Вы также можете создавать собственные пользовательские классы исключений, расширяя класс `Exception` или один из его подклассов. Это позволяет вам определить и обрабатывать собственные исключения, специфичные для вашего приложения.

Exceptions are an important part of Java programming as they help in writing robust and fault-tolerant code by handling unexpected situations gracefully.

Исключения являются важной частью программирования на Java, так как они помогают создавать надежный и отказоустойчивый код, обрабатывая неожиданные ситуации грациозно.

# Checked and Unchecked Exceptions (Проверяемые и непроверяемые исключения)

In Java, there is a distinction between checked and unchecked exceptions.

В Java существует различие между проверяемыми (checked) и непроверяемыми (unchecked) исключениями.

![Exceptions Hierarchy (Иерархия исключений)](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_43/img/exceptions.jpeg)

## Checked Exceptions (Проверяемые исключения)

Checked exceptions are exceptions that must be declared in the method signature or handled explicitly using a `try`-`catch` block. These exceptions are typically used to represent recoverable conditions or expected errors that a method or block of code may encounter. The compiler enforces that these exceptions are either caught or declared to be thrown.

Проверяемые исключения - это исключения, которые должны быть объявлены в сигнатуре метода или обработаны явно с использованием блока `try`-`catch`. Эти исключения обычно используются для представления восстанавливаемых условий или ожидаемых ошибок, с которыми метод или блок кода может столкнуться. Компилятор обязывает перехватывать эти исключения или объявлять их в списке выброса.

Here's an example of a method that declares a checked exception:

Вот пример метода, который объявляет проверяемое исключение:

```java
public void readFile() throws IOException {
  // Код, который читает файл
}
```

In this example, the `readFile()` method declares that it can potentially throw an `IOException` by using the `throws` keyword. Any code that calls this method must either catch the exception or declare that it throws the exception as well.

В этом примере метод `readFile()` объявляет, что он может выбросить исключение `IOException`, используя ключевое слово `throws`. Любой код, вызывающий этот метод, должен либо перехватить исключение, либо сам объявить, что выбрасывает это исключение.

Checked exceptions are part of the method's contract, and they provide a way for the calling code to anticipate and handle potential exceptional situations.

Проверяемые исключения являются частью контракта метода и предоставляют возможность вызывающему коду предвидеть и обрабатывать потенциальные исключительные ситуации.

## Unchecked Exceptions (Unchecked Exceptions)

Unchecked exceptions, also known as runtime exceptions, do not need to be declared explicitly in the method signature or handled with a `try`-`catch` block. These exceptions represent programming errors or unexpected conditions that occur at runtime and are not meant to be recoverable. Unchecked exceptions are subclasses of `RuntimeException` or its subclasses.

Непроверяемые исключения, также известные как исключения времени выполнения (runtime exceptions), не требуют явного объявления в сигнатуре метода или обработки с помощью блока `try`-`catch`. Эти исключения представляют ошибки программирования или непредвиденные условия, которые возникают во время выполнения и не могут быть восстановлены. Непроверяемые исключения являются подклассами класса `RuntimeException` или его подклассов.

Here's an example of a method that throws an unchecked exception:

Вот пример метода, который выбрасывает непроверяемое исключение:

```java
public void divideNumbers(int a, int b) {
  if (b == 0) {
    throw new ArithmeticException("Деление на ноль");
  }
  // Код, выполняющий деление
}
```

In this example, if the value of `b` is zero, the method throws an `ArithmeticException`. Since this is an unchecked exception, the caller is not required to catch or declare it.

В этом примере, если значение `b` равно нулю, метод выбрасывает исключение `ArithmeticException`. Поскольку это непроверяемое исключение, вызывающий код не обязан перехватывать или объявлять его.

Unchecked exceptions provide a way to handle unexpected errors or bugs in the code. They indicate situations that should ideally be avoided through proper programming practices and validations.

Непроверяемые исключения предоставляют способ обработки непредвиденных ошибок или ошибок в коде. Они указывают на ситуации, которые лучше избегать путем правильных практик программирования и проверок.

To summarize, checked exceptions must be explicitly declared or handled, while unchecked exceptions do not require explicit handling. Checked exceptions are typically used for expected and recoverable errors, while unchecked exceptions represent programming errors or unexpected conditions.

Для подведения итога, проверяемые исключения должны быть явно объявлены или обработаны, в то время как непроверяемые исключения не требуют явной обработки. Проверяемые исключения обычно используются для ожидаемых и восстанавливаемых ошибок, в то время как непроверяемые исключения представляют ошибки программирования или непредвиденные условия.

# `Try`-`Catch`

Java provides a robust exception handling mechanism that allows you to catch and handle exceptions. The key concept in exception handling is the "`try`-`catch`" block. The `try` block encloses the code that might throw an exception, and the `catch` block catches and handles the thrown exception.

Java предоставляет надежный механизм обработки исключений, который позволяет перехватывать и обрабатывать исключения. Основной концепцией в обработке исключений является блок "`try`-`catch`". Блок `try` содержит код, который может вызвать исключение, а блок `catch` перехватывает и обрабатывает выброшенное исключение.

Here's a basic structure of a `try`-`catch` block:

Вот основная структура блока `try`-`catch`:

```java
try {
  // Код, который может вызвать исключение
} catch (ExceptionType1 e1) {
  // Код для обработки ExceptionType1
} catch (ExceptionType2 e2) {
  // Код для обработки ExceptionType2
} finally {
  // Код, который всегда выполняется, независимо от того, возникло исключение или нет
}
```

Let's break down this structure:

Разберем эту структуру:

1. The code inside the `try` block is the code that might throw an exception. If an exception occurs within the `try` block, the execution of the `try` block is immediately stopped, and the control is transferred to the appropriate `catch` block.

   Код внутри блока `try` - это код, который может вызвать исключение. Если исключение возникает внутри блока `try`, выполнение блока `try` немедленно прекращается, и управление передается соответствующему блоку `catch`.

2. The `catch` blocks specify the type of exception they can catch. If an exception of that type (or a subtype) is thrown within the `try` block, the corresponding `catch` block is executed. You can have multiple `catch` blocks to handle different types of exceptions.

   Блоки `catch` указывают тип исключения, которое они могут перехватить. Если исключение этого типа (или его подтип) возникает внутри блока `try`, выполняется соответствующий блок `catch`. Вы можете иметь несколько блоков `catch` для обработки разных типов исключений.

3. The `finally` block is optional. It contains code that is always executed, regardless of whether an exception is thrown or not. It is typically used to release resources or perform cleanup tasks.

   Блок `finally` является необязательным. Он содержит код, который всегда выполняется, независимо от того, было ли выброшено исключение или нет. Обычно он используется для освобождения ресурсов или выполнения задач по очистке.

When an exception is caught by a `catch` block, you can perform actions like printing an error message, logging the exception, or taking corrective measures to handle the exceptional situation. If no `catch` block matches the thrown exception type, the exception is propagated up the call stack until it is caught by an appropriate `catch` block, or if it reaches the top level of the program, the program terminates.

Когда исключение перехватывается блоком `catch`, вы можете выполнить действия, такие как вывод сообщения об ошибке, регистрация исключения или принятие корректирующих мер для обработки исключительной ситуации. Если ни один из блоков `catch` не соответствует типу выброшенного исключения, исключение передается вверх по стеку вызовов, пока оно не будет перехвачено соответствующим блоком `catch` или, если оно достигает верхнего уровня программы, программа завершается.
