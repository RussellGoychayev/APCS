/*
Nakib Abedin (Assisted by Alif Rahman for some questions)
APCS pd06
HW28-CodingBatMania
2021-10-31

Time Spent: 1.5 hours
*/

public class String {

  /*
  Given a string, return a string where for every char in the original, there are two chars
  */
  public String doubleChar(String str) {
  String output = "";
  for (int len = 0; len <= str.length()-1; len += 1){
    output += (str.substring(len, len+1)+str.substring(len, len+1));
  }
  return output;
}

/*
Return the number of times that the string "hi" appears anywhere in the given string.
*/

public int countHi(String str) {
  int counter=0;
  for (int i=0; i < str.length()-1; i++){
    String part = str.substring(i,i+2);
    if (part.equals("hi")){
      counter+=1;
    }
  }
  return counter;
}
/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.
*/

public static boolean xyzThere(String str) {
      for (int i = 0; i < str.length()-2; i ++) {
        if ((i == 0) && (str.substring(i, i+3).equals("xyz"))) {
          return true;
        }
        if ((str.substring(i, i+3).equals("xyz")) && !(str.substring(i-1, i+3).equals(".xyz"))) {
          return true;
        }
      }
      return false;
    }
}

//Assisted by Alif Rahman

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/
    public static boolean catDog(String str) {
      int catCtr = 0;
      int dogCtr = 0;
      boolean answer = false;
      for (int i = 0; i < (str.length()-2); i++) {
        if (str.substring(i,i+3).equals("cat")) {
          catCtr ++;
        }
        if (str.substring(i,i+3).equals("dog")) {
          dogCtr ++;
        }
      }
      if (catCtr == dogCtr) {
        answer = true;
      }
      return answer;
    }

//Assisted by Alif Rahman

public static int countCode(String str) {
      int answer = 0;
      for (int i = 0; i < str.length()-3; i++) {
        if (str.substring(i+3, i+4).equals("e") & str.substring(i, i+2).equals("co")){
          answer += 1;
        }
      }
      return answer;
}


public static boolean endOther(String a, String b) {
      a = a.toLowerCase();
      b = b.toLowerCase();
      int aLen = a.length();
      int bLen = b.length();
      if (aLen >= bLen && a.substring(aLen-bLen).equals(b)) {
        return true;
      }
      if (bLen > aLen && b.substring(bLen-aLen).equals(a)) {
        return true;
      }
      return false;
    }

  // Worked with Alif Rahman
