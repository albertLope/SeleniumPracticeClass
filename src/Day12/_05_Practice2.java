package Day12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class _05_Practice2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        //Launch flipkart
        driver.get("http://www.flipkart.com");

        WebElement closButton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));

        closButton.click();

        //Write the search term - Buddha in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
        searchBox.sendKeys("Buddha");

        //Click on searchButton
        WebElement searchButton = driver.findElement(By.className("vh79eN"));
        searchButton.click();

        //Inserting an optional wait of 3 seconds just to notice scroll down event
        Thread.sleep(3000);

        //Scroll down the webpage by 2500 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 2500)");

        //Waiting till page:2 text is visible
        WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
                (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));

        //Verifying that page got scrolled  and "page-2" text is visible now
        //and more products become visible
        Assert.assertEquals(pageNumberdisplayer.getText(), "Page: 2");

    }

}
