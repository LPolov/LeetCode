package tasks.problems.sort;

public class InsertSort {

  public void sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int ind = i;
      int curr = arr[i];
      for (int j = i; j > 0 && arr[j - 1] > curr; j--, ind--) {
        arr[j] = arr[j - 1];
      }
      arr[ind] = curr;
    }
  }
}
