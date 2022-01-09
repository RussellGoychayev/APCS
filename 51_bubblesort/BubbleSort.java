// Russell Goychayev
// APCS pd8
// HW51 -- implementing bubblesort
// 2022-01-08
// time spent: 0.5 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Refer to comments
 *
 * DISCO
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: Then the ArrayList is already sorted.
 * q1: After pass p, what do you know?
 * a1: That p - 1 elements have been sorted.
 * q2: How many passes are necessary to completely sort?
 * a2: You need one pass less than the number of elements to completely bubble
 sort. My bubblesort can, in one pass, move an element from left to right up
 to n - 1 times, where n is the number of elements. However, in one pass,
 bubblesort can move an element from right to left only 1 time. This is because 
 after swapping two given elements, bubblesort does not check if the leftmost
 element is less than the element before the leftmost element. Instead,
 bubblesort continues indexing through the ArrayList. It's only during the next
 pass that bubblesort will check if said element is less than the element prior.
 This can be observed with a print statement for every pass.

 *
 ******************************/

import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
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
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data ) {
    for (int n = 0; n < data.size() - 1; n++){//Do the following n - 1 times (where n is the number of elements in data:
      for (int i = 0; i < data.size() - 1; i++){//Iterate through the array.
        if (data.get(i).compareTo(data.get(i + 1)) > 0) {//If a given Comparable is greater than the Comparable after it,
          Comparable temp = data.get(i);//swap them.
          data.set(i, data.get(i + 1));
          data.set(i + 1, temp);
          }
        }
      }
    }

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
    ArrayList<Comparable> bubbleSorted = new ArrayList<Comparable>();
    for (Comparable i : input){
      bubbleSorted.add( i );
    }
    bubbleSortV(bubbleSorted);
    return bubbleSorted;
  }

  public static void main( String [] args )
  {
System.out.println("==========for void methods==================");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
System.out.println("============================================");

    /*System.out.println("/n==========for AL-returning methods==========");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println("============================================");*/

  }//end main

}//end class BubbleSort
