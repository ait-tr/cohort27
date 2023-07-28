import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbersList = new ArrayList<>();
    numbersList.add(4);
    numbersList.add(2);
    numbersList.add(7);
    System.out.println("до сортировки: " + numbersList);
    Collections.sort(numbersList); // сортировка in-place - меняется существующий список
    System.out.println("после сортировки: " + numbersList);

    int[] numbersArray = new int[3];
    numbersArray[0] = 4;
    numbersArray[1] = 2;
    numbersArray[2] = 7;
    System.out.println("до сортировки: " + Arrays.toString(numbersArray));
    Arrays.sort(numbersArray); // сортировка in-place - меняется существующий массив
    System.out.println("после сортировки: " + Arrays.toString(numbersArray));
  }
}
