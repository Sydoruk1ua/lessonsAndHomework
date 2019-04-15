package com.sydoruk1ua.homework.home2;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class FiveSorts {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        fillArray(array);
        int[] tempArray = Arrays.copyOf(array, array.length);
        /**Bubble sort*/
        Instant start = Instant.now();
        doBubbleSort(array);
        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);
        System.out.println("Buble sort time: " + interval.getNano());
        /**Selection sort*/
        System.arraycopy(tempArray, 0, array, 0, array.length);
        start = Instant.now();
        doSelectionSort(array);
        end = Instant.now();
        interval = Duration.between(start, end);
        System.out.println("Selection sort time: " + interval.getNano());
        /**Insertion sort*/
        System.arraycopy(tempArray, 0, array, 0, array.length);
        start = Instant.now();
        doInsertionSort(array);
        end = Instant.now();
        interval = Duration.between(start, end);
        System.out.println("Insertion sort time: " + interval.getNano());
        /**Merge sort*/
        System.arraycopy(tempArray, 0, array, 0, array.length);
        start = Instant.now();
        doMergeSort(array, array.length);
        end = Instant.now();
        interval = Duration.between(start, end);
        System.out.println("Merge sort time: " + interval.getNano());
        /**Quick sort*/
        System.arraycopy(tempArray, 0, array, 0, array.length);
        start = Instant.now();
        doQuickSort(array, 0, array.length - 1);
        end = Instant.now();
        interval = Duration.between(start, end);
        System.out.println("Quick sort time: " + interval.getNano());
    }

    public static void doInsertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void doBubbleSort(int array[]) {
        int k;
        for (int m = array.length; m >= 0; m--) {
            for (int i = 0; i < array.length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }

    public static void doSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }


    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1_000_000);
        }
    }

    private static void printArray(int[] array) {
        int count = 0;
        for (int value : array) {
            count++;
            System.out.print(value + " ");
            if (count == 50) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * Additional method for doMergeSort
     */
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void doMergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        doMergeSort(l, mid);
        doMergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void doQuickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            doQuickSort(array, begin, partitionIndex - 1);
            doQuickSort(array, partitionIndex + 1, end);
        }
    }

    /**
     * Additional method for doQuickSort
     */
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
