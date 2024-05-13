package LabExercise.Package3;


class DequeueCost {

  StackArray s1;
  StackArray s2;

  public DequeueCost(int capacity) {
    s1 = new StackArray(capacity);
    s2 = new StackArray(capacity);
  }

  void enQueue(int number) {
    s1.push(number);
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
    return s2.stackTop();
  }

}
