package Queue.QueueInStack;

import java.util.Stack;

class DequeueCostly {
  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> s2 = new Stack<>();

  void enQueue(int value) {
    s1.push(value);
  }

  int deQueue() {
    if(s2.isEmpty()) {
      /* If both stacks are empty then error */
      if(s1.isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      } 
      /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
      else {
        while (!s1.isEmpty()) {
          s2.push(s1.pop());
        }
      }
    }
    return s2.pop();
  }

  int peek() {
    if(s2.isEmpty()) {
      /* If both stacks are empty then error */
      if(s1.isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      } 
      /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
      else {
        while (!s1.isEmpty()) {
          s2.push(s1.pop());
        }
      }
    }
    return s2.peek();
  }

  public static void main(String[] args) {
    DequeueCostly queue = new DequeueCostly();

    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.enQueue(6);
    queue.enQueue(7);

    System.out.println("Peek: " + queue.peek());

    System.out.print("Dequeued: " + queue.deQueue() + " ");
    System.out.print("Dequeued: " + queue.deQueue() + " ");
    System.out.println("Dequeued: " + queue.deQueue() + " ");

    // Attempt to dequeue from an empty queue
    System.out.println("Dequeued: " + queue.deQueue());

    // Enqueue additional items
    queue.enQueue(8);
    queue.enQueue(9);

    // Peek at the front item
    System.out.println("Peek: " + queue.peek());
  }
}
