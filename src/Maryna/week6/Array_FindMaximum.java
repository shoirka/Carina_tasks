package Maryna.week6;

import java.util.Arrays;

public class Array_FindMaximum {
    /* Write a method that can find the maximum number from an int Array
 * Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
            */

    public static void main(String[] args) {

        int[]input ={1,6,3,8,2,0};
        System.out.println("The max element from array \n"+
                Arrays.toString(input)+
                "\nis "+ findMax(input));
    }

    public static int findMax(int[] input) {
        int maxElement=input[0];// we are starting to compare with the first element of the array,from index 0
        for (int i=1;i<input.length;i++){//iterating  through the whole length of the array
            if(input[i]>maxElement) maxElement=input[i];
        }
        return maxElement;
    }
}




