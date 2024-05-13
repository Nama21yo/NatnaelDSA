//? Advantages of Linear Search:
// Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
// Does not require any additional memory.
// It is a well-suited algorithm for small datasets.
//? Drawbacks of Linear Search:
// Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
// Not suitable for large arrays.
// Java code for linearly searching x in arr[]. 

import java.io.*;

class GFG {
    public static int search(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function call
        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}
//? Advantages of Binary Search:
// Binary search is faster than linear search, especially for large arrays.
// More efficient than other searching algorithms with a similar time complexity, such as interpolation search or exponential search.
// Binary search is well-suited for searching large datasets that are stored in external memory, such as on a hard drive or in the cloud.
// ?Drawbacks of Binary Search:
// The array should be sorted.
// Binary search requires that the data structure being searched be stored in contiguous memory locations. 
// Binary search requires that the elements of the array be comparable, meaning that they must be able to be ordered.
// ? Applications of Binary Search:
// Binary search can be used as a building block for more complex algorithms used in machine learning, such as algorithms for training neural networks or finding the optimal hyperparameters for a model.
// It can be used for searching in computer graphics such as algorithms for ray tracing or texture mapping.
// It can be used for searching a database.
//? Types
//Iterative
// Java implementation of iterative Binary Search
class BinarySearch {

	// Returns index of x if it is present in arr[].
	int binarySearch(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// If we reach here, then element was
		// not present
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println("Element is present at "
							+ "index " + result);
	}
}

//Recursive
class binarySearch {
  static int binarySearching(int[] arr, int start,int end, int addedElement) {
    int mid = (start+end)/2;
    if(arr[mid] == addedElement) {
      return arr[mid];
    }
    if(arr[mid] > addedElement) {
      end = mid-1;
      return binarySearching(arr, start, end, addedElement);
    }
    if(arr[mid] < addedElement) {
      start = mid+1;
      return binarySearching(arr, start, end, addedElement);
    } 
    return -1;
  }

}

public class Searching {
  public static void main(String[] args) {
    System.out.println("Searching Elements in an Array");
    int arr[] = { 5, 6, 7, 8, 9, 10 };
    int addedElement = 10;
    int start = 0;
    int end = arr.length-1;
    binarySearch binary = new binarySearch();
    System.out.println("Index is found at Position: " + binary.binarySearching(arr, start, end, addedElement));
  }
}
////
public int ternarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
        int mid1 = left + (right - left) / 3;
        int mid2 = left + 2 * (right - left) / 3;
        if (array[mid1] == target) {
        return mid1;
        }
        else if (array[mid2] == target) {
        return mid2;
        }
        else if (target < array[mid1]) {
        right = mid1 - 1;
        }
        else if (target > array[mid2]) {
        left = mid2 + 1;
        }
        else {

        left = mid1 + 1;
        right = mid2 - 1;
        }
        }
        return -1; // Element not found
}