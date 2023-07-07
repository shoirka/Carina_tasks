package Maryna.week7;

import java.util.Arrays;

public class Array_FindMinimum {
    /*
    Array_FindMinimum
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
            */



        public static void main(String[] args) {

            int[]input ={1,6,3,8,2,0};
            System.out.println("The min element from array \n"+
                    Arrays.toString(input)+
                    "\nis "+findMin(input));
        }

        public static int findMin(int[] input) {
            int minElement=input[0];
            for (int i=1;i<input.length;i++){
                if(input[i]<minElement) minElement=input[i];
            }
            return minElement;
        }
    }

