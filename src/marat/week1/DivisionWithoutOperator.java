package marat.week1;

public class DivisionWithoutOperator {

    private double number1, number2;

    public DivisionWithoutOperator(double number1, double number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        if(number2 != 0) {
            this.number2 = number2;
        } else {
            System.err.println("Can not divide by zero!");
        }
    }

    public static double division(double number1, double number2){
        return number1 / number2;
    }

}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */