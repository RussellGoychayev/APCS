/**Team Absent: Russell Goychayev
APCS
HW25 -- Do I repeat myself?
2021-10-26
time spent: 1.0
**/

/** 
DISCO
QCC
fenceR can only be run once because String fenceR is initialized outside of the fenceR method. 
However, I could not think of a way to initialize it inside of the method because it would lead to problems.
**/

/**
String fenceW(int numPosts) takes non-negative integer posts,
 and returns a String representation of a fence with the specified
 number of posts. Employs a while loop.

String fenceR(int numPosts) takes non-negative integer posts
, and returns a String representation of a fence with the specified number of posts. 
Employs recursion.
**/

public class Repeater {

public static String fenceW(int numPosts) {
String fenceW = "";

if (numPosts == 1) {
fenceW = "|";
}

if (numPosts > 1) {
int i = 1;
while (i < numPosts) {
i += 1;
fenceW += "--|"; 
}
fenceW = "|" + fenceW;
}
return fenceW;
}

public static String fenceR = "";
public static String fenceR(int numPosts) {

if (numPosts == 1) {
fenceR = "|" + fenceR;
}

else if (numPosts > 1 ) {
fenceR += "--|";
fenceR(numPosts - 1);
}
return fenceR;
}

public static void main(String[] args) {
System.out.println(fenceW(-1));
System.out.println(fenceW(1));
System.out.println(fenceW(3));
System.out.println(fenceR(-1));
System.out.println(fenceR(1));
System.out.println(fenceR(3));
}
}
