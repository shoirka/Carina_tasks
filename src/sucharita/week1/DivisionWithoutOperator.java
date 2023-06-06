package sucharita.week1;

import java.util.Scanner;

public class DivisionWithoutOperator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers :");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int dividend = 0;
        int divisor = 0;
        int result = 0;
        int reminder = 0;


        while (!((num1 > 0) && (num2 > 0))) {
            System.err.println("The number you entered is zero or negative");
            System.out.println("try again");
            break;

        }


        if (num1 >= num2) {
            divisor = num1;
            dividend = num2;
        } else {
            divisor = num2;
            dividend = num1;
        }
        while (divisor >= dividend) {
            reminder += divisor % dividend;
            divisor -= dividend;
            result++;
        }
        if (reminder == 0) {
            System.out.println(result);
        } else {
            System.out.println(result + "." + reminder);
        }
    }
}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */