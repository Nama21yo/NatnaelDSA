package Queue.QueueInStack;

import java.util.Stack;

class EnqueueCost {
  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> s2 = new Stack<>();

  void enQueue(int value) {
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }

    s1.push(value);
    while(!s2.isEmpty()) {
      s1.push(s2.pop());
    }
  }

  int deQueue() {
    if(s1.isEmpty()) return -1;
    return s1.pop();
  }

  void display() {
    if (s1.isEmpty()) {
      System.out.println("Queue is Empty");
    } else {
      while (!s1.isEmpty()) {
        System.out.print(s1.pop() + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    EnqueueCost queue = new EnqueueCost();

    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.enQueue(6);
    queue.enQueue(7);

    queue.deQueue();

    queue.display();

  }
}
