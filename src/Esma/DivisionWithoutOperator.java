package Esma;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        System.out.println( divide(10,2));

    }

    static int divide(int dividend, int divisor){
            int result = 0;
        while(dividend>=divisor){
            dividend = dividend - divisor;
                result++; // 1,2,3,4,5
        }
        return result; // 5
    }
}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */