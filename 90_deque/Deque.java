public interface Deque<T> {
  public void addFirst() {};
  public void addLast() {};
  public T getFirst() {};
  public T getLast() {};
  public T removeFirst() {};
  public T removeLast() {};
  public boolean isEmpty() {};
  public int size() {};
}

public class ALDequeueue<T> implements Deque<T> {
  private ArrayList<T> _deque;
  private int _size;

  public ALDequeueue() {
    this._deque = new ArrayList<T>();
  }
}

public class LLDequeueue<T> implements Deque<t> {

}
