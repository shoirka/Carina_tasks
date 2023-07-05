package sucharita.week_6;

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

    public static boolean verifyPassword(String str){
        if(str.length()<6 || str.contains(" ")){
            return false;
        }
        boolean upperCase=false,lowerCase = false,specialChar=false,digit=false;

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

            if(Character.isUpperCase(each)){
                upperCase=true;
            }
            if(Character.isLowerCase(each)){
                lowerCase=true;
            }
            if(!Character.isLetterOrDigit(each)){
                specialChar=true;
            }
            if(Character.isDigit(each)){
                digit=true;
            }
            if(upperCase && lowerCase && specialChar && digit)
                return true;
            }
        return false;
        }

    public static void main(String[] args) {
        System.out.println(verifyPassword("passWord3#"));
    }

}
