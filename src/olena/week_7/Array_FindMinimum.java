package olena.week_7;
/*
  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
public class Array_FindMinimum {
    public static int isMin(int[] arr) {

        int minNum = arr[0];


    for ( int each : arr){
        if (each < minNum){
            minNum = each;
        }
    }
        return minNum;

}

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6, -99};

        System.out.println(isMin(arr));

    }

}
