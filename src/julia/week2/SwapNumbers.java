package julia.week2;

public class SwapNumbers {
    public static void swapNumbers(int x, int y) {

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
/*
Swap two variable values without using a third variable
*/



