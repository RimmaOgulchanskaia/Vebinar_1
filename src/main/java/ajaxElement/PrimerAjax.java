package ajaxElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PrimerAjax extends BasePage{
    public PrimerAjax(WebDriver driver){
        setDriver(driver);
        driver.get("https://telranedu.web.app/home");
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }
    @FindBy(xpath = "//*[text()='LOGIN']")
    WebElement btnLoginAjax;
    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmailAjax;

    public void methodAjax(){
        btnLoginAjax.click();
        inputEmailAjax.sendKeys("1111111111");
    }

    public void method(){
        WebElement btnLogin = driver.findElement(By
                .xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@name='email']"));
        //btnLogin.click();
        inputEmail.sendKeys("222222222");
    }



}