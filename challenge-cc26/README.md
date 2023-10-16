# Insertion Sort

Is a simple efficient sorting algorithm that builds the final sorted array one item at a time. 
It works by considering one element at a time and comparing it with the already sorted part of the array to insert 
the element in its correct position.

# Pseudocode
```
Insert(int[] sorted, int value)
initialize i to 0
WHILE value > sorted[i]
set i to i + 1
WHILE i < sorted.length
set temp to sorted[i]
set sorted[i] to value
set value to temp
set i to i + 1
append value to sorted


InsertionSort(int[] input)
LET sorted = New Empty Array
sorted[0] = input[0]
FOR i from 1 up-to-input.length
Insert(sorted, input[i])
return sorted
```

# Trace

 **Sample Array:**[8, 4, 23, 42, 16, 15]

 | Iteration | Sorted Array       | Current Element | Action                              |
 |-----------|--------------------|-----------------|-------------------------------------|
 | 0         | [ ]                | 8               | Initialize with the first element   |
 | 1         | [8]                | 4               | Insert 4 into the correct position  |
 | 2         | [4, 8]             | 23              | Insert 23 into the correct position |
 | 3         | [4, 8, 23]         | 42              | Insert 42 into the correct position |
 | 4         | [4, 8, 23, 42]     | 16              | Insert 16 into the correct position |
 | 5         | [4, 8, 16, 23, 42] | 15              | Insert 15 into the correct position |

1. Create an empty sorted array: sorted = [].
2. We start with the first element, 8, which is already considered sorted. sorted = [8]
3. Move to the next element, 4. We compare it to the sorted part of the array. Since 4 is smaller than 8, we move 8 
   one position to the right and insert 4 in its place.

4. The Next element is 23. It is larger than 8, so it stays in its current position. Current State: sorted = [4, 8, 23]

5. We continue with 42, which is also larger than the previous element 23, so it remains in its place.

6. Moving on to 16, we compare it to the elements in the sorted part of the array.
   - Compare 16 to 42. Since 16 is smaller than 42, we move 42 one position to the right: sorted = [4, 8, 23, 16, 42]
   - compare 16 to 23. 16 is smaller than 23, so we move 23 one position to the right: sorted = [4, 8, 16, 23, 42]
   
7. Finally, we process the last element, 15. It needs to be inserted in its correct position within the sorted part of
   the array. After insertion: sorted = [4, 8, 15, 16, 23, 42]

# Efficiency
  - Space Complexity: O(1).
    it uses a constant amount of extra space for variables such as key, j, and the loop control variables.
  - Time Complexity: O(n^2) .
    when the array is in reverse order, the inner while loop may perform many comparisons and shifts for each element.
    making it less efficient for large arrays.

