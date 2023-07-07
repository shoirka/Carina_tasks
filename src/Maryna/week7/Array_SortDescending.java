package Maryna.week7;

import java.util.Arrays;

public class Array_SortDescending {
    /*
 Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */



        public static void main(String[] args) {
            int[]input ={1,-7,8,4,99,3};
            System.out.println("Our input array \n"+
                    Arrays.toString(input));
            System.out.println("Our descending sorted array \n"+
                    Arrays.toString(sortDesc(input)));

        }

        public static int[] sortDesc(int[] input) {

            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length-1; j++) {
                    if(input[j]<input[j+1]){
                        int tmp=input[j];
                        input[j]=input[j+1];
                        input[j+1]=tmp;
                    }
                }
            }
            return input;
        }


    }

