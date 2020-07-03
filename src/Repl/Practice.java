package Repl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Practice extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.automationtesting.in/");

        List<WebElement> e1 = driver.findElements(By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));

        e1.get(randomGenerator(e1.size())).click();

        String thinkingText = driver.findElement(By.tagName("h1")).getText();

        WebElement price = driver.findElement(By.xpath("//span[@class='woocommerce-Price-amount amount']"));

        String priceText = price.getText();

        WebElement inputCount = driver.findElement(By.xpath("//input[@name='quantity']"));

        inputCount.clear();

        int RandomCount = randomGenerator(10);

        inputCount.sendKeys(String.valueOf(RandomCount));

        driver.findElement(By.xpath("//button[text()='Add to basket']")).click();

        driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();

        String productNameCart = driver.findElement(By.xpath("//td[@class='product-name']//a")).getText();

        Assert.assertEquals(productNameCart , thinkingText);


        String priceCart = driver.findElement(By.xpath("//td[@class='product-price']")).getText();
        double priceCartDouble = StringToDouble(priceCart);

        String quantity = driver.findElement(By.xpath("//td[@class='product-quantity']//input")).getAttribute("value");
        double quantityDouble = StringToDouble(quantity);

        String SubTotal = driver.findElement(By.xpath("//td[@class='product-subtotal']")).getText();
        double SubTotalDouble = StringToDouble(SubTotal);

        Assert.assertTrue("priceCartDouble: " + priceCartDouble + "  "+"quantityDouble: " + quantityDouble + "  "+"SubTotal: " + SubTotal + "  ",priceCartDouble * quantityDouble == SubTotalDouble  );

        String tax = driver.findElement(By.xpath("//td[@data-title='Roaming Tax']")).getText();
        double taxDouble = StringToDouble(tax);

        String total = driver.findElement(By.xpath("//tr[@class='order-total']//strong/span")).getText();
        double totalDouble = StringToDouble(total);

        Assert.assertTrue("taxDouble: " + taxDouble + "  "+"totalDouble: " + totalDouble + "  ",taxDouble +SubTotalDouble == totalDouble  );

        driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).click();

        System.out.println();

        driver.findElement(By.id("billing_first_name")).sendKeys("Techno");

        driver.findElement(By.id("billing_last_name")).sendKeys("Techno");

        driver.findElement(By.id("billing_email")).sendKeys("Techno@gmail.com");

        driver.findElement(By.id("billing_phone")).sendKeys("8625874545");

         driver.findElement(By.id("select2-chosen-1")).click();

        driver.findElement(By.id("s2id_autogen1_search")).sendKeys("albania");

        driver.findElement(By.xpath("//span[text()='Albania']")).click();

        driver.findElement(By.id("billing_address_1")).sendKeys("123 main");

        driver.findElement(By.id("billing_city")).sendKeys("carl");

        driver.findElement(By.id("billing_state")).sendKeys("NJ");

        driver.findElement(By.id("billing_postcode")).sendKeys("07078");

//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        WebElement placeHolder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='place_order']")));
//        Thread.sleep(2000);

        WebElement placeHolder = driver.findElement(By.xpath("//input[@id='place_order']"));
        placeHolder.click();

//        WebElement totalAmount = driver.findElement(By.xpath("//th[text()='Total:']/parent::tr//td/span"));
//
//        Assert.assertEquals(total , totalAmount.getText());

    }

    public static int randomGenerator(int max){
        Random rnd = new Random();
        int r1 = rnd.nextInt(max-1)+1;
        return r1;

    }

    public static double StringToDouble(String price){

        price = price.replaceAll("[^\\d.]","");

        double r = Double.parseDouble(price);

        return r;
    }


}
