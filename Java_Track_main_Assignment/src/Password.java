package Java_Track_main_Assignment.src;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {


    System.out.println("Enter a password.");
    Scanner sc = new Scanner(System.in);
    String password = sc.next();
        try {
        validatePassword(password);
    } catch (PasswordException e) {
        System.out.println(e.getMessage());
    }
}
    static String validatePassword(String password) throws PasswordException {
        if (password.length() > 10 && password.length()<5 ) {
            throw new PasswordException("INVALID PASSWORD");
        }
        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean specialCharCheck = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) // This verifies there is a uppercase letter
            {
                upperCheck = true;
            }
            else
            if (Character.isLowerCase(c)) // This verifies there is a lowercase letter
            {
                lowerCheck = true;
            }
            else if (Character.isDigit(c)) // This verifies there is a digit
            {
                digitCheck = true;
            }
            else
            {
                specialCharCheck = true;
            }
        }
        if (!upperCheck) {
            throw new PasswordException("There must be an uppercase character");
        }
        if (!lowerCheck) {
            throw new PasswordException("There must be a lowercase character");
        }
        if (!digitCheck) {
            throw new PasswordException("There must a be a digit");
        }
        if (!specialCharCheck) {
            throw new PasswordException("There must a be a Special character");
        }
        return "Valid password";
    }
    static class PasswordException extends Exception {
    public PasswordException() {
        super("Invalid password");
    }
    public PasswordException(String message) {
        super("Invalid password: " + message);
    }
}}

