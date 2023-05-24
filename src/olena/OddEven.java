package olena;

public class OddEven {

    public static void main(String[] args) {

        OddOrEven(8);
        OddOrEven(7);
    }


        public static void OddOrEven (int num){
            if (num % 2 == 0) {
                System.out.println(num + " -> \"Odd\"");
            } else {
                System.out.println(num + " -> \"Even\"");
            }
        }

    }


/*
 Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */