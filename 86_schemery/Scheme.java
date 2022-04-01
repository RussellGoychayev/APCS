/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    Stack stack = new ALStack<String>();
    Stack ops = new ALStack<Integer>();

    //use for loop to parse expr
    for (int i=0; i<expr.length(); i++){
      //initialize a String to represent each character in expr
      String givenChar = expr.substring(i, i+1);

      //follow a case-by-case basis for space, digits, +, -, *, and )
      //space
      if ( givenChar.equals ( " " ) ){

      }

      //ops:
      else if ( givenChar.equals( "+") ){
        ops.push( 1 );
      }
      else if ( givenChar.equals( "-") ){
        ops.push( 2 );
      }
      else if ( givenChar.equals( "*" ) ){
        ops.push( 3 );
      }

      //digits:
      else if ( !givenChar.equals( ")" ) ){
        stack.push( givenChar );
      }

      // closer
      else {
        stack.push( unload( ((int) ops.pop()), stack) );
      }

      //System.out.println( stack );//diag
    }
    //System.out.println( "===========" );//diag
    return (String) stack.pop();
  }//end evaluate()



  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int retVal = Integer.parseInt( numbers.pop() );
    //add
    if ( op == 1 ){
      while ( !numbers.peekTop().equals( "(") ){
        // System.out.println( retVal );//diag
        retVal += Integer.parseInt( numbers.pop() );
        // System.out.println( retVal );//diag
      }
    }
    //subtract
    else if (op == 2 ){
      while ( !numbers.peekTop().equals( "(") ){
        // System.out.println( retVal );//diag
        retVal -= Integer.parseInt( numbers.pop() );
        // System.out.println( retVal );//diag
      }
    }
    //multiply
    else if ( op == 3 ){
      while ( !numbers.peekTop().equals( "(") ){
        // System.out.println( retVal );//diag
        retVal *= Integer.parseInt( numbers.pop() );
        // System.out.println( retVal );//diag
      }
    }

    return Integer.toString( retVal );
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String foo = "( + 100 ( * 2 5 ) 5 )";
      System.out.println( foo );
      System.out.println( "foo eval'd: " + evaluate(foo) );
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
