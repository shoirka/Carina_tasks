package oleh_k.week_7;
/*
  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
public class Array_FindMinimum {
    public static int minimumNumber(int [] arr){
        if (arr.length==0||arr==null){
            throw new IllegalArgumentException();
        }
        int min=Integer.MAX_VALUE;
        for (int each : arr) {
            if (min>each){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minimumNumber(arr));
    }

}
