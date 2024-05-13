package LabExercise.Package1;

import java.util.Arrays;
import java.util.Scanner;

/**
  * ScannerArray
  */
 public class ScannerArray {
   static void fillArray(int[] arrayIn)
        {
            Scanner keyboard = new Scanner (System.in);
            for (int i = 0; i < arrayIn.length; i++)
            {
             System.out.print("enter value ");
            arrayIn[i] = keyboard.nextInt();
            }
      }

      static int countElement (int[] arrayIn, int valueIn)
      {
          int count = 0;
          if(arrayIn.length == 0) {
            return 0;
          }
          for (int i = 0; i < arrayIn.length; i++)
          {
          if (arrayIn[i] == valueIn)
          {
            count++;
          }
          }
          return count;
    }
 public static void main(String[] args) {
  
   char choice;
   Scanner input = new Scanner(System.in);
   int[] inputArray;
   System.out.print("How many elements to store?: ");
   int size = input.nextInt();

   inputArray = new int[size];

   do {
    System.out.println();
    System.out.println("[1] Enter values");
    System.out.println("[2] Search Element");
    System.out.println("[3] Sort the Array");
    System.out.println("[4] Exit");
    System.out.print("Enter choice [1-4]: ");
    choice = input.next().charAt(0);
    System.out.println();
    switch(choice)
        {
        case '1': fillArray(inputArray);
        break;
        case '2': System.out.print ("Enter value to find: ");
        int item = input.nextInt();
        int num = countElement(inputArray, item);
        if (num == 0) // indicates value not found
        {
        System.out.println ("This Element is not in the array");
        }
        else
        {
        System.out.println ("["+item+"]" + " is present " + num + " times.");
        }
        break;
        case '3': System.out.println("Array values");
        MergeSortRecursive m = new MergeSortRecursive();
        inputArray = m.mergeSort(inputArray);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(inputArray));
        break;
        }
   }while (choice != '4');
      System.out.println("Program Finished");
 }
} 
