
public class ArrayUtil {
//! Arrays
  public static void arraydemo() {
    int[] myArray = new int[5];//Declaration and Intialization
    myArray[0] = 5;//Adding Elements
    myArray[1] = 4;
    myArray[0] = 1;//Updating
    int n = myArray.length;//the length of array
    System.out.println(myArray[myArray.length-1]);//the last index  
    System.out.println(myArray);  
    int[] arr = {5,1,4,5};//We can do like this
    System.out.println(arr);  
  }
  //Printing elements of Array in Java
  public static void printArray(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n;i++) {
      System.out.print(arr[i] + " ");  //5 8 4 4 3 6 
    }
    System.out.println();
  }
  // Removing even integers in an Array 
  public static void oddOnly(int[] arr) {
    for(int i = 0; i<arr.length; i++) {
      if (arr[i] % 2 == 0) {
        continue;
      }
      System.out.print(arr[i] + " ");//? 5 3 This won't give an array remember
    }
    System.out.println();

    // Method 2

    int oddCount = 0;
    for(int i = 0;i<arr.length;i++) {
      if(arr[i] % 2 !=0) {
        oddCount++;
      }
    }

    int[] odds = new int[oddCount];
    int index = 0;
    for(int i = 0;i<arr.length;i++) {
      if(arr[i] % 2 != 0) {
        odds[index] = arr[i];
        index++;
      }
    } 
    System.out.println(odds);

  }
  //Reversing an Array
  public static int[] reverseArray(int[] arr) {//Void methods cannot return a value
    int[] reverse = new int[arr.length];
    int index = 0;
    for(int i = (arr.length-1); i >= 0; i--) {
      reverse[index] = arr[i];
      index++;
    }
    return reverse;
  }
  public static int[] reverseArrays(int[] arr, int start, int end) {//Void methods cannot return a value
      while(start<end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
      return arr;
  }
  //Finding a minimum value in an Array
  public static int  minimumElement(int[] arr) {
    //null
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Invalid Input");
    }
    int min = arr[0];
    for(int i = 1; i < arr.length;i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
  public static int  maximumElement(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Invalid Input");
    }
    int max = arr[0];
    for(int i = 1; i < arr.length;i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  //? Second Maximum Value
  public static int secondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i = 0;i < arr.length;i++) {
      if(max < arr[i]) {//5,8,4,4,3,6
        secondMax = max;
        max = arr[i];
      }
      else if(secondMax < arr[i] && max != arr[i]) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }
  //? Second Minimum 
  public static int secondMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    for(int i = 0;i < arr.length;i++) {//5,8,4,4,3,6
      if(min > arr[i]) {
        secondMin = min;
        min = arr[i];
      }
      else if(secondMin > arr[i] && min != arr[i]) {
        secondMin = arr[i];
      }
    }
    return secondMin;
  }
  //? Move all Zero's to end of an Array
  public static int[] moveZeros(int[] arr) {
    int[] end = new int[arr.length];
    int index1 = 0;
    int index2 = arr.length-1;
    for(int i = 0;i<arr.length;i++) {//5,8,0,0,0,6
      if(arr[i] != 0) {
        end[index1] = arr[i]; //5,8,6,0,0,0
        index1++;
      }
      else if(arr[i] == 0) {
        end[index2] = arr[i];    
        index2--;     
      }
    }
    return end;
  }
  //Method 2-Without adding another array
  public static void takeZeros(int[] arr) {
    int j = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i]!= 0 && arr[j]==0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
      }
      if(arr[j]!=0) {
        j++;
      }
    }
  }
  //!!! Resizing Array in Java
  public static int[] resize(int[] arr, int capacity) {
    int[] temp = new int[capacity];
    for(int i = 0;i<arr.length;i++) {
      temp[i] = arr[i];
    }
    return temp;
  }
  //!!! Finding a missing number in an Array
  public static int missingNumber(int[] arr) {
    int n = arr.length + 1;
    int sum = n*(n+1)/2;
    for(int num : arr) {
      sum = sum-num;
    }
    return sum;
  }
 //Palindrome String
  public static boolean isPalindrome(String word) {
    char[] charArray = word.toCharArray();
    int start = 0;
    int end = word.length()-1;
    while(start<end) {
      if(charArray[start] != charArray[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
  public static void main(String[] args) {
    ArrayUtil arrUtil = new ArrayUtil();
    arraydemo();
    printArray(new int[] {5,8,4,4,3,6});
    oddOnly(new int[] {5,8,4,4,3,6});
    //Reverse
    reverseArray(new int[] {5,8,4,4,3,6});
    printArray(reverseArray(new int[] {5,8,4,4,3,6}));
    //Reverse Method 2
    reverseArrays(new int[] {5,8,4,4,3,6}, 0, 5);
    printArray(reverseArrays(new int[] {5,8,4,4,3,6}, 0, 5));
    //Minimum
    minimumElement(new int[] {5,8,4,4,3,6});
    System.out.println(minimumElement(new int[] {0,7,-3,4,84,-2}));
    //Maximum
    maximumElement(new int[] {5,8,4,4,3,6});
    System.out.println(maximumElement(new int[] {0,7,-3,4,84,-2}));
    //Second Maximum
    secondMax(new int[] {5,8,4,4,3,6});
    System.out.println(secondMax(new int[] {0,7,-3,4,84,-2}));
    //Second Minimum
    secondMin(new int[] {5,8,4,4,3,6});
    System.out.println(secondMin(new int[] {0,7,-3,4,84,-2}));
    //Zeros at end
    moveZeros(new int[] {5,8,4,4,3,6});
    printArray(moveZeros(new int[] {5,8,0,0,0,6}));
    printArray(moveZeros(new int[] {5,136,0,0,0,-1,3276,-37}));
    //Zeros at end
    System.out.println(missingNumber(new int[] {1,2,3,5,6,7}));
    //Palindrome
    System.out.println(isPalindrome("noon"));
    System.out.println(isPalindrome("noon") ? "The String is palindrome" : "The String isn't Palindrome");

  }
  
}
