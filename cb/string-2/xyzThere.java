public class xyzThere {
public boolean xyzThere(String str) {
boolean truth = false;

for (int i = 0; i < str.length() - 2; i++) {
  if (i == 0) {
    if (str.substring(i, i+3).equals("xyz")) {
      truth = true;
    }
  }
  
  else if (i > 0) {
if (str.substring(i, i+3).equals("xyz")
&&
!str.substring(i-1, i+3).equals(".xyz")) {
truth = true;
}
}
}
return truth;
}
}
