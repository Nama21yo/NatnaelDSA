package Sorting.MergeSort;

import java.util.Arrays;

class MergeSortRecursive {
  //! Divide and Conquer Algorithm
  static int[] mergeSort(int[] arr) {
    if(arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    // int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
    int[] left = new int[mid];

    for(int i = 0;i < mid;i++) {
      left[i]=arr[i];
    }
    left = mergeSort(left);

    // int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
    int[] right = new int[arr.length-mid];

    for(int i = 0;i < arr.length-mid;i++) {
      right[i]=arr[mid+i];
    }
    right = mergeSort(right);
    // System.out.println(Arrays.toString(left));
    // System.out.println(Arrays.toString(right));



    //Merge them
    return merge(left,right);
    
  }
   static int[] merge(int[] first, int[] second) {
      int[] mix = new int[first.length + second.length];

      int i = 0;
      int j = 0;
      int k = 0;

      while (i < first.length && j < second.length) {
        if(first[i] < second[j]) {
          mix[k] = first[i];
          i++;
          // k++;
        }
        else {
          mix[k] = second[j];
          j++;
          // k++;
        }
        k++;
      }

      //If one of the arrays isn't complete
      //We can use while loop
      //show in while loop and change it to for loop
      for(;i <first.length;i++) {
        mix[k] = first[i];
        k++;
      }
      for(;j<second.length;j++) {
        mix[k] = second[j];
        k++;
      }
      return mix;
  }
  public static void main(String[] args) {
    System.out.println("Merge Sort");
    int[] data = { 9, 5, 1, 4, 3 ,6};
  
    data = mergeSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
    
    System.out.println("Not adaptive and but Stable ");
    int[] arr2 = {1,2,3,4,5,6};
    arr2 = mergeSort(arr2);
    System.out.print(Arrays.toString(arr2));
  }
}
