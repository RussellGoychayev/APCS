/*
Russell Goychayev
APCS
HW08: Refactor Freshie Zero
2021-09-30
*/

/**
DISCOVERIES
Main function can call helper function. In this case, the main function calls greet.
UNRESOLVED QUESTIONS
Is there a way to make it randomly call out a name, rather than all three at once. 
*/

public class Greet {
	public static void greet(String input){
		System.out.printf("Why, hello there, %s. How do you do? \n", input);
	}
	public static void main(String[] args) {
		greet("Kevin");
		greet("Abdullah");
		greet("Russell");
	}
}
