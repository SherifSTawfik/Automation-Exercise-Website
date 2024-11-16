package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Utility {

    public class RandomNameGenerator {

        private static String[] Names = {
                "John", "Jane", "Michael", "Sarah", "David", "Emily",
                "James", "Jessica", "Robert", "Linda", "William", "Patricia",
                "Daniel", "Barbara", "Matthew", "Elizabeth"
        };

        public static String generateRandomName() {
            Random random = new Random();
            return Names[random.nextInt(Names.length)];
        }
    }

    public class RandomEmailGenerator {
        private static final String[] FIRST_NAMES = {
                "Ava", "Liam", "Zoe", "Ethan", "Maya", "Jasper", "Nina", "Leo"
        };

        private static final String[] LAST_NAMES = {
                "Robinson", "Thompson", "Martin", "Harris", "Brown", "Davis", "Miller", "Wilson"
        };

        public static String generateRandomEmail() {
            Random random = new Random();
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            return String.format("%s.%s@xyz.com", firstName.toLowerCase(), lastName.toLowerCase());
        }
    }
    // TODO: generate random email (gmail or outlook)
    private static final String[] GMAIL_DOMAINS = {"gmail.com"};
    private static final String[] OUTLOOK_DOMAINS = {"outlook.com"};

    public static String generateRandomEmail() {
        Random random = new Random();
        String[] domains = random.nextBoolean() ? GMAIL_DOMAINS : OUTLOOK_DOMAINS;
        String domain = domains[random.nextInt(domains.length)];

        int length = random.nextInt(10) + 5; // Random length between 5 and 14
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 97); // Random lowercase letter
            username.append(c);
        }

        return username + "@" + domain;
    }
    // TODO: generate complex password of 12 digit
    private static final String CHAR_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER_CASE = CHAR_LOWER_CASE.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?";

    public static String generateComplexPassword(int length) {
        String chars = CHAR_LOWER_CASE + CHAR_UPPER_CASE + NUMBER + SPECIAL_CHAR;
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));

        }

        return sb.toString();
    }



}
