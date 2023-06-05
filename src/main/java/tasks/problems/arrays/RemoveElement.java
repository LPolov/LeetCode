package tasks.problems.arrays;

public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int res = nums.length;
    int i = 0;
    while (i < res) {
      if (nums[i] == val) {
        res--;
        nums[i] = nums[res];
      } else {
        i++;
      }
    }
    return res;
  }
}
