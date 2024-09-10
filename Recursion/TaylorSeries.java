package Recursion;

public class TaylorSeries {
  // e ^ x = 1 + x / 1 + x ^ 2 / 2! + x ^ 3 / 3! + ... 
  // example e ^ 4
  // e (x,4) 
  // e(x ,3)
  // e (x , 2)
  // e(x,1)   p = p * x | f = f * n | 
  // e(x,0) = 1
  private static int e(int x, int n) {
    int p = 1, f = 1;
    int r;
    if(n == 0) return 1;
    else{
      r = e(x , n - 1);
      //after return
      p = p * x;
      f = f * (n);
      return r + p / f;
    }
  }
  int eps(int x, int n) {
    int s = 1;
    if(n == 0) return s;
    s = 1 + x/n * s;
    return eps(x,n-1);
  }
}
