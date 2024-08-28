// Deleting Elements in an Array when it is UnSorted
class deleteUnsorted {
  static int findElement(int arr[], int len, int element)
    {
        int i;
        for (i = 0; i < len; i++)
          if (arr[i] == element)
            return i; 
        return -1;
    }
  static int delete(int[] arr, int len,int element) {
    int position = findElement(arr,len,element);//2

    if (position == -1) {
            System.out.println("Element not found");
            return len;
    }
    
    for(int i = position;i<(len-1);i++) {
      arr[i] = arr[i+1];
    }
    return (len-1);
  }
  public static void main(String[] args) {
    System.out.println("Deleting Elements in Unsorted Array");
    int arr[] = { 10, 50, 30, 40, 20 };
    int len = arr.length;
    int deletedElement = 30;
    System.out.println("Array before deletion");
    for (int i = 0; i < len; i++)
      System.out.print(arr[i] + " ");
    
    len = delete(arr, len, deletedElement);
    System.out.println("\nArray after deletion");
    for (int i = 0; i < len; i++)
       System.out.print(arr[i] + " ");
  }
}
//Deleting Elements in an Array when it is Sorted
class deleteSorted {// Binary search
    static int binarySearch(int arr[], int low, int high,
                            int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }
 
    /* Function to delete an element */
    static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be deleted
        int pos = binarySearch(arr, 0, n - 1, key);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
 
        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }
 
    /* Driver Code */
    public static void main(String[] args)
    {
 
        int i;
        int arr[] = { 10, 20, 30, 40, 50 };
 
        int n = arr.length;
        int key = 30;
 
        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        // Function call
        n = deleteElement(arr, n, key);
 
        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
