package com.sparta.jlb;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int arr[] = {3,7,6,2,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("Before Sort");
        BubbleSort sorter = new BubbleSort();
        int sortedArray[] = sorter.bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("After Sort");
    }
}
