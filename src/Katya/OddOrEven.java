package Katya;

public class OddOrEven {

    public static void oddEven(int num){

        if(num % 2 == 0){
            System.out.println("identify("+ num + "); -> \"Even\"");
        }else{
            System.out.println("identify("+ num + "); -> \"Odd\"");
        }
    }

    public static void main(String[] args) {
        oddEven(3);
        oddEven(2);
    }
}

/*
 Numbers Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */