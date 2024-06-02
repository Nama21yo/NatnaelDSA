public class Euler1 {
  static int multipleOf3and5(int n) {
    int sum = 0;
    for(int i =1;i<n;i++) {
      if(i%3==0 || i%5==0){
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(multipleOf3and5(1000));
  }
}