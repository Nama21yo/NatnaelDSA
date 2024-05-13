package Queue.inArray;

 class PriorityQueue {

  private int maxSize;
  private long[] queArray;
  private int nItems;

  public PriorityQueue(int size) {
    maxSize = size;
    queArray = new long[maxSize];
    nItems = 0;
  }

  public void insert(long value) {
    int j;
    if(nItems == 0) {
      queArray[nItems++] = value;
    }
    else {
      for(j = nItems-1; j>= 0; j--) {
        if (value > queArray[j]) {
          queArray[j+1] = queArray[j];
        } else {
          break;
        }
      }
      queArray[j+1] = value;
      nItems++;
    }
  }

  public long remove() {
    return queArray[--nItems];
  }

  public long peekMin() {
    return queArray[nItems-1];
  }

  public boolean isEmpty() {
    return nItems == 0;
  }

  public boolean isFull() {
    return nItems == maxSize;
  }

  public static void main(String[] args) {
    PriorityQueue pq = new PriorityQueue(5);

    pq.insert(30);
    pq.insert(50);
    pq.insert(10);
    pq.insert(40);
    pq.insert(20);

    while (!pq.isEmpty()) {
      long item = pq.remove();
      System.out.print(item + " ");
    }
    System.out.println("");
  }
}
