public String changeXY(String str) {
  int a = str.length();
  if (a > 1){
    return changeXY(str.substring(0, a-1)) + changeXY(str.substring(a-1,a));
  }
  else {
    if (str.equals("x")){
      return "y";
    }
    return str;
  }
}
