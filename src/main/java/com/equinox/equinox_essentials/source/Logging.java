package com.equinox.equinox_essentials.source;

public class Logging {
    private static final int BAR_WIDTH = 50;
    private static final char PROGRESS_CHAR = '█';
    private static final char EMPTY_CHAR = '░';
    public static final String ANSI_BLUE = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void createProgressBar(String title, int total) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total must be greater than 0");
        }
        System.out.print("\r" + title + "\n[");
        for (int i = 0; i < BAR_WIDTH; i++) {
            System.out.print(EMPTY_CHAR);
        }
        System.out.print("] 0%");
    }

    public void updateProgressBar(int current, int total) {
        if (current < 0 || total <= 0 || current > total) {
            throw new IllegalArgumentException("Invalid progress values");
        }

        int percentage = (int) ((double) current / total * 100);
        int progressWidth = (int) ((double) current / total * BAR_WIDTH);

        StringBuilder bar = new StringBuilder("\r[");
        for (int i = 0; i < BAR_WIDTH; i++) {
            bar.append(i < progressWidth ? PROGRESS_CHAR : EMPTY_CHAR);
        }
        bar.append(String.format("] %d%%", percentage));

        System.out.print(bar);
        if (current == total) {
            System.out.println();
        }
    }

    public void logString(String string) {
        String prefix = "["+ANSI_BLUE+"INFO"+ANSI_RESET+"] ";
        System.out.println(prefix + string);
    }
    public void logError(String string) {
        String prefix = "["+ANSI_RED+"ERROR"+ANSI_RESET+"] ";
        System.out.println(prefix + string);
    }
    public void logWarning(String string) {
        String prefix = "["+ANSI_YELLOW+"WARNING"+ANSI_RESET+"] ";
        System.out.println(prefix + string);
    }
    public void logVerbose(String string, boolean isVerbose) {
        String prefix = "["+ANSI_BLUE+"LOGGER" +ANSI_RESET+"] "+ANSI_BLUE;
        if(isVerbose) {
            System.out.println(prefix + string + ANSI_RESET);
        }
    }
    public void logCompletion(String string) {
        String prefix = ANSI_GREEN+" ";
        System.out.println(prefix + string + ANSI_RESET);
    }
}
