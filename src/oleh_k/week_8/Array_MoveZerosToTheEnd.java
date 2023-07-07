package oleh_k.week_8;

import java.util.Arrays;

/**
 * Array_MoveZerosToTheEnd
 * Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZerosToTheEnd {
    public static int[] moveZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0,index=0; i < arr.length; i++) {
            if (arr[i]==0){
                continue;
            }
            result[index++]=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] ={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
