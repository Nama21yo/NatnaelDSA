package Recursion;

// When writing recursive methods, you must have an if statement somewhere to force the method to return without the recursive call being executed. If you don’t do this, once you call the method, it will never return. This is a very common error in working with recursion. Use println( ) statements liberally during development so that you can watch what is going on and abort execution if you see that you have made a mistake.
// Here is one more example of recursion. The recursive method printArray( ) prints the first i elements in the array values.
class RecTest {
  int[] array;

  RecTest(int i) {
    array = new int[i];
  }

  void printArray(int i) {
    if(i == 0) return; // base case
    printArray(i-1);
    System.out.println("[" + (i-1) + "] " + array[i-1]);
  }
}
class Recursion2 {
  public static void main(String[] args) {
    RecTest ob = new RecTest(10);
    int i;
    for(i=0; i<10; i++) ob.array[i] = i;
    
    ob.printArray(10);
  }
}
//  [0] 0
//  [1] 1
//  [2] 2
//  [3] 3
//  [4] 4
//  [5] 5
//  [6] 6
//  [7] 7
//  [8] 8
//  [9] 9