package LabExercise.Package1;


class MergeSortRecursive {
  static int[] mergeSort(int[] arr) {
    if(arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] left = new int[mid];

    for(int i = 0;i < mid;i++) {
      left[i]=arr[i];
    }
    left = mergeSort(left);

    int[] right = new int[arr.length-mid];

    for(int i = 0;i < arr.length-mid;i++) {
      right[i]=arr[mid+i];
    }
    right = mergeSort(right);



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
}

