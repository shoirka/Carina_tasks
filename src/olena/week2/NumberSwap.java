package olena.week2;

public class NumberSwap {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        System.out.println(a + " " + b);

        a = b + a; // 6
        b = a - b; // 6 - 4 = 2;
        a = a - b; // 6 - 2 = 4;

        System.out.println(a + " " + b);


    }
}