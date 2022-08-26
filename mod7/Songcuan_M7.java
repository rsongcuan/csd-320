// Ryan Songcuan
// 11/22/21
// Module 7 Assignment
package M7;

import java.util.Scanner;

public class Songcuan_M7 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a password: ");
	String password = input.nextLine();

	System.out.println(
            (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}

	/** Method isPasswordVaild tests whether a string is a valid password */
    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_VALID_PASSWORD = 8;	// Valid length of password
        final int MINIMUM_UPPERCASE = 1;
        final int MINIMUM_LOWERCASE = 1;

            boolean validPassword = 
		isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && 
		isOnlyLettersAndDigits(password) &&
		hasUpperCase(password, MINIMUM_UPPERCASE) &&
                hasLowerCase(password, MINIMUM_LOWERCASE);

            return validPassword;
    }

	/** Method isLengthValid tests whether a string is a valid length */
    public static boolean isLengthValid(String password, int validLength) {
            return password.length() >= validLength;
    }

	/** Method isOnlyLettersAndDigits tests if a string contains only letters
	 and digits */
    public static boolean isOnlyLettersAndDigits(String password) {
            for (int i = 0; i < password.length(); i++) {
		if (Character.isLetterOrDigit(password.charAt(i))) {
                    return false;
		}
            }
            return true;
    }

    public static boolean hasUpperCase(String password, int n) {
            int numberOfUpperCase = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    numberOfUpperCase++;
                }
                if (numberOfUpperCase >= 1) {
                    return true;
                }
            }
            return false;
    }
    public static boolean hasLowerCase(String password, int n) {
            int numberOfLowerCase = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    numberOfLowerCase++;
                }    
                if (numberOfLowerCase >= 1) {
                    return true;
                }
            }
            return false;
    }
}