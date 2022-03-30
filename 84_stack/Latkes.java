/*
Team Purple Pineapples: Jason Zhou, Russell Goychayev, Marcus Wu
APCS pd7
HW84 -- Stack: What Is It Good For?
2022-03-29
time spent: 1.5 hours
*/

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO
    * reworked Latkes so that some push, pop are O(1)
    * redid isFull() so that it works correctly
    * cleared misunderstanding between initCapacity and _stackSize
    * added an accessor method for the top pancake on the stack
    QCC

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1)



  ///accessor method
  public String getLast(){
    if ( _stackSize == 0 ){
      return null;
    }
    return _stack[_stackSize - 1];
  }



  //means of insertion
  public void push( String s )
  {
    if ( isFull() ) {
      System.out.println( "Oops!" );
      return;
    }
    else {
      _stack[_stackSize++] = s;
    }
  }// O(1)



  //means of removal
  public String pop( )
  {
    if ( _stackSize == 0 ) {
      System.out.println( "Oops!" );
      return null;
    }
    else {
      return _stack[--_stackSize];
    }
  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }// O(1)



  //override inherited toString
  public String toString(){
    String retVal = "";
    for (int i=0; i<_stack.length;i++){
      retVal += _stack[i] + " ";
    }
    return retVal;
  }



  //main method for testing
  public static void main( String[] args )
  {


    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");

    System.out.println( tastyStack + "\n" );

    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
