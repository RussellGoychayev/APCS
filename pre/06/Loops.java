public class Loops{

  /* Exercise 3
  In Exercise 9 we wrote a recursive
  version of power, which takes a double
  x and an integer n and returns xn. Now
  write an iterative method to perform the
  same calculation. */
  public static double power(double x, int n){
    int a;
    double product = 0;
    if (n == 0){
      product = 1;
    }

    else if (n > 0){
      for (a = 1; a<n; a++){
        product = product * x;
      }}

    else if (n < 0) {
      for (a = 1; a<Math.abs(n); a++){
        product = product / x;
      }}

    return product;
  }

  /* Exercise 4
  Section 6.7 presents a recursive
   method that computes the factorial
    function. Write an iterative version
    of factorial. */

    public static int factorial(int x){
      int a;
      int answer = 1;
      if (x == 0){
        answer = 1;
      }
      else if (x > 0) {
        for (a = x; a > 0; a --){
          answer = answer * answer;
        }}
        return answer;
    }
      /* Exercise 5 */
      public static double myexp(double x, int n){
        int a;
        double answer = 0;
         for (a=n;a>0;a--){
           answer = answer + power(x, a) / factorial(a);
         }
         return answer;
      }
}
