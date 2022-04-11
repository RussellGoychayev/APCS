public class ALQ<QUASAR> {
  private ArrayList<QUASAR> _queue;
  private int _headPointer;
  private int _size;

  public ALQ() {
    this._queue = new ArrayList<QUASAR>();
    this._headPointer = 0;
    this._size = 0;
  }

  public void enqueue(Quasar element) {
    _queue.add(element);
    _size++;
  }

  public QUASAR dequeue() {
    QUASAR retVAl 
  }

}
