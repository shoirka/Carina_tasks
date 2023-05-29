package oleh_k.week_1;

import java.text.DecimalFormat;

public class DivisionWithoutOperator {


    public static double divisionWithoutOperator(int nominator, int denominator) {
        if (nominator == 0) {
            return 0;
        }
        if (denominator == 0) {
            throw new ArithmeticException("Denominator can not be 0");
        }
        int sign = 1;
        if (nominator < 0 && denominator > 0 || nominator > 0 && denominator < 0) {
            sign = -1;
        }

        nominator = Math.abs(nominator);
        denominator = Math.abs(denominator);
        int intCount = 0;
        while (nominator >= denominator) {
            nominator -= denominator;
            intCount++;

        }

        double decimalCount = 0;
        if (nominator < denominator&&nominator!=0) {
            nominator = nominator * 10;
            while (nominator>=denominator){
                nominator-=denominator;
                decimalCount+=0.1;
            }
        }

        return (intCount+decimalCount)*sign;

    }

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("###,###.0");
        String s=df.format(5.66666666666);
        double number=Double.parseDouble(s);

        System.out.println(divisionWithoutOperator(5, -2));
        System.out.println(divisionWithoutOperator(6, -2));
        System.out.println(divisionWithoutOperator(1, -2));
        System.out.println(divisionWithoutOperator(8, 3));


    }
}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */