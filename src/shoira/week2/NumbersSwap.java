package shoira.week2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            swapNumbers(a, b);

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        public static void swapNumbers(int a, int b) {
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Swapped values inside the method:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }










