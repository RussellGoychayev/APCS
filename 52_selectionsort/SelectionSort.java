/******************************
Nina Jiang // Miss Alpaca
APCS pd08
HW52 -- implementing selection sort
2022-01-05
time spent: 1 hrs

 * class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO: For selectionSortV algorithm, we found the smallest element and moved it to the beginning of the array. Then we found the next smallest element and repeated until data.size() - 1 passes have occured.
 *
 * DISCO: Compiling causes an "unsafe" warning.
 *        The ArrayList methods size and set can be used to change the value/element at a specific index.
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n - 1 passes are needed to sort n elements.
 * q1: What do you know after pass p?
 * a1: After pass p, we know p elements have been completely sorted.
 * q2: How do you know if sorted?
 * a2: n - 1 passes have occured.
 * q3: What does a pass boil down to?
 * a3: A pass is recursive. It finds the smallest in an array, the next smallest, and etc.
 ******************************/


import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class SelectionSort {

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data ) {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass--) {//pass through the array n-1 times,
    //  System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
      maxPos = pass;//setting the partition at every pass (from right to left because pass is decrementing)

      for(int i = pass - 1; i >= 0; i--) {//for every pass, "walk" one after the partition from right to left,
        if((int)data.get(i) > (int)data.get(maxPos)) {//checking to see if the
          maxPos = i;
        }

        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag

      }

      /* Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp); */

      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);

      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort




  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort



  public static void main( String [] args ) {

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );


/*
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    ArrayList glenSorted = selectionSort( glen );
    System.out.println( "sorted version of ArrayList glen:\n" + glenSorted );
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    ArrayList cocoSorted = selectionSort( coco );
    System.out.println( "sorted version of ArrayList coco:\n" + cocoSorted );
    System.out.println( "ArrayList coco after sorting:\n" + coco );
    System.out.println( coco );
*/

  }//end main

}//end class SelectionSort
