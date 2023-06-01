package Maryna.week1;

public class DivisionWithoutOperator {

        public static void main(String[] args) {
            System.out.println("Dividing with \"/\"  " + 3 / 4.0);   //reference output
            System.out.println("Dividing without \"/\"  "
                    + divWithoutDiv(3, 4, 0.01));

            //Another simple way -- using Math library. 3/4 the same as 3*(4 power (-1) )
            //System.out.println("Dividing without \"/\" "+3*Math.pow(4,-1));
        }

        public static double divWithoutDiv(int divided, int divisor, double accuracy) {
            int reminder = divided;
            double answer = 0.0;
//at each wile loop iteration we will deduct divisor from divided and add step value to the answer until reminder is greater than divisor
//as soon as reminder is less than divisor  will go to the next step (next for loop iteration) and move decimal point right (step *= 0.1)
//we will do it until our desired accuracy is reached, or reminder is equal zero
            for (double step = 1d; step >= accuracy; step *= 0.1) {
                while (reminder >= divisor) {
                    reminder -= divisor;
                    answer += step;
                }
                if (reminder == 0) break;
                reminder *= 10;
            }
            return answer;
        }
    }
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */

