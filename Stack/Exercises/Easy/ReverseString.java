package Stack.Exercises.Easy;

import java.util.Scanner;
import java.util.Stack;

class ReverseString {

  static String reverse(String str) {
    Stack<Character> stack = new Stack<>();

    char[] chars = str.toCharArray();

    for(char ch: chars) {
      stack.push(ch);
    }

    for(int i = 0; i< str.length();i++) {
      chars[i] = stack.pop();
    }
    return new String(chars);
  }


  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    System.out.println("Input Text -> " + str);
    System.out.println("Reversed Text ->" + reverse(str));
  }
}
