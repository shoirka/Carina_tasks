package oleh_k.week_6;
/**
 *  Java Coding Tasks - Week6
 *
 *   String_SumOfAllDigits
 * Write a method that can return the sum of the digits in a string
 * Ex:  "12 java 5 apple 3"  ==>  20
 */
public class String_SumOfAllDigits {
    public static int sumOfDigits(String str){
        int count=0;
        String[] arr=str.split(" ");
        for (String each : arr) {
            try {
                count+=Integer.parseInt(each);
            }catch (NumberFormatException e){

            }

        }
        return count;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "123 apple 45 banana 678",        // Sum: 846
                "0 0 0 word 0",                   // Sum: 0
                "9876543 apple 21 banana",        // Sum: 9876564
                "word 1",                         // Sum: 1
                "12 apple 34 banana 56 78 word",  // Sum: 180
                "-100 apple 200 -300 banana 400", // Sum: 200
                "-1 banana -2 apple -3 word -4",  // Sum: -10
                "apple 5 java -3 banana word",   // Sum: 2
                "banana" // Sum: 0
        };
        for (String each : testCases) {
            System.out.println(each+" -> "+sumOfDigits(each));
        }

    }

}
