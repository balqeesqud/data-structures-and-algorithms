public class ArrayReverse {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5, 6, 7, 10 };
        int[] reversedArray = reverseArray(Array);

        System.out.println(" Array: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }

        System.out.println("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = arr[i];
        }

        return reversedArray;
    }

}
