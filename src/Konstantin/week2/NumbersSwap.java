package Konstantin.week2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
