package Katya;

public class DivisionWithoutOperator {

    public static void divideWOOperator(int a, int b) {

        if (b == 0) {
            System.out.println("Warning: we cannot divide by zero");
            return;
        }
        if (a < 0) {
            a = a + (a * (-2)); // if my given a is negative number
        }
        if (b < 0) {
            b = b + (b * (-2)); // if my given b is negative number
        }
        double result = 0;
        while (a <= b) {
            a = (a * 10);
            a -= b;
            result += 0.1;
            while (a >= b) {
                a -= b;
                result += 0.1;
                if (a == 0) {
                }
            }
            break;
        }

        while (a >= b) {
            a -= b;
            result++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        divideWOOperator(10, 2);
    }
}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */