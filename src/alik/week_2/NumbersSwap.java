package alik.week_2;

/**
 * Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

    public static void main(String[] args) {
        double a = 3.0;
        double b = 5.0;

        System.out.println("Initial values:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped values:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
