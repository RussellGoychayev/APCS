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
    //stack for the big scene
    int retVal = 0;
    Stack stack = new ALStack<String>();

    for (int i=0; i<expr.length(); i++){
      String givenChar = expr.substring(i, i+1);

      //if not closer: push onto stack
      if ( !givenChar.equals( ")" ) ){
        stack.push( givenChar );
      }

      //if closer: begin resolving the stack
      else {
        //temporary stack for resolving
        Stack temp = new ALStack<String>();
        String givenChar = stack.pop();

        if ( !isOperator( givenChar ) ){
          temp.push( givenChar );
        }

        //operator will be reached once stack is resolved
        else {
          while ( !stack.isEmpty() ){
            
          }
        }

      }

    }

    return null;
  }//end evaluate()

/***
  // helper method for evaluate; checks if s is a Stringified single-digit integer
  private static boolean isDigit( String s ){
    if ( s.equals( "0" ) || s.equals( "1" ) || s.equals( "2" ) ||
         s.equals( "3" ) || s.equals( "4" ) || s.equals( "5" ) ||
         s.equals( "6" ) || s.equals( "7" ) || s.equals( "8" ) ||
         s.equals( "9" ) )
      return true;
    return false;
  }//end isInt()
**/

  //helper method for evaluate; checks if s is "+","-","/","*"
  private static boolean isOperator( String s ){
    if ( s.equals( "+" ) || s.equals( "-" ) || s.equals( "*" ) ||
         s.equals( "/" ) )
      return true;
    return false;
  }//end isOperator()



  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    return null;
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
