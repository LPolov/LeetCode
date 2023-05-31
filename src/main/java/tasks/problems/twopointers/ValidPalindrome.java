package tasks.problems.twopointers;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    if (s.isEmpty() || s.isBlank()) return false;
    s = s.toLowerCase();
    s = s.replaceAll("[^A-Za-z]", "");
    int l = 0, r = s.length() - 1;

    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}
