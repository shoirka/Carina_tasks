package oleh_k.week_6;

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

    public static boolean passwordValidation(String str) {
        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }
        boolean oneUpperCase = false;
        boolean oneLoverCase = false;
        boolean oneSpecialCharacter = false;
        boolean oneDigit = false;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                oneUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                oneLoverCase = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                oneSpecialCharacter = true;
            }
            if (Character.isDigit(ch)) {
                oneDigit = true;
            }
            if (oneUpperCase && oneLoverCase && oneSpecialCharacter && oneDigit){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String[] passwords = {
                "Passw1rd!",
                "Passw1rd !",
                "SecureP@ss",
                "123Abc!",
                "short",
                "Password with space",
                "lowercase",
                "UPPERCASE",
                "password123",
                "!@#$%^&*()",
                "",
                "123Abc!"
        };

        for (String each : passwords) {
            System.out.println(each+" -> "+passwordValidation(each));
        }
    }

}
