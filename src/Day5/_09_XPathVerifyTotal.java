package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _09_XPathVerifyTotal extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String user = "standard_user";
        String password = "secret_sauce";
        String result = login(password, user);
        System.out.println(result);

        if (result.equals("Login successful!")) {
            String firstItemName = "Sauce Labs Backpack";
            String inventoryPriceOfFirstItem = addToCart(firstItemName);
            driver.navigate().back();
            String secondItemName = "Sauce Labs Bike Light";
            String inventoryPriceOfSecondItem  = addToCart(secondItemName);

            goToCheckOut();

            comparePrice(firstItemName, inventoryPriceOfFirstItem, "1");
            comparePrice(secondItemName, inventoryPriceOfSecondItem, "2");

            WebElement itemTotalElement =  driver.findElement(By.className("summary_subtotal_label"));
            String itemTotal = itemTotalElement.getText();
            itemTotal= itemTotal.replaceAll("[^\\d.]", "");

            System.out.println(itemTotal);
            double itemTotalDouble = Double.parseDouble(itemTotal);


            inventoryPriceOfFirstItem= inventoryPriceOfFirstItem.replace("$" , "");
            inventoryPriceOfSecondItem= inventoryPriceOfSecondItem.replace("$" , "");

            double firstItemInt = Double.parseDouble(inventoryPriceOfFirstItem);
            double secondItemInt = Double.parseDouble(inventoryPriceOfSecondItem);

            System.out.println("Item total is " + itemTotalDouble + " first item is " + firstItemInt + " second item is " + secondItemInt);
            if(itemTotalDouble == firstItemInt+secondItemInt) {
                System.out.println("Item total success!");
            }
            WebElement tax =  driver.findElement(By.className("summary_tax_label"));
            String itemTax = tax.getText();
            itemTax= itemTax.replaceAll("[^\\d.]", "");
            double itemTaxDouble = Double.parseDouble(itemTax);

            WebElement total_label =  driver.findElement(By.className("summary_total_label"));
            String itemTotalSum = total_label.getText();
            itemTotalSum= itemTotalSum.replaceAll("[^\\d.]", "");
            double itemTotalSumDouble = Double.parseDouble(itemTotalSum);

            System.out.println("Item totalSum is " + itemTotalSumDouble + " first item is " + itemTotalDouble + " second item is " + itemTaxDouble);
            if(itemTotalSumDouble == itemTotalDouble+itemTaxDouble) {
                System.out.println("Tax total success!");
            };

        }

        driver.quit();

    }

    private static void comparePrice(String firstItemName, String inventoryPriceOfFirstItem, final String index) {
        WebElement cartPageFirstItemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[" + index + "]"));
        String nameOfFirstItem = cartPageFirstItemName.getText();
        WebElement cartPageFirstItemPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[" + index + "]"));
        String priceOfFirstItem = cartPageFirstItemPrice.getText();

        if(firstItemName.equals(nameOfFirstItem)) {
            System.out.println("Name compare success!");
        } else  {
            System.out.println("Name compare failure! Name: " + firstItemName + " not equal to " + nameOfFirstItem);
        }

        if(inventoryPriceOfFirstItem.equals(priceOfFirstItem)) {
            System.out.println("Price compare success!");
        } else  {
            System.out.println("Price compare failure! Price: " + inventoryPriceOfFirstItem + " not equal to " + priceOfFirstItem);
        }
    }

    private static void goToCheckOut() {
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
    }

    private static String addToCart(String firstItemName) {
        WebElement priceOfFirstElement = driver.findElement(By.xpath("//div[text()='" + firstItemName + "']//following::div[@class='inventory_item_price']"));
        String priceOfFirstProduct = priceOfFirstElement.getText();

        WebElement SauceLabsBackpack = driver.findElement(By.xpath("//div[text()='" + firstItemName + "']"));
        SauceLabsBackpack.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
        addToCart.click();

        String numberOfItems = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
        System.out.println("Added " + numberOfItems + " items to cart!");
        return priceOfFirstProduct;
    }

    private static String login(String password, String user) {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();
        try {
            driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]")); // can find user menu
            return "Login successful!";
        } catch (NoSuchElementException e) {
            String text = driver.findElement(By.xpath("//*[@id=\"password\"]//following-sibling::h3")).getText();
            return "Login failed! Error Message: " + text;
        }
    }
}
