package Sorting;

import java.util.Arrays;

class InsertionSort {
  static void insertionSort(int[] arr) {
    for(int i = 1;i < arr.length;i++) {
      int j = i-1;
      int key = arr[i];

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while(j>=0 && (arr[j] > key)) {
        arr[j+1]=arr[j];
        j--;
      }
      // Place key at after the element just smaller than it
      arr[j+1] = key;
    }
  }
  public static void main(String args[]) {
  int[] data = { 9, 5, 1, 4, 3 };
  
  insertionSort(data);
  System.out.println("Sorted Array in Ascending Order: ");
  System.out.println(Arrays.toString(data));
  
  int[] arr2 = {1,2,3,4,5};
  insertionSort(arr2);
  System.out.print(Arrays.toString(arr2));
}
}
