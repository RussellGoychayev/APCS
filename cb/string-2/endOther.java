public class endOther {
public boolean endOther(String a, String b) {
  boolean truth = false;
  if (a.length() >= b.length()) {
  if (a.substring(a.length()-b.length(), a.length()).toLowerCase()
  .equals
  (b.toLowerCase())) {
    truth = true;
  }
  }
  
  if (b.length() >= a.length()) {
    if (b.substring(b.length()-a.length(), b.length()).toLowerCase()
  .equals
  (a.toLowerCase())) {
    truth = true;
  }
  }
  return truth;
}

}
