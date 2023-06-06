package oleh_k.week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers_Reverse_Negative_Number {
    // 349.0
    public static int reverseNumber(int number) {
        String str = number + "";
        StringBuilder result = new StringBuilder();
        int sign = 1;
        if (str.contains("-")) {
            str = str.replace("-", "");
            sign = -1;
        }
        for (int i = str.length() - 1; i >= 0; i--) { // we can also use string builder reverse method
            result.append(str.charAt(i));
        }
        return Integer.parseInt(result + "") * sign;
    }

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        Random num=new Random();
        for (int i = 0; i < 50; i++) {
            int temp=num.nextInt(1000);
            if (i%2==0){
                numbers.add(temp*-1);
            }else {
                numbers.add(temp);
            }
        }
        for (Integer each : numbers) {
            System.out.println("Before:\t"+each);
            System.out.println("After:\t"+reverseNumber(each));
            System.out.println();
        }
        
    }
}
