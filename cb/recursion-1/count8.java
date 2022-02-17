public int count8(int n) {
  if (n%100 == 88){
    return 2 + count8(n/10);
  }
  else if (n < 10){
    if (n%10 == 8){
    return 1;
    }
    return 0;
  }

  return count8(n/10) + count8(n%10);
}
