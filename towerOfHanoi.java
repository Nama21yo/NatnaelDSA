/**
 * Tower Of Hanoi- Recursive Method
 */
import java.util.*;
public class towerOfHanoi {
  
    public static void TowerofHanoi(int moves, char towerA, char towerB, char towerC) {
    if(moves>0) {
        TowerofHanoi(moves-1, towerA, towerC, towerB);
        System.out.println("Move Disk "+ moves +" from "+ towerA +" to "+ towerC);
        TowerofHanoi(moves-1, towerB, towerA, towerC);
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Disks: ");
        char A = 'A', B = 'B', C = 'C';
        int n = s.nextInt();
        TowerofHanoi(n,A,B,C);
    }
}

//? Input
// Enter the number of Disks: 
// 3
//? Output
// Move Disk 1 from A to C
// Move Disk 2 from A to B
// Move Disk 1 from C to B
// Move Disk 3 from A to C
// Move Disk 1 from B to A
// Move Disk 2 from B to C
// Move Disk 1 from A to C
