/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW43: Array of Steel
 * 2021-12-6
 * time spent - 0.5 hours
 *
 * Disco- there are two ways to do the add function. a)you make a new array with +1 size regardless, and add the desired value at the end or
 * b)you add value at size if there is room in the array, if not, expand() and proceed.
 *
 * QCC- of the two ways above, which is more correct?
 *
*/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
	int[] newData = new int[_size+1];
    for (int i = 0;i< _size;i++){
       newData[i] = _data[i];
    }
    newData[_size] = newVal;
    _data = newData;
    _size++;
  }



  //inserts an item at index

  //method touched upon in class:
  //makes new array thats +1 in size
  /**  for (int i=_size-1;i>=index;i--) {//works backwards, moving all the values right by one till the desired index
      _data[i]=_data[i-1];
    }
    _data[index]=newVal; // "adds" desired value at desired index
    **/

  //our method:
  public void add( int index, int newVal )
  {

    add(0);
    int[] temp = new int[_data.length + 1];//initializes temp array of length one more than the array that called this method

    for (int i=0; i<index; i++) {//populates temp array before index index
      temp[i] = _data[i];
    }

    temp[index] = newVal; //populates temp array at index index

    for (int i=0; i<_data.length-index; i++) {//populates temp array after index index
      temp[i] = _data[i];
    }
    _data = temp;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    for (int i=index;i<this._size-1;i++) { //replacing the thing at index with its forward neighbor, and doing it for the following elements
      this._data[i] = this._data[i+1];
    }
    this._size--; //size is literally one less, cus we removed one number
  }


  //return number of meaningful items in _data
  public int size()
  {
    return _size; //_size is the number of additions minus the removals, truly represents the meaningful tings here
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
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }

      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);

      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);

  }//end main()


}//end class
