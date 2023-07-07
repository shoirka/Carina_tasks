package olena.week_7;

import java.util.ArrayList;
import java.util.Arrays;

/*
  Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
public class Array_SortAscending {

    public static int[] sortArr(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {


        int[] arr = {10, 9, 8, 7};

        arr = sortArr(arr);
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }

    }

