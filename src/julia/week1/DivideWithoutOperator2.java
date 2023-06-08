package julia.week1;

public class DivideWithoutOperator2 {
    public static void main(String[] args) {

        //Write a method that can divide two numbers without using division operator
        divides(6,3);
        divides(4,2);
        divides(3,0);
        divides(0,2);
    }

    public static void divides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
}





