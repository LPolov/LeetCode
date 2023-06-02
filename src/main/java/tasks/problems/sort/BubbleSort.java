package tasks.problems.sort;

public class BubbleSort {

  public void sort(int[] arr) {
    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i + 1] < arr[i]) {
          isSorted = false;
          int tmp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = tmp;
        }
      }
    }
  }
}
