package olena;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        divideNumWithoutOperator(100,5);

      int  number = divideNumWithoutOperator(100,5);

        System.out.println(number);
    }

        public static int divideNumWithoutOperator ( int dividend,int divisor){

            int result = 0;
            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
            return result;
        }

    }








/*
2️⃣ Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator

 */