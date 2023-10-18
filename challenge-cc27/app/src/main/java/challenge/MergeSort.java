package challenge;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // Copy data to left and right sub-arrays
            for (int i = 0; i < mid; i++) {   //  first loop copies the elements for the left array,
                left[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {   // second loop copies the elements for the right array
                right[i - mid] = arr[i];
            }

            // Recursive sorting
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted sub-arrays
            merge(left, right, arr);
        }
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
