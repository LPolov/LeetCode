package tasks.problems.arrays;

import java.util.*;
import java.util.stream.IntStream;

public class TopKFrequentElements {

   public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> res = new HashMap<>();

      Integer count = 0;
      for (int i : nums) {
         count = res.get(i);
         res.put(i, count == null ? 1 : ++count);
      }

      PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(res::get).reversed());
      res.keySet().forEach(queue::offer);

      int[] result = new int[k];

      for (int i = 0; i < k; i++) {
         result[i] = queue.poll();
      }
      return result;
   }
}
