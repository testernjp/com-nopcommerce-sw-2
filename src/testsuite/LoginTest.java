package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        // Find the actual text element and get the text from element
        WebElement actualTestElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTestElement.getText();
        // Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithWithValidCredential() {
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find the email field and enter valid email id
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("primetestnnn@gmail.com");

        // Find the password field and enter valid password
        driver.findElement(By.name("Password")).sendKeys("Prime1234");

        // Find the login button and click on the login button
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        // Find Logout button and verify the text
        String expectedLogOutText = "Log out";
        String actualLogOutText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals(expectedLogOutText, actualLogOutText);
    }

    @Test
    public void verifyTheErrorMessage() {
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find the email field and enter valid email id
        driver.findElement(By.id("Email")).sendKeys("primennntest@gmail.com");
        // Find the password field and enter valid password
        driver.findElement(By.name("Password")).sendKeys("Prime1234");
        // Find the login button and click on the login button
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        // Find Login button and verify the text
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Not redirected to Login Page", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
