# File Path (Путь к файлу)

The file path can be specified as either relative (relative to the working directory) or absolute (starting from the root directory of the file system).

Путь к файлу может быть записан как относительный (относительно рабочей директории) или абсолютный (начиная с корневой директории файловой системы).

In our solution, we will use relative paths.

Мы в решении задач будем использовать относительные пути.

In IntelliJ Idea, a relative path is considered "relative to the project folder."

Относительный путь в IntelliJ Idea считается "относительно папки проекта".

All our files will be placed in the `res` folder at the root of the project, so the path to the file will always look like `res/fileName`.

Все наши файлы мы будем класть в папку `res` в корне проекта, поэтому путь к файлу всегда будет выглядеть как `res/имяФайла`.

You can use the file path either as a string or by creating an object of the `File` class:

Путь к файлу можно использовать как в виде строки, так и создав объект класса `File`:
```java
File myFile = new File("res/test.txt");
```

# Reading Data from a File (Чтение данных из файла)

To read data from a file, we can also use the `Scanner` class in Java, which provides convenient methods for parsing different types of data from various sources, including files. Here's how to do it:

Для чтения данных из файла мы также можем использовать класс `Scanner` в Java, который предоставляет удобные методы для разбора различных типов данных из различных источников, включая файлы. Вот как это сделать:

1. Import the required classes:

   Импортируйте необходимые классы:
   ```java
   import java.io.File;
   import java.io.FileNotFoundException;
   import java.util.Scanner;
   ```

2. Create a `File` object to represent the file you want to read:

   Создайте объект `File`, который представляет файл, который вы хотите прочитать:
   ```java
   File myFile = new File("res/input.txt");
   ```

3. Create a `Scanner` object and pass the `File` object as an argument to the constructor:

   Создайте объект `Scanner` и передайте объект `File` в качестве аргумента в конструктор:
   ```java
   Scanner scanner;
   try {
     scanner = new Scanner(myFile);
   } catch (FileNotFoundException e) {
     // Handle the exception if the file is not found
     // Обработайте исключение, если файл не найден
   }
   ```

4. Now you can use the `Scanner` object to read data from the file. For example, you can read lines using the `nextLine()` method:

   Теперь вы можете использовать объект `Scanner` для чтения данных из файла. Например, вы можете читать строки с помощью метода `nextLine()`:
   ```java
   while (scanner.hasNextLine()) {
     String line = scanner.nextLine();
     // Process the line as needed
     // Обрабатывайте строку по мере необходимости
     System.out.println(line);
   }
   ```

5. Remember to close the `Scanner` after you're done reading the file to release resources:

   Не забудьте закрыть `Scanner`, когда вы закончите чтение файла, чтобы освободить ресурсы:
   ```java
   scanner.close();
   ```

The `Scanner` class simplifies reading data from files by providing methods to parse different types of data, like `nextInt()`, `nextDouble()`, etc., based on the data in the file. Additionally, it handles tokenization and parsing automatically, making it more convenient for reading structured data from files.

Класс `Scanner` упрощает чтение данных из файлов, предоставляя методы для разбора различных типов данных, таких как `nextInt()`, `nextDouble()` и т. д., на основе данных в файле. Кроме того, он автоматически обрабатывает токенизацию и разбор, что делает его более удобным для чтения структурированных данных из файлов.

However, keep in mind that if the file is not found (i.e., the file path is incorrect), a `FileNotFoundException` will be thrown, so it's essential to handle this exception properly in your code.

Однако имейте в виду, что если файл не найден (т. е. указанный путь к файлу неверен), будет выброшено исключение `FileNotFoundException`, поэтому важно правильно обработать это исключение в вашем коде.

Using the `Scanner` class is a straightforward and efficient way to read data from files in Java.

Использование класса `Scanner` - это простой и эффективный способ чтения данных из файлов в Java.

# Writing Data to a File (Запись данных в файл)

To write data to a file, we will use the `FileWriter` class:

Для записи данных в файл мы будем использовать класс `FileWriter`:
```java
FileWriter outputTxt = new FileWriter("res/output.txt");
```
When creating an object of this class:

При создании объекта этого класса:
- The specified file is automatically created if it does not exist.

  автоматически создаётся указанный файл, если его не было
- It throws a `FileNotFoundException` if the specified directory (folder) is missing.

  выбрасывается исключение `FileNotFoundException`, если отсутствует указанная директория (папка)
- The specified file is "cleared" if it already exists.

  "очищается" указанный файл, если он был
- If you want to open the specified file for "appending" - adding information to the end without touching existing information - you need to pass a second argument to the constructor (the argument is called `append`):

  если вы хотите открыть указанный файл для "дозаписи" - записи информации в конец, не трогая существующую информацию, то необходимо указать второй аргумент вызова (аргумент называется `append` - присоединение):
  ```java
  FileWriter outputTxt = new FileWriter("res/output.txt", true);
  ```

To write data to the file, use the `write()` method.

Для записи данных в файл используется метод `write()`.

This method writes the provided argument byte by byte.

Указанный аргумент он записывает побайтово.

So, to write information in a human-readable format, you need to pass a string ending with a newline character `\n`:

Поэтому для записи информации построчно в человеко-читаемом формате необходимо передавать внутрь строку, заканчивающуюся символом конца строки `\n`:
```java
int x = 42;
outputTxt.write(x + "\n");
```
If you try to write a number "as is":

При попытке записать число "как есть":
```java
int x = 65;
outputTxt.write(x);
```
The binary code corresponding to the number `65`, which corresponds to the character code of `A`, will be written to the file.

В файл будет записан двоичный код, соответствующий числу `65`, что соответствует коду символа `A`.

After writing, close the file using the command:

После записи файл необходимо закрыть командой:
```java
outputTxt.close();
```
If you end the program without closing the file, the "written" information may remain in the buffer and **disappear without being saved to the file**.

Если завершить программу без закрытия файла, "записанная" информация может остаться в буфере и **исчезнуть, не сохранившись в файле**.

## Warning (Предупреждение)

Opening the same file multiple times **for reading** is safe, but each `BufferedReader` will start from the beginning and have its own position in the file.

Открывать одновременно один и тот же файл несколько раз **для чтения** безопасно, но каждый `BufferedReader` будет начинать сначала и иметь собственную позицию в файле.

Opening the same file simultaneously for **reading and writing** (or for **writing** in multiple places) is **not allowed** - this will lead to unpredictable consequences.

Открывать один и тот же файл одновременно для чтения и **записи** (или в нескольких местах для **записи**) **нельзя** - это приведёт к непредсказуемым последствиям.

Make sure you open a "free" file for writing and close it immediately after writing.

Убедитесь, что вы открыли для записи "свободный" файл, и после записи тут же закройте его.

# Command-Line Arguments (Аргументы командной строки)

When running any program, additional arguments can follow the program name.

При запуске любой программы после названия программы могут идти дополнительные аргументы.

Example:

Пример:
```shell
git commit -m "Initial commit"
```

These arguments are passed to the `String[] args` array - the single argument of the `main()` method, through which the program is launched.

Именно эти аргументы попадают в массив `String[] args` - в единственный аргумент метода `main()`, через который запускается программа.

- Arguments are separated by spaces.

  Аргументы разделены пробелами.
- Text in quotes is considered a single argument.

  Текст в кавычках считается одним аргументом.
- The first argument (with index zero) is the name of the program itself.

  Первый (с индексом ноль) аргумент - имя самой программы.

In Java, the "zero" argument - the program name - **disappears**.

При этом "нулевой" аргумент - само название программы - в Java **пропадает**.

In the above example, if git were a program written in Java, the `String[] args` array would have a size of 3.

В приведённом выше примере, если бы git был программой, написанной на Java, массив `String[] args` был бы размера 3.

The array elements would be:

Состав массива:
- 0: `commit`
- 1: `-m`
- 2: `Initial commit`

You can check if there are any arguments using: `args.length > 0`.

Проверить наличие аргументов можно следующим образом: `args.length > 0`.

Command-line arguments are also called "launch parameters." They are usually used to run the program in a specific mode, such as allowing database editing or restricting it to viewing only.

Аргументы командной строки ещё называют "параметры запуска". Обычно они нужны для того, чтобы запустить программу в конкретном режиме -- например, разрешить возможность редактирования базы данных или оставить только просмотр.

Another use case is setting initial constants for the program.

Ещё один вариант использования - задание начальных констант программы.
