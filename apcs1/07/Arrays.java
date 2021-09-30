public class Arrays{
  public static double[] powArray(double[] a, int n){
    double[] b = a;
    int x;
    for (x=0;x<a.length;x++){
      b[x] = Math.pow(a[x],n);
    }
    return b;
  }

  public static int indexOfMax(int[] a){
    int temp = 0;
    int x;
    for (x=1;x<a.length;x++){
      if (a[x] > a[temp]){
        temp = x;
      }}
      return temp;
  }
  /* No because enhanced for loops are
  bad when referring to indexes */
  public static boolean[] sieve(int n){
    int x;
    final boolean[] upToN = new boolean[n];
    for (x=0;x<n;x++){
      if (x % 2 != 0 &&
      x % 3 != 0 &&
      x % 5 != 0 &&
      x % 7 != 0){
        upToN[x] = true;
      }
  upToN[x] = false;
    }
    return upToN;
  }

}
