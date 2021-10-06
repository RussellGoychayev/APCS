/*
Squids: (Humans:) Russell Goychayev and Eric He and (Duckies:) Bob and Bob II
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-06
*/

public class Greet {
  public static void main(String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib prichard = new BigSib();
    prichard.setHelloMsg("Salutations");

    greeting = prichard.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib brichard = new BigSib();
    brichard.setHelloMsg("Hey ya");

    greeting = brichard.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib qrichard = new BigSib();
    qrichard.setHelloMsg("Sup");

    greeting = qrichard.greet("mom");
    System.out.println(greeting);
}
}
