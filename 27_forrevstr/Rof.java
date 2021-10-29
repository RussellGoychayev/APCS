/**
Team Absent: Russell Goychayev
APCS
HW27: FOR the Love of Strings
2021-10-28
time spent: 0.0
**/

public class Rof{
	
public static String fenceF(int posts) {
String fenceF = "";		
for(int i=1;i<posts;i++) {
fenceF += "|--";
}
return fenceF + "|";
}

public static String reverseF(String s){
String reverseF = "";
for(int i=s.length();i>0;i--) {
reverseF += s.substring(i-1,i);
}
return reverseF;
}

public static String reverseR(String input){
String reverseR = "";
if (input.length() == 1) {
return input;
}
else {
reverseR = input.substring(input.length() - 1) + reverseR(input.substring(0, input.length() - 1));
}
return reverseR;
}

public static void main(String[] args){
System.out.println(reverseF(fenceF(3)));
System.out.println(reverseF("Mykolyk"));
System.out.println(reverseR("stressed"));
System.out.println(reverseR(reverseR("stressed")));
	}
}
