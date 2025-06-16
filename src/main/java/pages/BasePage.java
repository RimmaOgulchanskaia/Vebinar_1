package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    static WebDriver driver;

    public static void setDriver(WebDriver wd) {
        driver = wd;
    }
    public void pause(int time) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript
                ("document.querySelector('#fixedban')" +
                        ".style.display='none'");
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript
                ("document.querySelector('footer')" +
                        ".style.display='none'");
    }
    public boolean validateTextInElement(WebElement element, String text){
        return element.getText().contains(text);
    }
}