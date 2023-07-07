package Maryna.week7;

import java.util.Arrays;

public class Array_SortAscending {
    /*
  Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

    public static void main(String[] args) {
        int[]input ={1,-7,8,4,99,3};
        System.out.println("Our input array \n"+
                Arrays.toString(input));
        System.out.println("Our ascending sorted array \n"+
                Arrays.toString(sortAsc(input)));
    }

    public static int[] sortAsc(int[] input) {

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input.length-1; j++) {
                if(input[j]>input[j+1]){
                    int tmp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                }
            }
        }
        return input;
    }
}

