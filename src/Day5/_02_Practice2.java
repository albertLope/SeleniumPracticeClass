package Day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Practice2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement buttonLogin = driver.findElement(By.xpath("//input[@class='btn_action']"));
        buttonLogin.click();

        WebElement SauceLabsBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement priceOfFirstElement = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String PriceOfFirstProduct = priceOfFirstElement.getText();
        String nameOfFirstProduct = SauceLabsBackpack.getText();
        SauceLabsBackpack.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
        addToCart.click();

        driver.navigate().back();

        WebElement BikeLight = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        String nameOfSecondProduct = BikeLight.getText();
        WebElement priceOfSecondElement = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String PriceOfSecondProduct = priceOfSecondElement.getText();
        BikeLight.click();

        addToCart = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
        addToCart.click();

        driver.findElement(By.id("shopping_cart_container")).click();

        WebElement checkoutButton = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        checkoutButton.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Fernando");

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Torres");

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("05050");

        checkoutButton = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
        checkoutButton.click();

        WebElement cartPageFirstItemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String nameOfFirstItem = cartPageFirstItemName.getText();

        WebElement cartPageSecondItemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]"));
        String nameOfSecondItem = cartPageSecondItemName.getText();

        WebElement cartPageFirstItemPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String priceOfFirstItem = cartPageFirstItemPrice.getText();

        WebElement cartPageSecondItemPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String priceOfSecondItem = cartPageSecondItemPrice.getText();

        Assert.assertEquals(nameOfFirstProduct , nameOfFirstItem);
        Assert.assertEquals(nameOfSecondProduct , nameOfSecondItem);
        Assert.assertEquals(PriceOfFirstProduct , priceOfFirstItem);
        Assert.assertEquals(PriceOfSecondProduct , priceOfSecondItem);

        WebElement itemTotalElement =  driver.findElement(By.className("summary_subtotal_label"));
        String itemTotal = itemTotalElement.getText();
        itemTotal= itemTotal.replaceAll("[^\\d.]", "");

        System.out.println(itemTotal);
        double itemTotalDouble = Double.parseDouble(itemTotal);


        PriceOfFirstProduct= PriceOfFirstProduct.replace("$" , "");
        PriceOfSecondProduct= PriceOfSecondProduct.replace("$" , "");

        double firstItemInt = Double.parseDouble(PriceOfFirstProduct);
        double secondItemInt = Double.parseDouble(PriceOfSecondProduct);

        Assert.assertTrue("Item total is " + itemTotalDouble + " first item is " + firstItemInt + " second item is " + secondItemInt,itemTotalDouble == firstItemInt+secondItemInt );

        WebElement tax =  driver.findElement(By.className("summary_tax_label"));
        String itemTax = tax.getText();
        itemTax= itemTax.replaceAll("[^\\d.]", "");
        double itemTaxDouble = Double.parseDouble(itemTax);

        WebElement total_label =  driver.findElement(By.className("summary_total_label"));
        String itemTotalSum = total_label.getText();
        itemTotalSum= itemTotalSum.replaceAll("[^\\d.]", "");
        double itemTotalSumDouble = Double.parseDouble(itemTotalSum);

        Assert.assertTrue("Item totalSum is " + itemTotalSumDouble + " first item is " + itemTotalDouble + " second item is " + itemTaxDouble,itemTotalSumDouble == itemTotalDouble+itemTaxDouble );

        WebElement finishButton = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
        finishButton.click();

        WebElement thankYouElement = driver.findElement(By.tagName("h2"));
        String thankYouText =thankYouElement.getText();

        Assert.assertEquals(thankYouText , "THANK YOU FOR YOUR ORDER");

    }
}
