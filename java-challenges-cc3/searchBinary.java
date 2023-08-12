public class searchBinary{
    public static void main(String[] args) {
        int[] sortedArray = {-131, -82, 0, 27, 42, 68, 179};
        int key = 42;
        int result = binarySearch(sortedArray, key);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1; // n-1

        while (left <= right) {
            int middle = left + (right - left) / 2;  // instead of using floor

            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
