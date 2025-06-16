package tests;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import enums.StateCity;
import manager.AppManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends AppManager {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void studentRegFormPositiveTest() {
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.MUSIC);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Vasya", "Vasilev", "vasyavasilev@gmail.com",
                Gender.MALE, "0123456789", "23 Mar 2013",
                "Maths,Physics,Chemistry", hobbies,
                "", "avenue 12", StateCity.RAJASTHAN.getState(),
                StateCity.RAJASTHAN.getCity()[1]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        //Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessageNegative());
        System.out.println("Test failed!!!!!");
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage());
    }

    @Test
    public void studentRegFormPositiveTestSoftAssert() {
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.MUSIC);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Vasya", "Vasilev", "vasyavasilev@gmail.com",
                Gender.MALE, "0123456789", "23 Mar 2013",
                "Maths,Physics,Chemistry", hobbies,
                "", "avenue 12", StateCity.RAJASTHAN.getState(),
                StateCity.RAJASTHAN.getCity()[1]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        //softAssert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessageNegative(), "*Test failed*");
        //System.out.println("Test failed!!!!!");
        softAssert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage(), "test passed");
        System.out.println("Test passed");
        System.out.println("================");
        softAssert.assertEquals(getDriver().findElement(By.xpath("//tbody/tr[2]/td[last()]"))
                .getText(), student.getEmail());
        System.out.println("==============");
        softAssert.assertAll();
    }
}