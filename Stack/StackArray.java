package Stack;

class StackArray {
  int size;
  int top;
  int[] array;
  // Creation of a Stack 
  StackArray(int size) {
    array = new int[size];
    this.size = size;
    top = -1;
  }
  //Adding Elements in a Stack
  void push(int value) {
    if(top == size-1) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }
    else {
      top++;
      array[top] = value;
    }
  }

  int pop() {
    // int x
    if(top == -1) {
      System.out.println("STACK Underflow");
      System.exit(1);
    }
    return array[top--];
  }

  int peek(int position) {
    if(top-position+1 < 0) {
      System.out.println("Invalid Position");
      System.exit(1);
    }
    return array[top-position+1];
  }

  int stackTop() {
    if(top == -1) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }
    return array[top];
  }

  boolean isEmpty() {
    return (top == -1);
  }
  boolean isFull() {
    return (top == size -1);
  }
  void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    StackArray stack = new StackArray(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    System.out.println("The top of the Stack" + stack.stackTop());
    System.out.println("The element at index 2: " + stack.peek(2));
    System.out.println("Is it Empty: " + stack.isEmpty());
    System.out.println("Is it Full: "+ stack.isFull());
    stack.printStack();
    System.out.println("\nAfter popping out");
    System.out.println("The removed Element "+stack.pop());

    stack.printStack();

  }
}
// Stack Inmplementation in an Array
/* Java program to implement basic stack
operations */
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
   
    void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ a[i]);
    }
  }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
//This code is Modified by Vinay Pandey
