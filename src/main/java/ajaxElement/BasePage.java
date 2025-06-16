package ajaxElement;

import org.openqa.selenium.WebDriver;

public class BasePage {
    static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
}
