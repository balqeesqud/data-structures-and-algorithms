# Binary Search



## Whiteboard Process

![White Board](./assets/whiteboard-cc2.png)

## Approach & Efficiency

```
The binarySearch function follows a straightforward approach where it iterates through each 
element of the sorted array and checks if the current element matches the search key. If a match 
is found, the index of the element is returned. If no match is found after iterating through the
entire array, the function returns -1 to indicate that the key is not found in the array. The 
efficiency of the linear search algorithm depends on the size of the array and the position of 
the key within the array.

```

## Big O Analysis

- **time complexity:** 
O(n), where n is the number of elements in the array. This is because, in the worst-case scenario,
you might need to iterate through the entire array to find the desired key or determine that the 
key is not found. The binarySearch method iterates through the array using a for loop. For each 
iteration, it compares the current element with the search key. This operation has a constant time
complexity of O(1). Since this operation is performed for each element in the array (n times), the
overall time complexity is O(n).

- **space complexity:** 
The space complexity O(1), which means it requires a constant amount of extra space regardless of 
the input size. This is because the algorithm I used only uses a fixed number of additional variables for
the loop and comparison, and the memory usage does not increase with the size of the input array.


## Solution

   1. cd java-challenges-cc3.
   2. javac searchBinary.java .
   3. java searchBinary. 
   

   ![Example Output](./assets/example-cc2.png)
