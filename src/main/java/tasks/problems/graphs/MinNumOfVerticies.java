package tasks.problems.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MinNumOfVerticies {

   public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
      int[] indegree = new int[n];
      for (List<Integer> vert : edges) {
         indegree[vert.get(1)]++;
      }

      List<Integer> result = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         if (indegree[i] == 0) {
            result.add(i);
         }
      }
      return result;
   }
}
