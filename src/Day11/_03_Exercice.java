package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _03_Exercice extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.snapdeal.com/");

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.findElement(By.id("inputValEnter")).sendKeys("Phone");

        driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();

        driver.findElement(By.xpath("(//p[@class='product-title '])[1]")).click();

        Set<String> handles = driver.getWindowHandles();

        System.out.println(driver.getWindowHandle());

        String parentWindow =  driver.getWindowHandle();

        // Pass a window handle to the other window
        for (String handle1 : handles) {

            System.out.println(handle1);

            driver.switchTo().window(handle1);

        }

        String text = driver.findElement(By.xpath("//h1[@class='pdp-e-i-head']")).getText();

        WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));

        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.invisibilityOf(addToCart));

        driver.close();

        driver.switchTo().window(parentWindow);

        WebElement Cart = driver.findElement(By.xpath("//*[text()='Cart']"));

        Cart.click();

        WebElement text2Element = driver.findElement(By.xpath("//a[@class='item-name']"));
        wait.until(ExpectedConditions.visibilityOf(text2Element)) ;

        String text2Str = text2Element.getText();

        System.out.println("one "+text);
        System.out.println("two "+text2Str);

    }

}
