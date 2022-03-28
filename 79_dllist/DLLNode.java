/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class DLLNode
{
  //instance vars
  private String data;
  private DLLNode nextNode;
  private DLLNode previousNode;

  // constructor
  public DLLNode( String data, DLLNode next, DLLNode previous )
  {
    data = data;
    nextNode = next;
    previousNode = previous;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return data;
  }

  public DLLNode getNext()
  {
    return nextNode;
  }

  public DLLNode getPrevious()
  {
    return previousNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    data = newCargo;
    return data;
  }

  public DLLNode setNext( DLLNode newNext )
  {
    DLLNode retVal = this.nextNode;
    nextNode = newNext;
    return retVal;
  }

  public DLLNode setPrev( DLLNode newPrevious )
  {
    DLLNode retVal = this.previousNode;
    previousNode = newPrevious;
    return retVal;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return "Data is: " + data;
  }


  //main method for testing
  public static void main( String[] args )
  {


    //Q: when head ptr moves to next node in list, what happens to the node it just left?

    //Its info is gone.

    //...so better: ?
    //
    //
    //

  }//end main

}//end class LLNode
