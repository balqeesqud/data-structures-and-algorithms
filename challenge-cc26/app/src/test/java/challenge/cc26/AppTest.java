/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc26;

import challenge.InsertionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testInsertionSort() {
        InsertionSort sortingUtils = new InsertionSort();
        int[] inputArray = {8, 4, 23, 42, 16, 15};
        int[] expectedSortedArray = {4, 8, 15, 16, 23, 42};

        sortingUtils.insertionSort(inputArray, inputArray.length);
        assertArrayEquals(expectedSortedArray, inputArray);
    }
}
