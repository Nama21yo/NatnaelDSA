package Queue.inArray;
// In an Array
class QueueCircular {
  int size;
  int front;
  int rear;
  int[] arr;

  QueueCircular(int size) {
    this.size = size;
    arr = new int[size];
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    return (rear+1)%size == front;
  }
  boolean isEmpty() {
    return (rear == front);
  }
  void enQueue(int value) {
    if (isFull()) {
      System.out.println("Queue is Full");
    }else {
      rear = (rear+1)%size;
      arr[rear]=value;
    }
  }

  int deQueue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return Integer.MIN_VALUE;
    }
    front = (front +1)%size;
    return arr[front];
  }

  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Queue is Empty");
    }else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for(i = front+1; i != rear; i = (i+1)%size) {
        System.out.println(arr[i] + " ");
      }
      System.out.println(arr[i]);
      System.out.println("Rear -> " + rear );
    }
  }

  public static void main(String[] args) {
    QueueCircular q = new QueueCircular(5);

    // Fails because front = -1
    q.deQueue();

    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);


    q.display();

    int elem = q.deQueue();

    if (elem != -1) {
      System.out.println("Deleted Element is " + elem);
    }
    q.display();

    q.enQueue(7);

    q.display();

    // Fails to enqueue because front == rear + 1
    q.enQueue(8);
  }
}
