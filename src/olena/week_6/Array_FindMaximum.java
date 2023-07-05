package olena.week_6;

/**
 *  Array_FindMaximum
 * Write a method that can find the maximum number from an int Array
 * Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
public class Array_FindMaximum {

    public static void isMax(int[] arr) {


    //public static void findMAx(){
        int maxNum= 0;


    for ( int each : arr){
        if (each > maxNum){
            maxNum = each;
        }
    }
        System.out.println(maxNum);

}

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

    }

    }

