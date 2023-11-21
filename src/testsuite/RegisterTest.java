package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setup() { openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully () {
        // Find register link and click on it
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        String expectedRegisterText = "Register";
        String actualRegisterText = driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
        Assert.assertEquals(expectedRegisterText,actualRegisterText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully () {
        // Find register link and click on register
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        // Insert data into the registration form
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tester");
        driver.findElement(By.name("LastName")).sendKeys("njp");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("Jan");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1980");
        driver.findElement(By.id("Email")).sendKeys("primetestnnn@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Prime1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime1234");
        driver.findElement(By.id("register-button")).click();

    }
    @After
    public void tearDown() { closeBrowser();}
}
