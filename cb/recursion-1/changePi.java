public String changePi(String str) {
  int a = str.length();
  if (a > 2){
    //if there is a match, add "3.14" and go down two units
    if (str.substring(a-2, a).equals("pi")){
      return changePi(str.substring(0, a-2)) + "3.14";
    }
    //if there is not a match, add str and go down 1 unit
    else {
      return changePi(str.substring(0, a-1)) + str.substring(a-1, a);
    }
  }
  else {
    if (str.equals("pi")){
      return "3.14";
    }
    return str;
  }
}
