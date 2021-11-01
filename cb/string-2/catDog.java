public class catDog {

public int countX(String str, String X, int lenX) {
int XCounter = 0;

for (int i = 0; i < str.length() - (lenX - 1); i++) {
if (str.substring(i, i + lenX).equals(X)) {
XCounter +=1;
}
}
return XCounter;
}

public boolean catDog(String str) {
if (countX(str, "dog", 3) == countX(str, "cat", 3)) {
return true;
}
else {
return false;
}
}

}
