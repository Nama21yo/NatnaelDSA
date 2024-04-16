
public class TwoDimArray {
  static void  PrintRowSum(int[][] arr){
    int sumRow = 0;
    for(int i =0;i < arr.length;i++) {
      sumRow = 0;
      for(int j = 0;j < arr[i].length;j++) {
        sumRow += arr[i][j];
      }
      System.out.println("Sum of Row "+ (i+1) +" : " + sumRow);
    }
  }
  static void PrintColumnSum(int[][] arr) {
    int sumColumn = 0;
    for(int i = 0;i<arr[0].length;i++){
      sumColumn = 0;
      for(int j = 0;j < arr.length;j++){
        sumColumn += arr[j][i];
      }
      System.out.println("Sum of Column "+ (i+1) +" : " + sumColumn);
    }
  }
  static void maxinRow(int[] [] arr) {
    for(int i = 0;i<arr.length;i++){
      int max = arr[i][0];
      for(int j = 1;j < arr[0].length;j++){
        if(max < arr[i][j]){
          max = arr[i][j];
        }
      }
    System.out.println("Max of Row "+ (i+1) +" : " + max);
    }
  }

  public static void main(String[] args) {
    int[][] integers = {
      {1,10,3,8},
      {9,12,6,7},
      {5,2,11,4}
  };
    PrintRowSum(integers);
    System.out.println();
    PrintColumnSum(integers);
    System.out.println();
    maxinRow(integers);
  }
}
