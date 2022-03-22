/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0:
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<XYZ>
{
  //add node to list, containing input XYZ as its data
  public boolean add( XYZ x );

  //insert at specified index
  public void add( int index, XYZ newVal );

  //remove node from list, return its data
  public XYZ remove( int index );

  //return data in element at position i
  public XYZ get( int i );

  //overwrite data in element at position i
  public XYZ set( int i, XYZ x );

  //return length of list
  public int size();

}//end interface
