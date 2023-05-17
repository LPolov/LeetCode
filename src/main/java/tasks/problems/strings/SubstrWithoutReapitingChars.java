package tasks.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class SubstrWithoutReapitingChars {

  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> visited = new HashMap<>();
    String res = "";

    for (int start = 0, end = 0; end < s.length(); end++) {
      char curr = s.charAt(end);
      if (visited.containsKey(curr)) {
        start = Math.max(visited.get(curr) + 1, start);
      }

      if (res.length() < end - start + 1) {
        res = s.substring(start, end + 1);
      }
      visited.put(curr, end);
    }
    return res.length();
  }
}
