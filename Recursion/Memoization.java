// package Recursion;
// import java.util.Arrays;
// public class Memoization {
//   // find fib(10)
//   int n;
//   int[] memo;
//   Memoization(int n) {
//     n = this.n;
//     memo = new int[n];
//     Arrays.fill(memo,-1);
//   }
//   int fib(int n) {
//     if(n <= 1) {
//       memo[n] = n;
//       return n;
//     }  
//     else {
//       if(memo[n - 2] == -1) {   
//         memo[n - 2] = fib(n - 2);
//       }
//       if(memo[n - 1] == -1) {
//         memo[n - 1] = fib(n - 1);
//       }
//       return fib(n - 2) + fib(n - 1);
//     }
//   }
//   public static void main(String[] args) {
//     Memoization mz = new Memoization(10);
//     System.out.println(mz.fib(10));
//   }
// }
package Recursion;

import java.util.Arrays;

public class Memoization {
  // The value for Fibonacci to calculate
  private int n;
  // Memoization array to store computed Fibonacci values
  private int[] memo;

  // Constructor to initialize 'n' and the memo array
  Memoization(int n) {
    this.n = n;  // Corrected: Assigning the input parameter to the instance variable
    this.memo = new int[n + 1]; // Adjusting the size to n+1 to include fib(n)
    Arrays.fill(memo, -1); // Fill memo array with -1 to indicate uncalculated values
  }

  // Method to compute Fibonacci using memoization
  public int fib(int n) {
    if (n <= 1) {
      return n;
    }
    
    // If value already computed, return from memo array
    if (memo[n] != -1) {
      return memo[n];
    }

    // Otherwise, calculate and store the result in the memo array
    memo[n] = fib(n - 1) + fib(n - 2);
    return memo[n];
  }

  public static void main(String[] args) {
    int n = 10; // Fibonacci number to compute
    Memoization mz = new Memoization(n);
    System.out.println("Fibonacci of " + n + " is: " + mz.fib(n));
  }
}

