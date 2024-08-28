class HashTable:
    # Initialize the hash table with a default capacity
    def __init__(self, capacity=10):
        self.numBuckets = capacity
        self.bucketArray = [[] for _ in range(capacity)]  # List of lists to store chains
        self.size = 0  # Number of key-value pairs in the hash table

    # Hash function to calculate the index for a given key
    def _hash(self, key):
        return key % self.numBuckets

    # Method to add a key-value pair to the hash table
    def put(self, key, value):
        bucketIndex = self._hash(key)  # Calculate the index in the bucket array
        bucket = self.bucketArray[bucketIndex]  # Get the list at the index (chain)
        
        for pair in bucket:
            if pair[0] == key:  # If the key already exists, update its value
                pair[1] = value
                return
        
        bucket.append([key, value])  # If the key doesn't exist, add it
        self.size += 1  # Increment the size of the hash table

    # Method to retrieve the value associated with a key
    def get(self, key):
        bucketIndex = self._hash(key)  # Calculate the index in the bucket array
        bucket = self.bucketArray[bucketIndex]  # Get the list at the index (chain)
        
        for pair in bucket:
            if pair[0] == key:  # If the key is found, return its value
                return pair[1]
        
        return None  # Return None if the key is not found

    # Method to remove a key-value pair from the hash table
    def remove(self, key):
        bucketIndex = self._hash(key)  # Calculate the index in the bucket array
        bucket = self.bucketArray[bucketIndex]  # Get the list at the index (chain)
        
        for i, pair in enumerate(bucket):
            if pair[0] == key:  # If the key is found, remove it from the list
                del bucket[i]
                self.size -= 1  # Decrement the size of the hash table
                return pair[1]  # Return the removed value
        
        return None  # Return None if the key is not found

    # Method to return the number of key-value pairs in the hash table
    def size(self):
        return self.size

    # Method to check if the hash table is empty
    def is_empty(self):
        return self.size == 0

# Example usage
if __name__ == "__main__":
    table = HashTable(10)
    table.put(105, "Tom")
    table.put(21, "Sana")
    table.put(31, "John")
    
    print(table.size)      # Outputs: 3
    print(table.get(31))   # Outputs: "John"
    print(table.get(88))   # Outputs: None (since key 88 does not exist)
    print(table.remove(21))# Outputs: "Sana"
    print(table.size)      # Outputs: 2
    print(table.get(21))   # Outputs: None (since key 21 was removed)
