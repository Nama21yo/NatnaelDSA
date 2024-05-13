package LabExercise.Package6;

import java.util.Arrays;

public class deleteUnsorted {
  static int deleteElement(int[] arr,int index) {
    int position = index;//2
    int len = arr.length;
    if (position < 0 || position >= len) {
            System.out.println("Invalid Index");
            return len;
    }
    
    for(int i = position;i<(len-1);i++) {
      arr[i] = arr[i+1];
    }
    return (len-1);
  }
  public static void main(String[] args) {
    System.out.println("Deleting Elements in Unsorted Array");
    int arr[] = { 3, 7, 1, 9, 4 };
    int len = arr.length;
    int deletedindex = 2;
    System.out.println("Array before deletion");
    for (int i = 0; i < len; i++)
      System.out.print(arr[i] + " ");
    System.out.println(Arrays.toString(arr));

    
    
    len = deleteElement(arr, deletedindex);
    System.out.println("\nArray after deletion");
    for (int i = 0; i < len; i++)
       System.out.print(arr[i] + " ");
    System.out.println(Arrays.toString(arr));

  }
}
