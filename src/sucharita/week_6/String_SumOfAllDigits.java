package sucharita.week_6;
/**
 *  Java Coding Tasks - Week6
 *
 *   String_SumOfAllDigits
 * Write a method that can return the sum of the digits in a string
 * Ex:  "12 java 5 apple 3"  ==>  20
 */
public class String_SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12 java 5 apple 3"));

    }
    public  static int  sumOfDigits(String str) {
        int total = 0;
        char[] ch =  str.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }
}
