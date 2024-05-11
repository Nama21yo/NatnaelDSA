package Sorting;

import java.util.Arrays;

class BubbleSort {
   static void bubbleSort(int array[]) {
    int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < (size-1); i++) {
    
      // check if swapping occurs
      boolean swapped = false;
      
      // loop to compare adjacent elements
      for (int j = 0; j < (size-i-1); j++) {

        // compare two array elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      // no swapping means the array is already sorted
      // so no need for further comparison
      if (!swapped)
        break;

    }
  }

  // 
  public static void main(String[] args) {      
      int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
      System.out.println("Bubble Sort-1");
      bubbleSort(arr); 
      System.out.println(Arrays.toString(arr));
      System.out.println("Bubble Sort-2");
      int[] arr2 = {1,2,3,4,5};
      bubbleSort(arr2); 
      System.out.print(Arrays.toString(arr2));
  }
}