# Unit Testing (Юнит-тестирование)

**Unit testing**, or **module testing**, is a process in programming that allows you to verify the correctness of individual modules of the source code of a program.

**Модульное тестирование**, или **юнит-тестирование** (*англ.* **unit testing**) — процесс в программировании, позволяющий проверить на корректность отдельные модули исходного кода программы.

The idea is to write tests for each non-trivial function or method. This allows you to quickly check whether a code change has led to regression, i.e., the appearance of errors in already tested parts of the program, and also facilitates the detection and elimination of such errors.

Идея состоит в том, чтобы писать тесты для каждой нетривиальной функции или метода. Это позволяет достаточно быстро проверить, не привело ли очередное изменение кода к регрессии, то есть к появлению ошибок в уже оттестированных местах программы, а также облегчает обнаружение и устранение таких ошибок.

## You Don't Have to Write Tests If (Не нужно писать тесты, если)

- You are creating a simple brochure website with 5 static HTML pages and one email submission form. The client is likely to be satisfied with this, and nothing more is needed. There is no significant logic involved, and it's faster to manually test everything.

  Вы делаете простой сайт-визитку из 5 статических html-страниц и с одной формой отправки письма. На этом заказчик, скорее всего, успокоится, ничего большего ему не нужно. Здесь нет никакой особенной логики, быстрее просто все проверить «руками»
- You are working on an advertising website, simple Flash games, or banners, which involve complex layouts, animations, or a large amount of static content. There is no logic here, only presentation.

  Вы занимаетесь рекламным сайтом/простыми флеш-играми или баннерами – сложная верстка/анимация или большой объем статики. Никакой логики нет, только представление
- You are developing a project for an exhibition. The timeframe is from two weeks to a month, and your system consists of a combination of hardware and software. At the beginning of the project, it's not entirely clear what the final outcome should be. The software will only run for 1-2 days at the exhibition.

  Вы делаете проект для выставки. Срок – от двух недель до месяца, ваша система – комбинация железа и софта, в начале проекта не до конца известно, что именно должно получиться в конце. Софт будет работать 1-2 дня на выставке
- You always write error-free code, have a perfect memory, and possess the gift of foresight. Your code is so cool that it modifies itself in line with client requirements. Sometimes the code even advises the client not to implement their requirements.

  Вы всегда пишете код без ошибок, обладаете идеальной памятью и даром предвидения. Ваш код настолько крут, что изменяет себя сам, вслед за требованиями клиента. Иногда код объясняет клиенту, что его требования не нужно реализовывать

**Tests are essential in test assignments. (Тесты очень нужно писать в тестовых заданиях.)**

In the first three cases, due to objective reasons (tight deadlines, budgets, vague goals, or very simple requirements), you won't gain any benefits from writing tests.

В первых трех случаях по объективным причинам (сжатые сроки, бюджеты, размытые цели или очень простые требования) вы не получите выигрыша от написания тестов.

Let's consider the last case separately. I know only one person like that, and if you don't recognize yourself in the photo below, then I have bad news for you.

Последний случай рассмотрим отдельно. Я знаю только одного такого человека, и если вы не узнали себя на фото ниже, то у меня для вас плохие новости.
![](https://github.com/ait-tr/cohort24/raw/8aeebe8206e129e6e4c2db178ca265283bbec1ed/basic_programming/lesson_47/img/63568c35676c4d929422ec8e42dd3563.jpg)

**Any long-term project without proper test coverage is destined to be rewritten from scratch sooner or later. (Любой долгосрочный проект без надлежащего покрытия тестами обречен рано или поздно быть переписанным с нуля.)**

Your tests should:

Ваши тесты должны:
- Be reliable

  Быть достоверными
- Not depend on the environment in which they are executed

  Не зависеть от окружения, на котором они выполняются
- Be easy to maintain

  Легко поддерживаться
- Be easy to read and understand (even a new developer should understand **what exactly** is being tested)

  Легко читаться и быть простыми для понимания (даже новый разработчик должен понять, **что именно** тестируется)
- Follow a unified naming convention

  Соблюдать единую конвенцию именования
- Be run regularly in automated mode

  Запускаться регулярно в автоматическом режиме

## Choose The Logical Arrangement of Tests in Your VCS (Выберите логическое расположение тестов в вашей СКВ)

Only this way. Your tests should be part of version control. Depending on the type of your solution, they can be organized differently.

Только так. Ваши тесты должны быть частью контроля версий. В зависимости от типа вашего решения, они могут быть организованы по-разному.

General recommendation:

Общая рекомендация:
- If the application is monolithic, place all tests in the `Tests` folder.

  если приложение монолитное, положите все тесты в папку `Tests`;
- If you have many different components, store tests in a folder for each component.

  если у вас много разных компонентов, храните тесты в папке каждого компонента.

## Choose a Naming Convention for Projects with Tests (Выберите способ именования проектов с тестами)

One of the best practices: add a test project for each project.

Одна из лучших практик: добавьте к каждому проекту его собственный тестовый проект.

Do you have parts of the system like `<PROJECT_NAME>.Core`, `<PROJECT_NAME>.Bl`, and `<PROJECT_NAME>.Web`? Then add `<PROJECT_NAME>.Core.Tests`, `<PROJECT_NAME>.Bl.Tests`, and `<PROJECT_NAME>.Web.Tests`.

У вас есть части системы `<PROJECT_NAME>.Core`, `<PROJECT_NAME>.Bl` и `<PROJECT_NAME>.Web`? Добавьте еще `<PROJECT_NAME>.Core.Tests`, `<PROJECT_NAME>.Bl.Tests` и `<PROJECT_NAME>.Web.Tests`.

## Use the Same Naming Convention for Test Classes (Используйте такой же способ именования для тестовых классов)

Do you have a class called `ProblemResolver`? Add a test project called `ProblemResolverTests`. Each testing class should test only one entity.

У вас есть класс `ProblemResolver`? Добавьте в тестовый проект `ProblemResolverTests`. Каждый тестирующий класс должен тестировать только одну сущность.

## Choose a "Speaking" Naming Convention for Test Class Methods (Выберите «говорящий» способ именования методов тестирующих классов)

`TestLogin` is not the best method name. What exactly is being tested? What are the input parameters? Can errors and exceptions occur?

`TestLogin` – не самое лучшее название метода. Что именно тестируется? Каковы входные параметры? Могут ли возникать ошибки и исключительные ситуации?

One _possible_ way to name methods is: `[Tested method]_[Scenario]_[Expected behavior]`.

Один из _возможных_ способов именования методов такой: `[Тестируемый метод]_[Сценарий]_[Ожидаемое поведение]`.

Предположим, что у нас есть класс `Calculator`, а у него есть метод `sum`, который должен складывать два числа.

Let's assume we have a class `Calculator`, and it has a method `sum` that should add two numbers.

In this case, our testing class will look like this:

В этом случае наш тестирующий класс будет выглядеть так:
```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public сlass CalculatorTests {

	@Test
  public void sumTwoPositiveIntegers() {
    // …
  }
}
```
This naming convention is self-explanatory. It serves as a specification for your code.

Такая запись понятна без объяснений. Это спецификация к вашему коду.

## Stick to a Consistent Style for Writing Test Bodies (Придерживайтесь единого стиля написания тела теста)

The **AAA** approach (arrange, act, assert) has proven to be excellent.

Отлично зарекомендовал себя подход **AAA** (arrange, act, assert - упорядочить, выполнить действие, сравнить результат).

Let's go back to the calculator example:

Вернемся к примеру с калькулятором:
```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

  @Test
  public void sumTwoPositiveIntegers() {
    // arrange
    Calculator calc = new Calculator();

    // act
    int res = calc.sum(2, 5);

    // assert
    assertEquals(7, res);
  }
}
```
This writing style is much easier to read than:

Такая форма записи гораздо легче читается, чем
```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

  @Test
	public void sumTwoPositiveIntegers() {
		assertEquals(7, new Calculator().sum(2, 5));
	}
}
```

## Test One Thing at a Time (Тестируйте одну вещь за один раз)

Each test should verify only one thing. If the process is too complex (e.g., a purchase on an online store), divide it into several parts and test them separately.

Каждый тест должен проверять только одну вещь. Если процесс слишком сложен (например, покупка в интернет магазине), разделите его на несколько частей и протестируйте их отдельно.

If you don't follow this rule, your tests will become unreadable, and soon you'll find it very difficult to maintain them.

Если вы не будете придерживаться этого правила, ваши тесты станут нечитаемыми, и вскоре вам окажется очень сложно их поддерживать.

# JUnit Framework (Фреймворк JUnit)

**JUnit** is one of the most popular frameworks used for testing code in **Java**.

**JUnit** - один из самых популярных фреймворков, используемых для тестирования кода в **Java**.

[Official website (Официальный сайт)](https://junit.org/junit5/)

[User guide (Руководство пользователя)](https://junit.org/junit5/docs/current/user-guide/)

[GitHub repository (Репозиторий на GitHub)](https://github.com/junit-team/junit5/)

[Text guide to set up in IntelliJ Idea (Текстовая инструкция по настройке IntelliJ Idea (на английском))](https://www.jetbrains.com/help/idea/junit.html)

[Video guide to set up in IntelliJ Idea (Видеоинструкция по настройке IntelliJ Idea (на английском))](https://www.youtube.com/watch?v=we3zJE3hlWE)

## Magic Imports (Волшебные импорты)

These two imports will prompt IntelliJ Idea to install JUnit for you:

Эти два импорта заставят IntelliJ Idea предложить вам установить JUnit:
```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
```
