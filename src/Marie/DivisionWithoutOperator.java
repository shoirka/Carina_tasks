package Marie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithoutOperator {

    public static double Division(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter number you want to be numerator");
        double numerator = scan.nextDouble();
        scan.nextLine();
        int zeroPoint = 1;
        if (numerator == 0){
            return 0;
        }
        if (numerator < 0 ) {
            zeroPoint *= -1;
            numerator *= zeroPoint;
        }

        System.out.println("Please Enter number you want to be a denominator");
        double denominator = scan.nextDouble();
        scan.nextLine();
        if (denominator == 0) {
            throw new ArithmeticException ("you can`t divide numbers using 0 as denominator");
        }
        if (denominator < 0 ) {
            zeroPoint *= -1;
            denominator *= zeroPoint;
        }

        return  (zeroPoint * Division(numerator, denominator));
    }

    public static double Division(double numerator, double denominator){

        int i = 0;
        while (numerator >= denominator) {

            numerator -= denominator;
            ++i;
        }
        return ((double) i);
    }



    // scan.close();
    public static void main(String[] args) {
        try {
            System.out.println("Results of the division are: " + Division());
        }
        catch (InputMismatchException e) {
            System.out.println("Please use numbers only!");
        }
    }

}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */