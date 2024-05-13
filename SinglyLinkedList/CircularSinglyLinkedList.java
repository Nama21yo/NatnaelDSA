package SinglyLinkedList;

/**
 * CircularSinglyLinkedList
 */
 class CircularSinglyLinkedList {

  private ListNode head;
  private static class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularSinglyLinkedList() {
    head = null;
  }

  public void creatCircularSinglyLinkedList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(32);
    ListNode third = new ListNode(436);
    ListNode fourth = new ListNode(43);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;

    head = first;
  }

  public void display1() {
    ListNode current = head;
    do {
      System.out.print(current.data + " --> ");
      current = current.next;
    } while (current!=head);
  }

  public void display2() {
    ListNode current = head;
    //! You should make it static variable
    boolean istheFirstHead = false;
    while (current!=head || istheFirstHead == false) {
      istheFirstHead = true;
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    istheFirstHead = false;
  }
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

    csll.creatCircularSinglyLinkedList();

    csll.display1();

  }
}