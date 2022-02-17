public int countHi(String str) {
  int a = str.length();
  if (a > 2){
    return countHi(str.substring(0, a-1)) + countHi(str.substring(a-2, a));
  }
  else {
    if (str.equals("hi")){
      return 1;
    }
    return 0;
  }
}
