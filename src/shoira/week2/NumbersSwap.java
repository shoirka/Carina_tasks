package shoira.week2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;

            a = a + b; //10+20=30
            b = a - b; // 20-10=10b
            a = a - b; //30-10=20a


            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }


