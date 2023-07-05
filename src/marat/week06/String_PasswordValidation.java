package marat.week06;

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
    public static boolean passwordValidation(String password) {
        char[] chars = password.toCharArray();
        if (chars.length < 6) {
            return false;
        }
        boolean isUpper = false;
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                isUpper = true;
            }
        }
        if (isUpper) {
        } else {
            return false;
        }
        boolean isLower = false;
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                isLower = true;
            }
        }
        if (isLower) {
        } else {
            return false;
        }
        boolean isSpec = false;
        for (char aChar : chars) {
            if (!(Character.isLetterOrDigit(aChar))) {
                isSpec = true;
            }
        }
        if (isSpec) {
        } else {
            return false;
        }
        boolean isDigit = false;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                isDigit = true;
            }
        }
        if (isDigit) {
        } else {
            return false;
        }
        return true;
    }
}
