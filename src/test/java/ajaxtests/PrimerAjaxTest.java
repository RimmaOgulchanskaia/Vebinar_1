package ajaxtests;

import ajaxElement.PrimerAjax;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimerAjaxTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testWithAjax(){
        PrimerAjax primerAjax = new PrimerAjax(getDriver());
        primerAjax.methodAjax();
    }

    @Test
    public void testWithoutAjax(){
        PrimerAjax primerAjax = new PrimerAjax(getDriver());
        primerAjax.method();
    }
}


