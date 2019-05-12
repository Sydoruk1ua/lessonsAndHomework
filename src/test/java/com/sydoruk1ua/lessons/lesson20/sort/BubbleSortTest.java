package com.sydoruk1ua.lessons.lesson20.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sholdSortArray() {
        int[] testData = {-1, 1, 10, -3, 7, 2, -0};
        int[] expectedArray = {-3, -1, 0, 1, 2, 7 , 10};
        bubbleSort.sort(testData);
        assertArrayEquals(expectedArray, testData);
    }

}