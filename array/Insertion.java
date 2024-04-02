class Insertend {
  //Inserting Elements in an Array at the End
  static int insertEnd(int arr[],int len,int size,int addedElement) {
    if(len >= size)
      return len;
    
    arr[len] = addedElement;
    return (len+1);
  }
}
class insertAnyPosition {
  // Inserting Elements in an Array at any Position
  static int insertPos(int arr[],int len,int position,int addedElement){
    for(int i = len; i>=position;i--) {
      arr[i]=arr[i-1];
    }
    arr[position]=addedElement;
    return (len+1);
  }
}
// Inserting Elements in a Sorted Array
class insertSortedArray {
  static int insertSort(int arr[],int len,int size,int addedElement) {
    int j;
    for(j = len; (j >= 0 && arr[j-1] > addedElement);j--) {
      arr[j]=arr[j-1];
    }
    arr[j]=addedElement;
    return (len+1);
  }
}

public class Insertion {
  public static void main(String[] args) {
    System.out.println("This part talks about  Insertion");
    int size = 15;
    int[] arr = new int[size];
    arr[0] = 12;
    arr[1] = 16;
    arr[2] = 20;
    arr[3] = 40;
    arr[4] = 50;
    arr[5] = 70;
    int addedElement = 26;
    int len = 6;
    int position = 2;
    System.out.print("Before Insertion: ");
      for (int i = 0; i < len; i++)
    System.out.print(arr[i] + " ");
    // //TODO- Inserting At the End
    // System.out.print("\nAfter Insertion at End: ");
    // Insertend end = new Insertend();
    // int newLength = end.insertEnd(arr, len, size, addedElement);
    // for (int i = 0;i<newLength;i++) {
    //   System.out.print(arr[i] + " ");
    // }
    // //TODO- Inserting At any Position
    // System.out.print("\nAfter Insertion at any Position: ");
    // insertAnyPosition any = new insertAnyPosition();
    // int newLengths = any.insertPos(arr, len, position, addedElement);
    // for(int i= 0;i<newLengths;i++) {
    //    System.out.print(arr[i] + " ");
    // }
    //TODO- Inserting in a sorted Array
    System.out.print("\nAfter Insertion in a sorted Array: ");
    insertSortedArray sorted = new insertSortedArray();
    int newLengthss = sorted.insertSort(arr, len, size, addedElement);
    for(int i = 0;i<newLengthss;i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
