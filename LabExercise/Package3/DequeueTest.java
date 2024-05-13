package LabExercise.Package3;

public class DequeueTest {
   public static void main(String[] args) {
    DequeueCost queue = new DequeueCost(7);

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
