package alik.week_6;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * String_PasswordValidation
 * 1. Write a return method that can verify if a password is valid or not.
 * requirements:
 * 1. Password MUST be at least have 6 characters and should not contain space
 * 2. PassWord should at least contain one upper-case letter
 * 3. PassWord should at least contain one lowercase letter
 * 4. Password should at least contain one special character
 * 5. Password should at least contain a digit
 * if all requirements above are met, the method returns true, otherwise returns  false
 */
public class String_PasswordValidation {

    public static boolean verifyPassword(String password) {
        return password.length() >= 6
                && password.chars().anyMatch(each -> Character.isUpperCase(each))
                && password.chars().anyMatch(each -> Character.isLowerCase(each))
                && password.chars().anyMatch(each -> !Character.isLetterOrDigit(each))
                && password.chars().anyMatch(each -> Character.isDigit(each));
    }

    public static void main(String[] args) {
        String password1 = "ABCdef1_";
        String password2 = "ABC";
        String password3 = "ABCdef1";
        System.out.println(password1 + " - " + verifyPassword(password1));
        System.out.println(password2 + " - " + verifyPassword(password2));
        System.out.println(password3 + " - " + verifyPassword(password3));
    }

}
