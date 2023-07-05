package sucharita.week_6;

/**
 *  Array_FindMaximum
 * Write a method that can find the maximum number from an int Array
 * Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
public class Array_FindMaximum {
    public static void main(String[] args) {

        /*int[] arr={99, 12, 23, 32, 44, 57, 6};

        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>max){
                arr[i]=max;
            }
        }
        System.out.println(max);

         */
        int[] arr={99, 12, 23, 32, 44, 57, 6,1000};
        System.out.println(maxNum(arr));

        int[] arr1={};
        System.out.println(maxNum(arr1));




    }


public static int maxNum(int[] arr){
        if(arr.length==0){
            System.out.println("arr is empty");
            return -1;
        }
        int max=arr[0];
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
}
