package marat.week1;

public class OddOrEven {

    private int number;

    public OddOrEven(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number == 0){
            System.err.println("Zero is selected. Please, enter another number.");
        }
        this.number = number;
    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}

/*
 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */