package Maryna.week3;

import java.util.Scanner;

public class Numbers_Reverse_Negative_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your negative integer");
        int num =scanner.nextInt();

        System.out.println(reverseNegativeInt(num));

    }
    public static int reverseNegativeInt(int num) {

        if (num>=0) throw new IllegalArgumentException("Number not negative");
        else num*=-1;
        String result="-";
        int divisor=10;

        while (num>0){
            result+= num%divisor;
            num=num/divisor;
        }
        return Integer.valueOf(result);
    }
}

