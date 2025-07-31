package io.github.equinoxelectronic.equinox_essentials.source;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {
    public enum securityLevels  {HASH, SALTED_HASH, SHIFTED_HASH, FULLY_ENCRYPTED}
    public enum security {NONE, LOW, MEDIUM, HIGH}
    Generators generators = new Generators();
    public String[] encryptString(String input, securityLevels securityLevel, int shift) {
        String[] output;
        switch (securityLevel) {
            case HASH:
                output = new String[1];
                break;
            case SALTED_HASH:
                output = new String[2];
                break;
            case SHIFTED_HASH:
                output = new String[3];
                break;
            case FULLY_ENCRYPTED:
                output = new String[4];
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + securityLevel);
        }

        String salt = generators.generateRandomString(8);
        if(!(securityLevel == securityLevels.HASH)) {
            output[1] = salt;
            input = input + salt;
        }

        if(securityLevel == securityLevels.FULLY_ENCRYPTED || securityLevel == securityLevels.SALTED_HASH) {
            input = shiftString(input, shift);
        }

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            input = bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }

        if(securityLevel == securityLevels.FULLY_ENCRYPTED) {
            MessageDigest digest = null;
            try {
                digest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
            byte[] hash = digest.digest(input.getBytes());
            input = bytesToHex(hash);
        }
        output[0] = input;
        return output;
    }

    public String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public String shiftString(String input, int shift) {
        StringBuilder shifted = new StringBuilder();
        for (char c : input.toCharArray()) {
            shifted.append((char) (c + shift));
        }
        return shifted.toString();
    }

    public security checkPasswordSecurity(String password) {
        if (password == null || password.length() < 8) {
            return security.NONE;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            else if (Character.isLowerCase(c)) hasLowerCase = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        int criteria = 0;
        if (hasUpperCase) criteria++;
        if (hasLowerCase) criteria++;
        if (hasDigit) criteria++;
        if (hasSpecial) criteria++;

        if (criteria == 4 && password.length() >= 12) return security.HIGH;
        if (criteria >= 3) return security.MEDIUM;
        if (criteria >= 2) return security.LOW;
        return security.NONE;
    }


}
