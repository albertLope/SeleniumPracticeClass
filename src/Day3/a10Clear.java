package Day3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a10Clear {

    public static void main(String[] args) {

        /*
            Task Navigate to etsy.com

            Search for any item

            verify item name is in the URL

         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        String searchText = "TeddyBear";
        WebElement searchElement =driver.findElement(By.cssSelector("input[data-id='search-query']"));
        System.out.println("First value is here -->> "+searchElement.getAttribute("value"));
        searchElement.sendKeys(searchText);

        WebElement searchIconButton =driver.findElement(By.cssSelector("button[data-id='gnav-search-submit-button']"));
        searchIconButton.click();

        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains(searchText));

        searchElement =driver.findElement(By.cssSelector("input[data-id='search-query']"));
        System.out.println("second value is here -->> "+searchElement.getAttribute("value"));
        searchElement.clear();
        searchElement.sendKeys("Phone");

        searchIconButton =driver.findElement(By.cssSelector("button[data-id='gnav-search-submit-button']"));
        searchIconButton.click();

        searchElement =driver.findElement(By.cssSelector("input[data-id='search-query']"));
        System.out.println("third value is here -->> "+searchElement.getAttribute("value"));

    }
}
