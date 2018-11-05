package com.sparta.jlb;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            int n = arr.length;
            for (int i = 0; i < n -1; i++) {
                if (arr[i] > arr[i+1]) {
                    int x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                    swapped = true;
                }
        }
        }while (swapped);
        return arr;
    }


}
