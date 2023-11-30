import static org.junit.Assert.*;
import org.junit.Test;

public class TestSelectionSort {

    public TestSelectionSort() {
    }

    @Test
    public void testPositive() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {11, 6, 3, 1, 8};
        int[] expected = {1, 3, 6, 8, 11};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testNegative() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {-1, -10, -4, -7, -13};
        int[] expected = {-13, -10, -7, -4, -1};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {9, 2, -1, 0, -4};
        int[] expected = {-4, -1, 0, 2, 9};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testDuplicates() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {4, 2, 4, -6, 8};
        int[] expected = {-6, 2, 4, 4, 8};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }
}
