package Sorting;

import java.util.Arrays;

class SelectionSort {
  static void selectionSort(int[] arr) {
    int i,j,k;
    for( i = 0;i<arr.length - 1;i++) {
      for(j = i+1,k =i;j<arr.length;j++) {
          if(arr[j] < arr[k]) {
            k = j;
          }
      }
      int temp = arr[i];
      arr[i] = arr[k];
      arr[k] = temp;
    }
  }

  public static void main(String args[]) {
  int[] data = { 9, 5, 1, 4, 3 };
  
  selectionSort(data);
  System.out.println("Sorted Array in Ascending Order: ");
  System.out.println(Arrays.toString(data));
  
  System.out.println("Not adaptive and Stable ");
  int[] arr2 = {1,2,3,4,5};
  selectionSort(arr2);
  System.out.print(Arrays.toString(arr2));
}
}
