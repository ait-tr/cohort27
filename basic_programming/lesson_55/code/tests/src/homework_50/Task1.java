package homework_50;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

  // Напишите программу, которая:
  //
  // - прочитает целое число из файла `res/in.txt`
  // - переведёт его в двоичную запись
  // - запишет его в файл `res/out.txt`
  //
  // Воспользуйтесь методом `Integer.toBinaryString()`.

  // Усовершенствуйте задачу так, чтобы путь к входному и выходному файлу она принимала
  // в качестве аргументов командной строки
  public static void main(String[] args) {
    // если аргументов не 2, то нам не передали имена файлов
    if (args.length != 2) {
      System.err.println("usage: program input_file output_file");
      System.err.println("использование: программа входной_файл выходной_файл");
      return;
    }
    String inputFileName = args[0]; // 1-й аргумент командной строки
    File inputFile = new File(inputFileName);
    Scanner scanner;
    try {
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      // у логов часто есть уровни: DEBUG, INFO, WARNING, ERROR, CRITICAL
      // логи ошибок: "УРОВЕНЬ: время: ошибка: ввод (причина): детали"
      System.err.println("Ошибка при чтении из файла: " + e.getMessage());
      return; // выход из программы
    }
    if (!scanner.hasNextInt()) {
      System.err.println(
          "Ошибка при чтении из файла: " + inputFileName + ": невозможно прочитать число");
      return; // выход из программы
    }
    int number = scanner.nextInt();
    scanner.close();

    String result = Integer.toBinaryString(number);

    String outputFileName = args[1]; // 2-й аргумент командной строки
    File outputFile = new File(outputFileName);
    try {
      FileWriter writer = new FileWriter(outputFile);
      writer.write(result + "\n");
      writer.close();
    } catch (IOException e) {
      System.err.println("Ошибка при записи в файл: " + e.getMessage());
    }
  }
}
