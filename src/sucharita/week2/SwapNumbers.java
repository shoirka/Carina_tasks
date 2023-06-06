package sucharita.week2;

public class SwapNumbers {

    public static void main(String[] args) {
        int x=20;
        int y=9;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

       x=x-y;//20-9=11
        y=x+y;//11+9=20
        x=y-x;//20-11=9

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
/*
Swap two variable values without using a third variable
 */