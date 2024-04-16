package SinglyLinkedList;

public class SinglyLinkedList {
  

  private ListNode head;
  private static class ListNode {
    private int data;//data
    private ListNode next;//pointer to the next
    
    //Constructor
    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }

  ////?
  public void display(){//Printing ListNode
    ListNode current = head;
    while(current != null) {
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.print("null");
  }

  public int length() {
    if(head == null) {
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while(current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  //?Insertion
  public void insertFirst(int value){
    ListNode newNode = new ListNode(value);
    newNode.next  = head;
    head = newNode;
  }
  //main method
  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);


    
    System.out.println("Single Linked List ");

    //Connecting them together to form a chain
    sll.head.next = second;
    second.next = third;
    third.next = fourth;
    //Printing List Node before Insertion
    sll.display();
    //Insering additional Value before 10
    sll.insertFirst(21);
    sll.insertFirst(365);
    sll.insertFirst(265);
    sll.insertFirst(362);
    
    //Printing List Node after Insertion
    System.out.println();
    sll.display();
    System.out.println();
    //Printing the length
    System.out.println("Length is " + sll.length());
  }
}
