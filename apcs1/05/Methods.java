/*Write a program named Methods.java
with methods that solve exercises 2, 3,
and 8 from Chapter 6 in Think Java.*/

public class Methods {
  public static Boolean isDivisible(int n, int m){
    if (n % m == 0) {
      return true;
    }
    return false;
    }

  public static Boolean isTriangle(int a, int b, int c){
    if (a + b < c) {
      return false;
    }
    else if (b + c < a) {
      return false;
    }
    else if (a + c < b) {
      return false;
    }
    return true;
  }

  public static int ackermann(int m, int n) {
    if (m == 0) {
      return n + 1;
    }
    else if (m > 0 && n == 0) {
      return ackermann(m-1,1);
    }
    else if (m > 0 && n > 0) {
      return ackermann(m-1,ackermann(m,n-1));
    }
    return -1;
  }
}
