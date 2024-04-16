package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();

    System.out.println("Eneter 5 Integers: ");
    Scanner input = new Scanner(System.in);
    //Entering only Unique Elements
    for(int i = 0;i < 5;i++){
      int temp = input.nextInt();
      if(!integers.contains(temp)) {
        integers.add(temp);
      }
    }

    Collections.sort(integers);
    System.out.println(integers);
  }
}
