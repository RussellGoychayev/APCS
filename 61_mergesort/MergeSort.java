/***
class MergeSort
Implements mergesort on array of ints.

Summary of Algorithm:

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
  /*
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
      for (int actr1 = actr; actr1<a.length; actr1++){
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
  {
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

  /******************************************************
  * int[] sort(int[])
  * Sorts input array using mergesort algorithm
  * Returns sorted version of input array (ascending)
  ******************************************************/
  public static int[] sort( int[] arr )
  {
    int[] bob = new int[ arr.length ];
    return bob;
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

    System.out.println("\nTesting mess-with-array method...");
    printArray( arr3 );
    mess(arr3);
    printArray( arr3 );

    System.out.println("\nMerging arr1 and arr0: ");
    printArray( merge(arr1,arr0) );

    System.out.println("\nMerging arr4 and arr6: ");
    printArray( merge(arr4,arr6) );
    /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
    System.out.println("\nSorting arr4-7...");
    printArray( sort( arr4 ) );
    printArray( sort( arr5 ) );
    printArray( sort( arr6 ) );
    printArray( sort( arr7 ) );
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
