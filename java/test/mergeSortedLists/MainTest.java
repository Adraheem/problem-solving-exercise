package mergeSortedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeEqualLengthArraysTest() {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, Main.mergeSortedLists(arr1, arr2));
    }

    @Test
    void mergeUnequalLengthArraysTest() {
        int[] arr1 = {1, 3, 4, 5, 7, 7, 12};
        int[] arr2 = {2, 6, 7, 8, 10};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 10, 12};
        assertArrayEquals(expected, Main.mergeSortedLists(arr1, arr2));
    }

}