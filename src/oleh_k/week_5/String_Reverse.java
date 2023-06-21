package oleh_k.week_5;

/**
 *   String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {
    public static String reverse (String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String[] words={"Oleh","Shoira","Sucharita"};
        for (String each : words) {
            System.out.println(reverse(each));
        }
    }
}
