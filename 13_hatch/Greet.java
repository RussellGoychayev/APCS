/*
Squids: Russell Goychayev and Eric He, Bob and Bob II
APCS
HW13: Where do BigSibs Come From?
2021-10-07
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
	
	BigSib joe = new BigSib("Salutations");
	
	greeting= joe.greet("Dr. Spaceman");
	System.out.println(greeting);
	
	BigSib mama = new BigSib("Hey ya");
	
	greeting= mama.greet("Kong Fooey");
	System.out.println(greeting);
	
	BigSib sky = new BigSib("sup");
	
	greeting= sky.greet("Mom");
	System.out.println(greeting);

  }
}
/**
DISCO

QCC
Is this necessarily better than hw12's way of doing things?
*/
