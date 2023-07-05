package oleh_k.week_7;

import java.util.Arrays;

/*
  Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
public class Array_SortAscending {
    public static void sortAscendingOrder(int[] arr) {
        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i < arr.length; i++) {
            int start = i - 1;
            int end = i;
            while (start >= 0 && arr[end] < arr[start]) {
                if (arr[end] > arr[start]) {
                    break;
                }
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start--;
                end--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, -1, 100, 4, 100, -1, 300, 55, -500};
        sortAscendingOrder(arr);
        System.out.println(Arrays.toString(arr));

    }
}
