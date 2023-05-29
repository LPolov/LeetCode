package tasks.problems.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KthLargest {
  List<Integer> largestArr;
  int k;
  public KthLargest(int k, int[] nums) {
    Arrays.sort(nums);
    largestArr = new ArrayList<>();
    for (int i = nums.length - 1; i >= 0; i--) {
      largestArr.add(nums[i]);
    }
    if (largestArr.isEmpty()) {
      largestArr = init(k);
    }
    this.k = k;
  }


  public int add(int val) {
    for (int i = 0; i <= largestArr.size(); i++) {
      if (largestArr.size() == i) {
        largestArr.add(val);
        break;
      }
      if (largestArr.get(i) < val) {
        largestArr.add(i, val);
        break;
      }
    }
    return largestArr.get(k - 1);
  }

  private List<Integer> init(int k) {
    List<Integer> ints = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      ints.add(0);
    }
    return ints;
  }
}
