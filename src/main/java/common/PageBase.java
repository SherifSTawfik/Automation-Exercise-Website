package common;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class PageBase {

    public WebDriver driver;


    public PageBase(WebDriver driver) {

        this.driver = driver;

    }

    // long explicit wait
    public static WebDriverWait longWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    // short explicit wait
    public static WebDriverWait shortWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void quitBrowser(WebDriver driver) {
        // clear browser localStorage , sessionStorage and delete All Cookies
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");
        driver.manage().deleteAllCookies();
        driver.quit();
        // kill browser process on background
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
                // Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
            } else if (os.contains("mac") || os.contains("nix") || os.contains("nux")) {
                Runtime.getRuntime().exec("pkill -f chromedriver");
                // Runtime.getRuntime().exec("pkill -f chrome");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public class AddressGenerator {

        private static final String[] STREET_NAMES = {
                "Main St", "High St", "Broadway", "1st Ave", "2nd Ave",
                "3rd Ave", "Maple Dr", "Oak St", "Pine St", "Cedar Ave"
        };

        private static final String[] CITY_NAMES = {
                "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
                "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
        };

        private static final String[] STATES = {
                "NY", "CA", "IL", "TX", "AZ",
                "PA", "TX", "CA", "TX", "CA"
        };

        private static final Random RANDOM = new Random();

        public static String generateRandomAddress() {
            // Generate random components of the address
            String streetNumber = String.valueOf(RANDOM.nextInt(9999) + 1); // Random number between 1 and 9999
            String streetName = STREET_NAMES[RANDOM.nextInt(STREET_NAMES.length)];
            String cityName = CITY_NAMES[RANDOM.nextInt(CITY_NAMES.length)];
            String state = STATES[RANDOM.nextInt(STATES.length)];
            String postalCode = generateRandomPostalCode();

            // Construct the full address
            return String.format("%s %s, %s, %s %s", streetNumber, streetName, cityName, state, postalCode);
        }

        public static String generateRandomPostalCode() {
            // Generate a random 5-digit postal code
            return String.format("%05d", RANDOM.nextInt(100000));
        }

    }

    public class MobileNumberGenerator {

        private static final Random RANDOM = new Random();

        public static String generateRandomMobileNumber() {
            // Assuming a 10-digit mobile number
            StringBuilder mobileNumber = new StringBuilder();

            // Generate a random mobile number
            // Start with a digit from 7 to 9 (common starting digits for mobile numbers)
            mobileNumber.append(RANDOM.nextInt(3) + 7); // Generates 7, 8, or 9

            // Generate the next 9 digits
            for (int i = 1; i < 10; i++) {
                mobileNumber.append(RANDOM.nextInt(10)); // Generates a digit from 0 to 9
            }

            return mobileNumber.toString();
        }
    }

}
