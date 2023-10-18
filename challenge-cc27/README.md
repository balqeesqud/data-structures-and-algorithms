# Insertion Sort

Merge Sort is a sorting algorithm that follows the divide and conquer strategy. It involves dividing an array into 
smaller subarrays, sorting these sub-arrays, and then merging them back together to produce a sorted array. 



# Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```

# Trace

**Sample Array:**[8, 4, 23, 42, 16, 15]

        [8, 4, 23, 42, 16, 15]                  Splitting the intial Array into sub-arrays
              /           \
     [8, 4, 23]         [42, 16, 15]       
       /       \         /   |    \  
     [8]     [4,23]    [42] [16, 15]
     /        /    |     |    \    \
    [8]     [4]  [23]   [42]  [16] [15]         Recursively sort the 'left' and 'right' sub-arrays.

  Merged: [4, 8, 23]    Merged: [15, 16, 42]    Merge the sorted 'left' and 'right' sub-arrays
                \         /
      Merged: [4, 8, 15, 16, 23, 42]            Merge the results of merging 'left' and 'right'


1. Initial array [8, 4, 23, 42, 16, 15]
2. Step 2: Splitting the Array
   Split the initial array into 'left' and 'right' sub-arrays. and also split the subarrays
   Left: [8, 4, 23]
   Right: [42, 16, 15]

3. Recursive sorting: recursively sort the 'left' and 'right' sub-arrays.

   Sorting 'left': >>> Left: [8, 4, 23]
   Split 'left': >>> Left: [8]  Right: [4, 23]

   Sorting 'right': >>> Right: [4, 23] 
   Split 'right': >>> Left: [4]   Right: [23]

4. Step 4: Merging
   Merge the sorted 'left' and 'right' sub-arrays using the Merge algorithm Merged: [15, 16, 42]/ Merged: [4, 8, 23]

5. Merge the results of merging 'left' and 'right', which are `[4, 8, 23]` and `[15, 16, 42`, to obtain the final 
   sorted array.  Merged: `[4, 8, 15, 16, 23, 42]`


# Efficiency
- **Space Complexity:** O(n).
  This space is primarily used for creating temporary sub-arrays when splitting the original array. Each time the array 
  is divided into two halves, a new temporary sub-array is created for each half. The number of temporary arrays 
  created is log₂(n), and each of them has a size of n/2. 


- **Time Complexity:** O(n log n).
  It consistently divides the input array into two halves and sorts them, and then merges the sorted halves.
  The recursive divide-and-conquer approach ensures a relatively even division of work, which results in a logarithmic 
  number of divisions.

