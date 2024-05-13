package Queue.inArray;

class QueueArray {
  int size;
  int front;
  int rear;
  int[] arr;

  QueueArray(int size) {
    this.size = size;
    front = -1;
    rear = -1;
    arr = new int[size];
  }

  void enQueue(int value) {
    if(rear == size - 1) {
      System.out.println("Queue  Underflow");
    }
    else {
      rear++;
      arr[rear] = value;
      System.out.println("Inserted " + value);
    }
  }

  int deQueue() {
    if(front == rear) {
      System.out.println("Queue is Empty");
      return Integer.MIN_VALUE;
    }
    front++;
    System.out.println("Deleted -> " + arr[front]);
    return arr[front];
  }

  boolean isEmpty() {
    return front == rear;
  }

  boolean isFull() {
    return rear == size-1;
  }

  int front() {
    if((front == rear) || (front == -1)) {
      System.out.println("Queue empty");
      return Integer.MIN_VALUE;
    }
    return arr[front];
  }

  int back() {
    if(rear == size-1) {
      System.out.println("Queue is Full");
      return Integer.MIN_VALUE;
    }
    return arr[rear];
  }

  void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front + 1; i <= rear; i++)
        System.out.print(arr[i] + "  ");
      System.out.println("\nRear index-> " + rear);
    }
  }

    public static void main(String[] args) {
    QueueArray q = new QueueArray(5);

    // deQueue is not possible on empty queue
    q.deQueue();

    // enQueue 5 elements
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // 6th element can't be added to because the queue is full
    q.enQueue(6);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.deQueue();

    // Now we have just 4 elements
    q.display();

  }


}