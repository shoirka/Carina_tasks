package alik.week_8;

import java.util.Arrays;

/**
 * Array_MoveZerosToTheEnd
 * Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZerosToTheEnd {

    public static int[] moveZerosToTheEnd(int[] arr) {
        int[] result = new int[arr.length];
        int notZeroCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                result[notZeroCount] = arr[i];
                notZeroCount++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }

}
