package tasks.problems.strings;

public class LongestSubsequence {

  public static void main(String[] args) {
    new LongestSubsequence().findLongestSubsequence("vestoploding", "asroplhus");
  }
  public void findLongestSubsequence(String str1, String str2) {
    int max = Math.max(str1.length(), str2.length());
    int[][] res = new int[str1.length()][str2.length()];
    for (int i = 0; i < str1.length(); i++) {
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i) == str2.charAt(j)) {
          res[i][j] = ++res[Math.max(0, i - 1)][Math.max(0, j - 1)];
        } else {
          res[i][j] = Math.max(res[i][Math.max(j - 1, 0)], res[Math.max(i - 1, 0)][j]);
        }
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }
}
