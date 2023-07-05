package aaron.week_6;

import java.util.Arrays;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, 6, 9, 15}));
        System.out.println(maxValue2(new int[]{5, 6, 9, 15}));
    }
    public static int maxValue( int[]  num ) {
        int max = Integer.MIN_VALUE;
        for(int each: num)
            if(each > max)
                max = each;
        return max;
    }
    public static int maxValue2( int[]  num ) {
        Arrays.sort( num );
        return  num [ num.length-1 ];
    }
}
