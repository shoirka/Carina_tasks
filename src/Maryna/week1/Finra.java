package Maryna.week1;

public class Finra {
    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            String result = "";

            if (i % 3 == 0 && i % 5 == 0)
                result = "FINRA";
            else if (i % 5 == 0) {
                result = "RA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else {
                result = i + "";
            }
        }
    }
}