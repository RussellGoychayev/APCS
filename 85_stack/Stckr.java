/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<String> cakes = new ALStack<String>();
    //Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    cakes.push("cob");
    cakes.push("charlie");
    cakes.push("boa");
    cakes.push("elmo");
    cakes.push("sans");
    while (!cakes.isEmpty()) {
      System.out.println(cakes.pop());
    }



    //...

  }//end main

}//end class
