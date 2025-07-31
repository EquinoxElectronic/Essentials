package io.github.equinoxelectronic.equinox_essentials.source;

public class Constants {
    public final double GOLDEN_RATIO = 1.618033988749895;

    // Common numerical constants
    public final int SECONDS_IN_MINUTE = 60;
    public final int MINUTES_IN_HOUR = 60;
    public final int HOURS_IN_DAY = 24;
    public final int DAYS_IN_WEEK = 7;
    public final int MONTHS_IN_YEAR = 12;

    // Regular expression patterns
    public final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
    public final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    public final String URL_PATTERN = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    // ANSI escape codes for text colors
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";

    // ANSI escape codes for text formatting
    public final String ANSI_BOLD = "\u001B[1m";
    public final String ANSI_ITALIC = "\u001B[3m";
    public final String ANSI_UNDERLINE = "\u001B[4m";
    public final String ANSI_BLINK = "\u001B[5m";
}
