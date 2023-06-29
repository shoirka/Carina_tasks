package alik.week_6;

import java.security.InvalidParameterException;

/**
 * Array_FindMaximum
 * Write a method that can find the maximum number from an int Array
 * Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
public class Array_FindMaximum {

    private static int max(int[] arr) {
        if (arr.length == 0) {
            throw new InvalidParameterException("Empty array");
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = Integer.max(result, arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(max(arr));
    }

}
