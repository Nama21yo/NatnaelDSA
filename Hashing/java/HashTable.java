package Hashing.java;

// Implementing HashTable using Separate Chaining (Linked Lists)
public class HashTable{
  private HashNode[] bucketArray; // Array to hold linked lists (chains)
  private int numBuckets;         // Capacity of the HashTable
  private int size;               // Number of key-value pairs in the HashTable

  public HashTable() {
    this(10); // Default capacity is 10 if no capacity is provided
  }

  public HashTable(int capacity) {
    this.numBuckets = capacity;
    bucketArray = new HashNode[numBuckets];
    this.size = 0;
  }

  // HashNode represents each entry in the HashTable
  private class HashNode {
    private Integer key; // Key of the HashNode
    private String value; // Value of the HashNode
    private HashNode next; // Pointer to the next node in the chain

    public HashNode(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  // Methods

  // Returns the number of key-value pairs in the HashTable
  public int size() {
    return size;
  }

  // Checks if the HashTable is empty
  public boolean isEmpty() {
    return size == 0;
  }

  // Computes the index for a given key (using a hash function)
  private int getBucketIndex(Integer key) {
    return key % numBuckets; // Hash function using modulus
  }

  // Adds a key-value pair to the HashTable
  public void put(Integer key, String value) {
    if(key == null || value == null) {
      throw new IllegalArgumentException("Key or Value cannot be null");
    }

    int bucketIndex = getBucketIndex(key); // Get index in the bucket array
    HashNode head = bucketArray[bucketIndex]; // Get the head of the chain at the bucket index

    // Check if the key already exists; if so, update its value
    while(head != null) {
      if(head.key.equals(key)) {
        head.value = value;
        return;
      }
      head = head.next;
    }

    // Insert the new key-value pair at the beginning of the chain
    size++;
    head = bucketArray[bucketIndex];
    HashNode newNode = new HashNode(key, value);
    newNode.next = head;
    bucketArray[bucketIndex] = newNode;
  }

  // Retrieves the value associated with a key
  public String get(Integer key) {
    int bucketIndex = getBucketIndex(key); // Get index in the bucket array
    HashNode head = bucketArray[bucketIndex]; // Get the head of the chain at the bucket index

    // Search the chain for the key
    while (head != null) {
      if(head.key.equals(key)) {
        return head.value; // Return the value if the key is found
      }
      head = head.next;
    }
    return null; // Return null if the key is not found
  }

  // Removes a key-value pair from the HashTable
  public String remove(Integer key) {
    int bucketIndex = getBucketIndex(key); // Get index in the bucket array
    HashNode head = bucketArray[bucketIndex]; // Get the head of the chain at the bucket index
    HashNode prev = null; // To keep track of the previous node

    // Search the chain for the key
    while(head != null) {
      if(head.key.equals(key)) {
        break; // Stop if the key is found
      }
      prev = head;
      head = head.next;
    }

    if(head == null) return null; // If key is not found, return null

    size--; // Decrement size as we are removing an entry

    if(prev != null) {
      prev.next = head.next; // Bypass the node to remove it from the chain
    } else {
      bucketArray[bucketIndex] = head.next; // Remove the head of the chain
    }

    return head.value; // Return the removed value
  }

  public static void main(String[] args) {
    HashTable table = new HashTable(10);
    table.put(105, "Tom");
    table.put(21, "Sana");
    table.put(31, "John");

    System.out.println(table.size());    // Outputs: 3
    System.out.println(table.get(31));   // Outputs: "John"
    System.out.println(table.get(88));   // Outputs: null (since key 88 does not exist)
  }
}
