package olena.week_6;

/**
 *   String_PasswordValidation
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

    public static boolean isValidPassword(String password) {
        // Check if the password has at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }
        }

        // Check if all criteria are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    private static boolean isSpecialChar(char ch) {
        // Define the special characters that can be used in the password
        String specialChars = "!@#$%^&*()";
        return specialChars.contains(Character.toString(ch));
    }

    public static void main(String[] args) {
        isValidPassword("g38dY888@");

        System.out.println(isValidPassword("g38dY888@"));
    }
}






