package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on computer tab on the top menu bar
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
        // Verify the text
        String expectedComputerTabText = "Computers";
        String actualComputerTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).getText();
        Assert.assertEquals(expectedComputerTabText, actualComputerTabText);
    }

    @Test
    public void userShouldNavigateToElectronicPageSuccessfully() {
        // Click on Electronic tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();
        // Verify the text
        String expectedElectronicsTabText = "Electronics";
        String actualElectronicsTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).getText();
        Assert.assertEquals(expectedElectronicsTabText, actualElectronicsTabText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on Apparel tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).click();
        // Verify the text
        String expectedApparelTabText = "Apparel";
        String actualApparelTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).getText();
        Assert.assertEquals(expectedApparelTabText, actualApparelTabText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadPageSuccessfully() {
        // Click on Digital Download tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")).click();
        // Verify the text
        String expectedDigitalDownloadTabText = "Digital downloads";
        String actualDigitalDownloadTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")).getText();
        Assert.assertEquals(expectedDigitalDownloadTabText, actualDigitalDownloadTabText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Click on Books tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).click();
        // Verify the text
        String expectedBooksTabText = "Books";
        String actualBooksTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).getText();
        Assert.assertEquals(expectedBooksTabText, actualBooksTabText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Click on Jewelry tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).click();
        // Verify the text
        String expectedJewelryTabText = "Jewelry";
        String actualJewelryTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).getText();
        Assert.assertEquals(expectedJewelryTabText, actualJewelryTabText);
    }

    @Test
    public void userShouldGiftCardsPageSuccessfully() {
        // Click on Gift Cards tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).click();
        // Verify the text
        String expectedGiftCardsTabText = "Gift Cards";
        String actualGiftCardsTabText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).getText();
        Assert.assertEquals(expectedGiftCardsTabText, actualGiftCardsTabText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
