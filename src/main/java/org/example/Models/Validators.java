package org.example.Models;

public class Validators {
    public static boolean isACorrectPassword(String password) {
        int minLength = 6;
        if (password.length() < minLength) {
            return false;
        }

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                isLowerCase = true;
            } else if (Character.isDigit(c)) {
                isDigit = true;
            }

            if (isUpperCase && isLowerCase && isDigit) {
                return true;
            }
        }
        return false;
    }
}
