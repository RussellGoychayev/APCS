public int countX(String str) {
  int a = str.length();
  if (a > 1){
    return countX(str.substring(0, a-1)) + countX(str.substring(a-1, a));
  }
  else {
    if (str.equals("x")){
      return 1;
    }
    return 0;
  }
}
