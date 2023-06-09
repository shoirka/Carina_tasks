package marat.week1;

public class Finra {

    private int num;

    public Finra(int num) {
        setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void finra(int num){
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println("cannot be divided neither to 3 nor to 5");
        }
    }

}
/*
 FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */