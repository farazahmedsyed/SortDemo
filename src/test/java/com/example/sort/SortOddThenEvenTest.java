package com.example.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortOddThenEvenTest {

    @Test
    public void unitTest_execute_oddEvenArray_success() {
        Integer arr[] = {2, 10, 77, 3, 3, 0, -1};
        Integer expected[] = {-1, 3, 3, 77, 0, 2, 10};
        SortOddThenEven.execute(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void unitTest_execute_nullArray_remainSame() {
        Integer arr[] = null;
        Integer expected[] = null;
        SortOddThenEven.execute(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void unitTest_execute_emptyArray_remainSame() {
        Integer arr[] = {};
        Integer expected[] = {};
        SortOddThenEven.execute(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void unitTest_execute_evenArray_success() {
        Integer arr[] = {2, 6, 4, 0, -2};
        Integer expected[] = {-2, 0, 2, 4, 6};
        SortOddThenEven.execute(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void unitTest_execute_oddArray_success() {
        Integer arr[] = {1, 9, 5, 0, -1};
        Integer expected[] = {-1, 1, 5, 9, 0};
        SortOddThenEven.execute(arr);
        Assertions.assertArrayEquals(expected, arr);
    }
}
