package tasks.problems.arrays;

import java.util.Comparator;
import java.util.TreeMap;

public class MaxSubsequenceScore {

  public long maxScore(int[] nums1, int[] nums2, int k) {
    TreeMap<Integer, Integer> pairs = new TreeMap<>(Comparator.comparingInt(int.class::cast).reversed());

    for (int i = 0; i < nums1.length; i++) {
      pairs.put(nums2[i], nums1[i]);
    }

    
    return 0;
  }
}
