public class Task3BinarySearch {

  public static void main(String[] args) {
    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
    System.out.println(indexOf(numbers, 3));
  }

  private static int indexOf(int[] sortedArray, int target) {
    return binarySearch(sortedArray, target, 0, sortedArray.length - 1);
  }

  private static int binarySearch(int[] sortedArray, int target, int left, int right) {
    // базис рекурсии, выход из рекурсии
    if (left >= right) {
      if (left < sortedArray.length && sortedArray[left] == target) {
        return left;
      }
      return -1;
    }
    // шаг рекурсии
    // (left + right) / 2  -->  (left + right) - переполнение
    int mid = left + (right - left) / 2;
    int middle = sortedArray[mid];
    if (middle == target) {
      return mid;
    }
    if (middle < target) { // средний меньше цели -> цель справа
      // границы поиска: [mid + 1, right]
      return binarySearch(sortedArray, target, mid + 1, right);
    }
    // middle > target, можно не проверять
    // средний больше цели -> цель слева
    // границы поиска: [left, mid - 1]
    return binarySearch(sortedArray, target, left, mid - 1);
  }
}
