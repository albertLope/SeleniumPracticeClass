package Day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_Note {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@class='btn_action']")).click();

        WebElement products = driver.findElement(By.xpath("//div[@class='product_label']"));

        String productText = products.getText();

        Assert.assertEquals("Products" , productText);

        driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();

        /*
        Options for the add to cart
        //button[@class='btn_primary btn_inventory']
        //button[text()='ADD TO CART']
         */

        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        driver.findElement(By.xpath("//button[text()='<- Back']")).click();

        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();

        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();

        driver.findElement(By.linkText("CHECKOUT")).click();
//        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

        driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("John");

        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Someone");

        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");

        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

//      from child to parent and to the sibling  //div[text()='Sauce Labs Onesie']/parent::a/following-sibling::div

        String price1 = driver.findElement(By.xpath("(//div[text()='Sauce Labs Onesie']/parent::a/following-sibling::div)[2]")).getText();
//        //div[text()='Sauce Labs Onesie']/parent::a/following-sibling::div[@class='inventory_item_price']

//        //div[@class='cart_list']//a <--  xpath

        String price2 = driver.findElement(By.xpath("(//div[text()='Sauce Labs Bike Light']/parent::a/following-sibling::div)[2]")).getText();

        System.out.println(price1);
        System.out.println(price2);

        String ItemTotal = driver.findElement(By.className("summary_subtotal_label")).getText();

        System.out.println(ItemTotal);

        double price1Double = parseStringToDouble(price1);
        double price2Double = parseStringToDouble(price2);
        double ItemTotalDouble = parseStringToDouble(ItemTotal);

        double res = price1Double+price2Double;

        Assert.assertTrue(ItemTotalDouble ==res);

    }

    public static double parseStringToDouble(String number){

        number = number.replaceAll("[^\\d.]" , "");

        double result = Double.parseDouble(number);

        return result;

    }
}
