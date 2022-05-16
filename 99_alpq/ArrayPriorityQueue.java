/***
 *
 * Team Purple Pineapples First Class Priority Queueueueueue
 * APCS pd7
 * HW97 – Racist Queue
 * 05/15/2022
 * time spent: 0.5 hours
 *
***/

import java.util.ArrayList;
import javax.management.RuntimeErrorException;

public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<Integer> priorityQueue;

    public ArrayPriorityQueue() {
        priorityQueue = new ArrayList<Integer>();
    }

    public void add(int x) {
      //if empty:
      if ( isEmpty() ) {
        priorityQueue.add(x);
        return;
      }

      //if not empty:
      for (int i = 0; i < priorityQueue.size(); i++) {
        if (x <= priorityQueue.get(i)) {
          priorityQueue.add(i, x);
          return;
        }
      }
    }

    public boolean isEmpty() {
        return priorityQueue.size() == 0;
    }

    public int peekMin() {
        if (isEmpty()) throw new RuntimeException("No elements");
        return priorityQueue.get(0);
    }

    public int removeMin() {
        if (isEmpty()) throw new RuntimeException("No elements");
        return priorityQueue.remove(0);
    }

    public String toString() {
        return priorityQueue.toString();
    }

    public static void main(String[] args) {
        ArrayPriorityQueue omega = new ArrayPriorityQueue();
        omega.add(69);
        System.out.println( "Adding 69: " + omega);
        omega.add(3);
        System.out.println( "Adding 3: " + omega);
        omega.add(900);
        System.out.println( "Adding 900: " + omega);
        omega.add(1);
        System.out.println( "Adding 1: " + omega);
    }
}
