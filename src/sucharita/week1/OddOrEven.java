package sucharita.week1;

public class OddOrEven {
    public static void OddOrEven(int num){
        if(num % 2==0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }

    public static void main(String[] args) {
        OddOrEven(99);

        OddOrEven(-10);
    }

}

/*
 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */