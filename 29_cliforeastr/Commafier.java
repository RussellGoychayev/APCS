/** 
Russell Goychayev
APCS
HW29: Which Way Do You Roll?
11-2-21
time spent: 1.5

DISCO
- how to make these methods take negative ints
- int to String conversion
- String to int conversion
- learned what wrapper classes are
- learned how to code smart by making a skeleton then filling in
- how to initialize stuff when recursion

QCC
- none
**/

public class Commafier {

public static String commafyF(int n) {
String commafiedF = "";

if (n >=0 ) {
String oldF = ((Integer) n).toString();

if (oldF.length() >= 4) {
for (int i = oldF.length(); i >=4; i = i-3) {
commafiedF = "," + oldF.substring(i-3,i) + commafiedF;
}
commafiedF = oldF.substring(0, 1) + commafiedF;
}
if (oldF.length() < 4) {
commafiedF = ((Integer) n).toString();
}
}

else if (n < 0) {
String oldF = (((Integer) n).toString()).substring(1, (((Integer) n).toString()).length());//removes the negative sign

if (oldF.length() >=4) {
for (int i = oldF.length(); i >=4; i = i-3) {
commafiedF = "," + oldF.substring(i-3,i) + commafiedF;
}
commafiedF = oldF.substring(0, 1) + commafiedF;
}

else if (oldF.length() < 4) {
commafiedF = oldF;
}

commafiedF = "-" + commafiedF;
}

return (commafiedF);
}

    public static String commafyR(int n){
        String strN=Integer.toString(n);
        if (strN.length()<=3){
            return strN;
        } else {
            return commafyR(Integer.parseInt(strN.substring(0,strN.length()-3)))+","+strN.substring(strN.length()-3);
        }
    }

public static void main(String[] args) {
System.out.println(commafyF(-1000));
System.out.println(commafyF(-100));
System.out.println(commafyF(-1000000));

System.out.println(commafyR(1000));
System.out.println(commafyR(100));
System.out.println(commafyR(1000000));
}

}
