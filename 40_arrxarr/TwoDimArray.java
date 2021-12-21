/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

 /*****************************************************
   * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
   * APCS pd8
   * HW40 -- Demand A Raise
   * 2021-11-29
   * time spent - 0.7 hours
   *
   * Disco-
   * How to use for-each loops
   * The default value of an element of an int array is 0
   * QCC- ...
   *
   *****************************************************/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
  for (int x=0; x<a.length; x++){//for each array in the 2d array

    for (int y=0; y<a[x].length; y++){//for each element in said array
      System.out.print(a[x][y] + " " );//print that element
    }

    System.out.println();
  }
  System.out.println();
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] x: a){//for each array in the 2d array

      for (int y: x){//for each element in said array
        System.out.print(y + " ");//print that element
      }

      System.out.println();
    }
    System.out.println();
  }

  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum1 = 0;//total

    for (int[] x: a){//for each array in the 2d array

      for (int y: x){//for each element in said array
        sum1 += y;//add that element to the total
      }

    }
    return sum1;//return the total
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int sum2 = 0;//total

    for (int i=0; i<m.length; i++){//for every array in 2d array m
      //sum2 += sumRow(i, m); //add the sumRow of that array to the total
      sum2 += sumRow2(i, m);
    }

    return sum2;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sumRow = 0;//total

    for (int i=0; i < a[r].length; i++) {//for each element in array a[r]
      sumRow += a[r][i];//add that element to sumRow
    }

    return sumRow;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;

    for (int a: m[r]){//for each int in the array at index r of 2d array m
      summer += a;//add to total
    }

    return summer;
  }

  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      System.out.println("print1:");
      print1(m1);
      print1(m2);
      print1(m3);
      System.out.println("print2:");
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
