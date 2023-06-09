package week_2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {
        int x = 100;
        int y = 5;
        System.out.println("Before:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x=x+y; // 100+5 -> 105
        y=x-y; // 105-5 -> 100
        x=x-y; // 105-100 -> 100
        System.out.println("After:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
