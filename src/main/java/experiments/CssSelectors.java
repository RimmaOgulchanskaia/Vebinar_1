package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        driver.get("https://demoqa.com/");
        //driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement imgTools = driver.findElement(By
                .cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));

        WebElement divElements = driver.findElement(By
                .cssSelector(".card-up"));
        divElements.click();
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        //WebElement radioButtonYes = driver.findElement(By.id("yesRadio"));
//        WebElement radioButtonYes = driver.findElement(By
//                .cssSelector("label[for='yesRadio']"));
        WebElement radioButtonYes = driver.findElement(By
                .xpath("//label[@for='yesRadio']"));
        radioButtonYes.click();
        pause(5);
        driver.navigate().back();
        pause(5);
        driver.navigate().back();
        hideFooter();
        WebElement divBookStore = driver.findElement(By
                .cssSelector("div[class='category-cards'] " +
                        "div[class='card mt-4 top-card']:last-child"));
        divBookStore.click();
        pause(5);
        driver.navigate().back();
        WebElement divWidgets = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:nth-child(4)"));

        pause(5);
        //driver.quit();
        //driver.close();

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
}