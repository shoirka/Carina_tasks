package olena.week3;
/*

 *  Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */

//
/*
    public static void primeNumber (int num){
        if (num >= 1){
        if (num % 1 == 0 && num % num ==0 && num % 2 == 0){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is not prime");
        }
    }
*/

public class NumbersPrimeNumber {

    public static void main(String[] args) {

        PrimeNumber(12);

    }
    public static void PrimeNumber(int numb){

            if (numb <= 1) {
                System.out.println(numb + " - is not prime ");

                for (int i = 2; i < numb; i++) {
                    if (numb % i != 0) {
                        System.out.println(numb + " - is prime ");
                    } else {
                        System.out.println(numb + " - is not prime ");
                    }
                }
            }
        }

        }




