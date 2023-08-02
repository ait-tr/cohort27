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
  public static void main(String[] args) {
    String inputFileName = "res/in.txt";
    File inputFile = new File(inputFileName);
    Scanner scanner;
    try {
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      // у логов часто есть уровни: DEBUG, INFO, WARNING, ERROR, CRITICAL
      // логи ошибок: "УРОВЕНЬ: время: ошибка: ввод (причина): детали"
      System.err.println("Ошибка при чтении из файла: " + inputFileName + ": " + e.getMessage());
      return; // выход из программы
    }
    // TODO чтение данных из scanner
    scanner.close();

    String result = "";
    // TODO перевод в двоичную систему

    String outputFileName = "res/out.txt";
    File outputFile = new File(outputFileName);
    try {
      FileWriter writer = new FileWriter(outputFile);
      // TODO запись данных в writer
      writer.close();
    } catch (IOException e) {
      System.err.println("Ошибка при записи в файл: " + outputFileName + ": " + e.getMessage());
    }
  }
}
