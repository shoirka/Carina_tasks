package alik.week_8;

import java.util.Arrays;

/**
 * Array_NuniqueIntegersThatSumUpTo0
 * Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
 * The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
 * The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
 * For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */
public class Array_NuniqueIntegersThatSumUpTo0 {
    public static int[] uniqueIntegersThatSumUpTo0(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be > 0");
        }


        int[] arr = new int[n];

        for (int i = 1; i <= n / 2; i++) {
            arr[i - 1] = i;  // {1,2,3,.....}
            arr[arr.length - i] = -i;  // {.....-3,-2,-1}
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(1)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(2)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(3)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(4)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(5)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(6)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(7)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(8)));
        System.out.println(Arrays.toString(uniqueIntegersThatSumUpTo0(9)));
    }
}
