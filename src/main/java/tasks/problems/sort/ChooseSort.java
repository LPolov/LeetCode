package tasks.problems.sort;

public class ChooseSort {

  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int curr = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[curr] > arr[j]) {
          curr = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[curr];
      arr[curr] = tmp;
    }
    return arr;
  }
}
