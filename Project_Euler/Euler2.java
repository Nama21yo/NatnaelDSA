public class Euler2 {
  // static int fibonacci(int num) {
  //   if (num == 0) {
  //     return 0;
  //   }
  //   if(num == 1 || num == 2) {
  //     return 1;
  //   }
  //   return fibonacci(num-1) + fibonacci(num -2); 
  // }

  static int evenFibonacci(int n) {

    int fibOne = 1;
    int fibLast = 2;
    int sum = fibLast;

    while (sum <= n) {
      int temp = fibOne;
      fibOne = fibLast;
      fibLast = fibLast + temp;

      if(fibLast % 2 == 0) {
        sum += fibLast;
      }

    }
    
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(evenFibonacci(4000000));
  }
}
