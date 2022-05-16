//nvm bruh

import java.util.ArrayList;

public class ArrayPriorityQueueXtra {

  //class of elements to go in APQ
  private class PriorityQueueElement {
    private int priority;
    private int value;

    public PriorityQueueElement(int value, int priority) {
      value = value;
      priority = priority;
    }

    public int getPriority() {
      return priority;
    }

    public int getValue() {
      return value;
    }

    public String toString() {
      return "(Priority: " + priority + " Value: " + value + "), ";
    }
  }

  private ArrayList<PriorityQueueElement> priorityQueue;

  private boolean LowPriorityFirst;
  private boolean LowValueFirst;

  public ArrayPriorityQueueXtra() {
    priorityQueue = new ArrayList<PriorityQueueElement>();
    LowPriorityFirst = false;
    LowValueFirst = false;
  }

  public ArrayPriorityQueueXtra(boolean p, boolean v) {
    priorityQueue = new ArrayList<PriorityQueueElement>();
    LowPriorityFirst = p;
    LowValueFirst = v;
  }

  public void enqueue(PriorityQueueElement e) {
    if (priorityQueue.size() == 0)
      priorityQueue.add( element)

    if (LowPriorityFirst){
      //LowPriorityFirst && LowValueFirst
      if (LowValueFirst){
        for (int i = 0; i<priorityQueue.size(); i++){
          if priorityQueue.get(i).getPriority() > e.getPriority(){

          }
        }
      }
      //LowPriorityFirst && !LowValueFirst

    }
    else {
      //!LowPriorityFirst && LowValueFirst
      if (LowValueFirst){

      }
      //!LowPriorityFirst && !LowValueFirst

    }
  }

  public int dequeue() {
    if (priorityQueue.size() == 0) throw new RuntimeException("No elements");
    return priorityQueue.remove(0).getValue();
  }

  public int peek() {
    if (priorityQueue.size() == 0) throw new RuntimeException("No elements");
    return priorityQueue.get().getValue();
  }

  public boolean isEmpty() {
    return priorityQueue.size() == 0;
  }

  public String toString() {
    String total = "";
    for (PriorityQueueElement e: priorityQueue) {
      total += e.toString();
    }
    return total;
  }

  public static void main(String[] args) {
    ArrayPriorityQueueXtra elmo = new ArrayPriorityQueueXtra();
    elmo.enqueue(16, 2);
    elmo.enqueue(1, 2);
    elmo.enqueue(16, 1);
    elmo.enqueue(16, 3);
    elmo.enqueue(6, 1);
    System.out.println(elmo);
  }


}
