public class doubleChar {

public static String doubleChar(String str) {
  String goober = "";
  for (int i = 1; i <= str.length(); i ++) {
    goober +=  str.substring(i-1, i) + str.substring(i-1, i);
  }
  return goober;
  }

public static void main (String[] args) {
System.out.println(doubleChar("The"));
System.out.println(doubleChar("AAbb"));
System.out.println(doubleChar("Hi-There"));
}
}
