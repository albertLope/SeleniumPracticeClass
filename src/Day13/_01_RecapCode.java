package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class _01_RecapCode extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://pwa-woo.wpmobilepack.com/#/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> shopNowElements = driver.findElements(By.xpath("//button[text()='Shop Now >']"));

        shopNowElements.get(RandomGenerator(shopNowElements.size())).click();

        String firstItemName = driver.findElement(By.xpath("//div[@class='ui center aligned header break-words']")).getText();

        String price = driver.findElement(By.xpath("(//div[@class='content'])[3]")).getText();

        WebElement addToCart = driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]"));
        addToCart.click();

        System.out.println(price);
        System.out.println(firstItemName);

        driver.navigate().back();

        shopNowElements = driver.findElements(By.xpath("//button[text()='Shop Now >']"));

        shopNowElements.get(RandomGenerator(shopNowElements.size())).click();

        String firstItemName2 = driver.findElement(By.xpath("//div[@class='ui center aligned header break-words']")).getText();

        String price2 = driver.findElement(By.xpath("(//div[@class='content'])[3]")).getText();

        addToCart = driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]"));
        addToCart.click();

        System.out.println(price2);
        System.out.println(firstItemName2);

        driver.findElement(By.xpath("//i[@class='cart large icon shop-icon']")).click();





    }

    public static int RandomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);

    }


}
