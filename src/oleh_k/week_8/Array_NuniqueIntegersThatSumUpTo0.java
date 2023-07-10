package oleh_k.week_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Array_NuniqueIntegersThatSumUpTo0
 * Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
 * The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
 * The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
 * For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */
public class Array_NuniqueIntegersThatSumUpTo0 {
    public static int[] nUniqueIntegersThatSumUpTo0(int n, int numbersRange) {
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("1 < N < 100");
        }
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int sign = 0;
        while (set.size() < n-1) {
            if (sign % 2 == 0) {
                sign++;
                set.add(-random.nextInt(numbersRange));
                continue;
            }
            set.add(random.nextInt(numbersRange));
        }
        int[] result = new int[set.size()+1];
        int index = 0;
        int sum = set.stream().mapToInt(Integer::intValue).sum();
        for (Integer each : set) {
            result[index++] = each;
        }
        result[index]=  -set.stream().mapToInt(Integer::intValue).sum();
        return result;
    }
    public static int[]  nUniqueIntegersThatSumUpTo0_2(int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length-1; i++) {
            res[i++]=i;
            res[i]=-i;
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nUniqueIntegersThatSumUpTo0(5,5)));
        System.out.println(Arrays.toString(nUniqueIntegersThatSumUpTo0_2(5)));

    }
}
