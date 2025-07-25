package com.equinox.equinox_essentials.source;

import java.util.regex.Pattern;

public class Checker {

    // Method to check if the provided string is a valid email address
    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false; // Return false for null or empty strings
        }

        // Regex pattern for validating an email address
        String emailRegex = "^[\\w-\\.]+@[\\w-\\.]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        return pattern.matcher(email).matches(); // Check for a match
    }
    // Method to check if the provided string is really a number
    public boolean isNumber(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Return false for null or empty strings
        }

        try {
            Double.parseDouble(input); // Try to parse the string as a double
            return true; // If parsing succeeds, it's a number
        } catch (NumberFormatException e) {
            return false; // If parsing fails, it's not a number
        }
    }

}