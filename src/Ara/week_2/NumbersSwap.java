package Ara.week_2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {

    int x = 15;
    int y = 10;

    System.out.println("x = " + x + ",  y = " + y);

    x = x + y; // 15+10 = 25
    y = x - y; // 25-10 = 15
    x = x - y; // 25-15 = 10

    System.out.println("x = " + x + ",  y = " + y);

    }
}
