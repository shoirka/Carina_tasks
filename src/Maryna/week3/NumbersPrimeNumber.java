package Maryna.week3;

import java.util.Scanner;

/**
 *  Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {

    public static boolean isPrime(int num){
        for (int i = 2 ; i<num; i++){// iterating the divisors starting from 2 and ending num-1
            if (num%i== 0 ){ // checking  if  out input number is divisible without reminder
                System.out.println(i);
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=s.nextInt();
        if(isPrime(num))
            System.out.println("The number "+num+" is a Prime number");
        else
            System.out.println("The number "+num+" is not a Prime number");

    }
}
