public class arrays {
  //? Insertion
  static int insertend(int[] arr,int n,int capacity,int key) {
    arr[n]=key;
    return (n+1);
  }
  static int insertAnyPosition(int[] arr,int n,int key,int pos) {
    for(int i = n-1;i>=pos;i--) {
      arr[i+1]=arr[i];
    }
    arr[pos] = key;
    return (n+1);
  }
  static int insertSortedArray(int[] arr,int n,int key,int capacity) {
    int i;
    for(i = n-1;(i>=0 && arr[i]>key);i--){
      // if(arr[i]>key) {
        arr[i+1] = arr[i];
      // }
    }
    arr[i+1]=key;
    return (n+1);
  }

  public static void main(String[] args) {
    int[] arr = new int[20];
    arr[0] = 12;
    arr[1] = 16;
    arr[2] = 20;
    arr[3] = 40;
    arr[4] = 50;
    arr[5] = 70;
    int capacity = 20;//size of array
    int n = 6;//inputs
    int key = 26;//added element at end
    int pos = 2;//position

    System.out.print("Before Insertion: ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    //TODO- Inserting At the End
    System.out.print("\n After Insertionat End: ");
    // int newLength = insertend(arr, n, capacity, key);
    // for (int i = 0;i<newLength;i++) {
    //   System.out.print(arr[i] + " ");
    // }
    //TODO- Inserting At any Position
    System.out.print("\n After Insertion at any Position: ");
    // int newLengths = insertAnyPosition(arr, n, key, pos);
    // for(int i= 0;i<newLengths;i++) {
    //   System.out.print(arr[i] + " ");

    // }
    //TODO- Inserting in a sorted Array
    System.out.print("\n After Insertion in a sorted Array: ");
    int newLengthss = insertSortedArray(arr, n, key, capacity);
    for(int i= 0;i<newLengthss;i++) {
      System.out.print(arr[i] + " ");

    }

  }
}

class binarySearch {
  static int binarySearching(int[] arr,int start,int end, int key) {
    if(end < start) {
      return -1;
    }
    
    int mid = (start + end)/2;
    if(arr[mid] == key) {
      return mid;
    }
    if(key > arr[mid]) {
     return binarySearching(arr, (mid+1), end, key);
    }
    return binarySearching(arr, start, (mid-1), key);
  }
    public static void main(String[] args) {
      int arr[] = { 5, 6, 7, 8, 9, 10 };
      int n, key;
      n = arr.length - 1;
      key = 10;
      // int start = arr[0];
      // int end = arr[n];
      System.out.println("Index: "+ binarySearching(arr, 0, n, key));
    }
}

class FibonacciSearch {
    // Function to find the minimum of two elements
    public static int minimum(int x, int y)
    {
        return (x <= y) ? x : y;
    }
 
    /* Returns the index of x if present, else returns -1 */
    public static int fibonacciSearch(int arr[], int x,
                                      int n)
    {
        /* Initialize Fibonacci numbers */
        int fibMMm2 = 0; // (m-2)'th Fibonacci number
        int fibMMm1 = 1; // (m-1)'th Fibonacci number
        int fibM
            = fibMMm2 + fibMMm1; // m'th Fibonacci number
 
        /* fibM is going to store the smallest Fibonacci
        Number greater than or equal to n */
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }
 
        // Marks the eliminated range from the front
        int offset = -1;
 
        /* While there are elements to be inspected.
        Note that we compare arr[fibMm2] with x.
        When fibM becomes 1, fibMm2 becomes 0 */
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = minimum(offset + fibMMm2, n - 1);
 
            /* If x is greater than the value at index
            fibMm2,
            cut the subarray array from offset to i */
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }
 
            /* If x is less than the value at index fibMm2,
            cut the subarray after i+1 */
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }
 
            /* Element found. Return index */
            else
                return i;
        }
 
        /* Comparing the last element with x */
        if (fibMMm1 == 1 && arr[n - 1] == x)
            return n - 1;
 
        /* Element not found. Return -1 */
        return -1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 10, 22, 35, 40, 45,  50,
                      80, 82, 85, 90, 100, 235 };
        int n = 12;
        int x = 235;
        int index = fibonacciSearch(arr, x, n);
        if (index >= 0)
            System.out.print("Element found at index: "
                             + index);
        else
            System.out.print(
                x + " isn't present in the array");
    }
}
