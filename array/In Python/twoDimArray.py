import numpy as np

twoDimArray = np.array([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]])
print(twoDimArray)

# Insertion
newTwoDArray = np.insert(twoDimArray,0,[[17,18,19,20]],axis=1) # adding as a column
newTwoDArray = np.insert(twoDimArray,0,[[17,18,19,20]],axis=0) # adding as a row
newTwoDArray = np.append(twoDimArray,[[17,18,19,20]],axis=0) # adding at the last as a row

# Accessing element
def accessElements(array,rowIndex,columnIndex): #O(1) time comp O(1) space comp
  if rowIndex >= len(array) and columnIndex >= len(array[0]):
    print("Incorrect Index")
  else:
    print(array[rowIndex][columnIndex])
accessElements(twoDimArray,2,3)

# Traversing
def traverseTDArray(array): # O(mn) time O(1) space
  for i in range(len(array)):
    for j in range(len(array[0])):
      print(array[i][j])
print(twoDimArray)
traverseTDArray(twoDimArray)

# Deletion
newTwoDArray = np.delete(twoDimArray,0,[[17,18,19,20]],axis=1) # removing as a column
newTwoDArray = np.delete(twoDimArray,0,[[17,18,19,20]],axis=0) # removing as a row
newTwoDArray = np.delete(twoDimArray,[[17,18,19,20]],axis=0) # removing at the last as a row