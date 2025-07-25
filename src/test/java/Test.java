import com.equinox.equinox_essentials.Essentials;

public class Test {
    public static void main(String[] args) {
        Essentials.logger.logString("Hello!");
        Essentials.logger.logCompletion("Hello!");
        Essentials.logger.createProgressBar("Progress", 100);
    }
}
