/***
class MergeSort
Implements mergesort on array of ints.

Summary of Algorithm:

1) halve "downwards"
2) merge "upwards"

- uses recursion
- see comments for more detail

***/

public class MergeSort
{
  /******************************************************
  * int[] merge(int[],int[])
  * Merges two input arrays
  * Precond:  Input arrays are sorted in ascending order
  * Postcond: Input arrays unchanged, and
  * output array sorted in ascending order.
  ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] bear = new int[a.length+b.length];
    int actr = 0;
    int bctr = 0;
    int i = 0;

    //3 possible cases:
    while (actr < a.length && bctr < b.length) {

      //case 1
      if (a[actr] > b[bctr]) {
        bear[i++] = b[bctr++];
      }

      //case 2
      else if (a[actr] == b[bctr]) {
        bear[i++] = a[actr++];
        bear[i++] = b[bctr++];
      }

      //case 3
      else {
        bear[i++] = a[actr++];
      }
    }

    //if a is "unexpired"
    if ( actr < a.length){
      while (actr < a.length){
        bear[i++] = a[actr++];
      }
    }

    //if b is "unexpired"
    else {
      while (bctr < b.length){
        bear[i++] = b[bctr++];
      }
    }

    return bear;
  }//end merge()*/

  /*//old version, works but is ugly
  {
    int[] bear = new int[a.length+b.length];
    int actr = 0;
    int bctr = 0;
    int i = 0;

    while (actr < a.length && bctr < b.length) {
      //three possible cases

      if (a[actr] > b[bctr]) {
        //case 1
        bear[i] = b[bctr];
        bctr++;
      }

      else if (a[actr] == b[bctr]) {
        //case 2
        bear[i] = a[actr];
        actr++;
        i++;
        bear[i] = b[bctr];
        bctr++;
      }

      else {
        //case 3 ( a[actr] < b[bctr] )
        bear[i] = a[actr];
        actr++;
      }

      i++;
    }

    if ( actr < a.length){
      for (int actr1 = actr; actr1 < a.length; actr1++){
        bear[i] = a[actr1];
        i++;
      }
    }

    else {
      for (int bctr1 = bctr; bctr1<b.length; bctr1++){
        bear[i] = b[bctr1];
        i++;
      }
    }

    return bear;
  }//end merge()
  */

  //old version, doesnt work
  /*{
    int[] bear = new int[a.length+b.length];
    int actr = 0;
    int bctr = 0;

    for (int i = 0; i < bear.length; i++){
      //5 real cases:
      if (actr < a.length && bctr < b.length){

        //case 1.1 (a[actr] > b[bctr])
        if (a[actr] > b[bctr]){
          bear[i] = b[bctr];
          bctr++;
        }

        //case 1.2 (a[actr] == b[bctr])
        else if (a[actr] == b[bctr]) {
          bear[i] = a[actr];
          actr++;
          i++;
          bear[i+1] = b[bctr];
          bctr++;
        }

        //case 1.3 (a[actr] < b[bctr])
        else {
          bear[i] = a[actr];
          actr++;
        }

      }
      else {

        //case 2.1 (actr >= a.length)
        if (actr >= a.length){
          bear[i] = b[bctr];
          bctr++;
        }

        //case 2.2 (bctr >= b.length)
        else {
          bear[i] = a[actr];
          actr++;
        }
      }
    }

    return bear;
  }//end merge()
*/
  /******************************************************
  * int[] sort(int[])
  * Sorts input array using mergesort algorithm
  * Returns sorted version of input array (ascending)
  ******************************************************/
  public static int[] sort( int[] arr )
  {
    //bob = first half of arr
    int[] bob = new int[(int)arr.length/2];

    //rob = second half of arr
    int[] rob;
    if (arr.length%2 == 0){//if even
      rob = new int[(int)arr.length/2];
    }
    else {//if odd
      rob = new int[( (int)arr.length/2 ) + 1];
    }

    //case 1
    if (arr.length > 1){

      //populate bob
      for (int b = 0; b < bob.length; b++){
        bob[b] = arr[b];
      }

      //populate rob
      for (int r = 0; r < rob.length; r++){
        //System.out.println(r);
        //System.out.println(rob.length);
        rob[r] = arr[r + rob.length - 1];
      }
    }

    //case 2
    else {
      return arr;
    }

    return merge( sort(bob), sort(rob) );
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
    a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
    System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
    int[] arr0 = {0};
    int[] arr1 = {1};
    int[] arr2 = {1,2};
    int[] arr3 = {3,4};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {4,3,2,1};
    int[] arr6 = {9,42,17,63,0,512,23};
    int[] arr7 = {9,42,17,63,0,9,512,23,9};
    int[] arrX = {1, 3, 3, 7};
    int[] arrY = {2, 3, 3, 3, 3, 3, 8};

    System.out.println("\nTesting mess-with-array method...");
    /*
    printArray( arr3 );
    mess(arr3);
    printArray( arr3 );

    System.out.println("\nTesting mess-with-array method...");
    printArray( arr7 );
    mess(arr7);
    printArray( arr7 );*/

    System.out.println("\nMerging arr1 and arr0: ");
    printArray( merge(arr1,arr0) );

    System.out.println("\nMerging arr4 and arr6: ");
    printArray( merge(arr4,arr6) );

    System.out.println("\nMerging arrX and arrY: ");
    printArray( merge(arrX,arrY));

    System.out.println("\nSorting arr4-7...");
    printArray( sort( arr4 ) );
    printArray( sort( arr5 ) );
    printArray( sort( arr6 ) );
    printArray( sort( arr7 ) );
  }//end main()

}//end class MergeSort
