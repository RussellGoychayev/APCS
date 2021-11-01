/**
NOTES

TWO STRINGS CAN HAVE THE SAME CONTENT BUT NOT THE SAME REFERENCE!!!
**/
public class countHi {

public static int countHi(String str) {
int hiCounter = 0;

for (int i = 0; i < str.length() - 1; i++) {
if (str.substring(i, i + 2).equals("hi")) {
hiCounter +=1;
}
}
return hiCounter;
}

public static void main(String[] args) {
System.out.println(countHi("abc hi ho"));
}

}
