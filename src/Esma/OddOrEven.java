package Esma;

public class OddOrEven {
    public static void main(String[] args) {

        oodOrEven(-4);
        oodOrEven(7);
    }

     static int oodOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " : is an even number");
        } else {
            System.out.println(num + " : is an odd number");
        }
        return num;

    }

}




/*
 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */