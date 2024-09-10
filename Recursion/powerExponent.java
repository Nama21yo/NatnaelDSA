package Recursion;

public class powerExponent {
  private static int power(int base, int expo) {
    if(expo == 0) return 1;
    if(expo % 2 == 0) {
      // 2 ^ 8 = (2 * 2)^ 4
      return power(base * base, expo/2);
    } 
    // For odd
    // 2 ^ 9 = 2 * (2 * 2)^ 4
    return base * power(base * base, (expo - 1)/2);
  }
  public static void main(String[] args) {
    System.out.println(power(2,9));
  }
}
