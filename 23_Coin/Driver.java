// Abdullah Faruque, Russell Goychayev (Team Bozos)
// APCS
// HW23: What Does Equality Look Like?
// 2021-10-23
// time spent- 1.0 hours

/*
DISCO: math.random is quite nice for probability. 
QCC:
*/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
        /*===================TOP==========================

      ====================BOTTOM======================*/

  }//end main()

}//end class
