package oleh_k.week_7;

import java.util.Arrays;

/*
 Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class Array_SortDescending {
    public static void sortDescendingOrder(int[] arr) {
        if (arr.length==0||arr==null){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0, i3 = 1; i2 < arr.length - 1 - i; i2++, i3++) {
                if (arr[i2] < arr[i3]) {
                    int temp = arr[i2];
                    arr[i2] = arr[i3];
                    arr[i3] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, -1, 100,4,100,-1,300,55,-500};
        sortDescendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
