import java.sql.Driver;

public class BrowserFacade {
    public static void generateReports(String explorer, String report, String test) {
        Driver driver = null;
        if (explorer == "Firefox") {
            driver = Firefox.getFirefoxDriver();
            if (report == "HTML") {
                driver = Firefox.getFirefoxHTML();
            }
            if (test == "test") {
                driver = Firefox.getFirefoxJUNIT();
            }
        }
    }
}
