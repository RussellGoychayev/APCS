public int count7(int n) {
  if (n < 10){
    return n==7 ? 1 : 0;
  }
  return count7(n/10) + count7(n%10);
}
