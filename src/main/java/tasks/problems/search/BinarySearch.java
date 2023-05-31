package tasks.problems.search;

public class BinarySearch {

  public int search(int[] arr, int el) {
    if (arr == null || arr.length == 0) {
      return -1;
    }

    int l = 0;
    int r = arr.length - 1;
    int mid;

    while (l <= r) {
      mid = l + (r - l) / 2;

      if (arr[mid] == el) {
        return mid;
      }

      if(arr[mid] > el) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return -1;
  }
}
