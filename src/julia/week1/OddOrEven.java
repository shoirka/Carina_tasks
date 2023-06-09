package julia.week1;

public class OddOrEven {

    /*
       Write a method which can identify given number is even or odd
    */

    public static int identifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");

        }
        return number;
    }


    public static int identifyNumber2(int number2) {
        String result = "";
        result = (number2 % 2 == 0) ? "The number " + number2 + " is even" : "The number " + number2 + " is odd";
        return number2;
    }


    public static void main(String[] args) {

        int number = 16;
        boolean isEven = false;
        boolean isOdd = true;


        System.out.println(isOdd);
        System.out.println("===============================================");


        identifyOddEven(5);
        identifyOddEven(6);
    }
    public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}
    }
    }



