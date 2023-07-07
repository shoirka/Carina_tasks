package marat.week07;

/*
 Array_SortDescending
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class Array_SortDescending {
    public static int[] sortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        return arr;
    }
}
