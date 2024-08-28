from array import *

# 1. Create an array and traverse O(n)
print("step-1")
my_array = array('i',[1,2,3,4,5])

for i in my_array:
  print(i)

# 2. Access individual elements through indexes
print("Step-2")
print(my_array[2]) # 3
#  3. Append  any value to the array using array() method
print("Step-3")
my_array.append(6) # O(1)
print(my_array)
# Insert value in an array using insert() method
print("Step-4")
my_array.insert(0,11) # O(n) worse O(1) best
print(my_array)
# Extend python array using extend() method
print("Step-5")
my_array1 = array('i',[10,11,12])
my_array.extend(my_array1)
print(my_array)

# Add items from list into array using fromlist() method

print("Step-6")
tempList = [20,21,22]
my_array.fromlist(tempList)
print(my_array)

# Remove any array element using remove() method

print("Step-7")
my_array.remove(11) # remove it in the first occurrence O(n)
print(my_array)

# Remove last array element using pop() method
print("Step-8")
my_array.pop() # O(1)
print(my_array)

# Fetch any element through its index using index() method
print("Step-9")
print(my_array.index(21)) # return the index of the element
# Reverse a python array using reverse() method
print("Step-10")
my_array.reverse()
print(my_array)
# Get array Buffer information using buffer_info() method
print("Step-11")
my_array.buffer_info() # address memory
# Check for the number of occurrences of an element using count() method
print("Step-12")
my_array.append(11)
print(my_array.count(11))
# convert array to string using toString() method
print("Step-13")
strTemp = my_array.tostring()
print(strTemp)

intArray = array('i')
intArray.fromstring(strTemp)
print(intArray)
# Convert array to a python list with some elements using tolist() method
print("Step-14")
# print(my_array.tolist())
# Append a string to char Array using fromstring() method

# Slice elements from an array
print("Step - 16")
print(my_array[1:4])