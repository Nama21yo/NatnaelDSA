public class MissingNumber {
  //!!! Finding a missing number in an Array
  public static int missingNumber(int[] arr) {
    int n = arr.length + 1;
    int sum = n*(n+1)/2;
    for(int num : arr) {
      sum = sum-num;
    }
    return sum;
  }
}