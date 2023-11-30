import static org.junit.Assert.*;
import org.junit.Test;

public class TestSelectionSort {

    public TestSelectionSort() {
    }

    @Test
    public void testPositive() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {9, 6, 2, 1, 7};
        int[] expected = {1, 2, 6, 7, 9};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testNegative() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {-1, -8, -2, -7, -9};
        int[] expected = {-9, -8, -7, -2, -1};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {7, 2, -2, 0, -4};
        int[] expected = {-4, -2, 0, 2, 7};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testDuplicates() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {4, 1, 4, -6, 5};
        int[] expected = {-6, 1, 4, 4, 5};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }
}
