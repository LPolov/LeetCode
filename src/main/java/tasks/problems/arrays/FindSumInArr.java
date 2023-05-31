package tasks.problems.arrays;


public class FindSumInArr {

  /*
   * узнать существует ли в массиве непрерывный подмассив, сумма которого равна числу.
   * ћассив монотонно неубывающий и содержит только положительные числа
   **/
  public boolean exists(int[] arr, int sum) {
    int right = 0;
    int currSum = 0;

    for (int l = 0; l < arr.length; l++) {
      if (l > 0) currSum -= arr[l];

      while (right < arr.length && currSum + arr[right] <= sum) {
        currSum += arr[right];
        right++;
      }

      if (currSum == sum) return true;
    }
    return false;
  }

}
