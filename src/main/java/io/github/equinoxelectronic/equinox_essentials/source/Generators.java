package io.github.equinoxelectronic.equinox_essentials.source;

import java.util.Random;

public class Generators {
    private final Random random = new Random();
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final String[] MALE_FIRST_NAMES = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven", "Andrew", "Kenneth"};
    private static final String[] FEMALE_FIRST_NAMES = {"Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Susan", "Jessica", "Sarah", "Karen", "Lisa", "Nancy", "Betty", "Margaret", "Sandra", "Ashley", "Dorothy", "Emily", "Michelle", "Amanda"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin"};

    public String generateRandomString(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be non-negative");
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHAR_SET.length());
            sb.append(CHAR_SET.charAt(index));
        }
        return sb.toString();
    }

    public String generateRandomName(boolean isMale) {
        String firstName;
        if (isMale) {
            firstName = MALE_FIRST_NAMES[random.nextInt(MALE_FIRST_NAMES.length)];
        } else {
            firstName = FEMALE_FIRST_NAMES[random.nextInt(FEMALE_FIRST_NAMES.length)];
        }
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        return firstName + " " + lastName;
    }
    public String getFirstName(boolean isMale) {
        return isMale ? MALE_FIRST_NAMES[random.nextInt(MALE_FIRST_NAMES.length)] : FEMALE_FIRST_NAMES[random.nextInt(FEMALE_FIRST_NAMES.length)];
    }
    public String getLastName() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }
}
