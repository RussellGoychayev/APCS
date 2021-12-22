/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW43: Array of Steel
 * 2021-12-6
 * time spent - 0.5 hours
 *
 * Disco- in order to double length of an array, just make a new one, with double the length :o
 *
 * QCC- ...
 *
*/
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    /* YOUR IMPLEMENTATION HERE */
	_size = 10;
    _data = new int[_size];
    for (int i : _data) {
        _data[i] = 0;
    }
  }

  //output SuperArray in [a,b,c] format
  public String toString()
   {
    String str = "[";
    for (int element : _data) {
      str += element + ", ";
    }
    str = str.substring(0,str.length()-2) + "]";
    return str;
  }


  //double capacity of SuperArray
  private void expand()
   {
    int[] _newData = new int[2 * _data.length];
    for (int i = 0; i < _data.length; i++) {
      _newData[i] = _data[i];
    }
    _data = _newData;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
	  return _data[index];
    /* YOUR IMPLEMENTATION HERE */
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
	int oldVal = get(index);
    _data[index] = newVal;
    return oldVal;
    /* YOUR IMPLEMENTATION HERE */
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );


      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }

  }//end main()


}//end class
