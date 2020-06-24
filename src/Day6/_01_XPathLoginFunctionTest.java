package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.BaseDriver;

public class _01_XPathLoginFunctionTest extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String[] users = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        String password = "secret_sauce";
        for (String user : users) {
            driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
            driver.findElement(By.xpath("//input[@class='btn_action']")).click();
            try {
                driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]")); // can find user menu
                System.out.println("Login successful!");
                driver.navigate().back(); // log out equivalent
            } catch (NoSuchElementException e) {
                String text = driver.findElement(By.xpath("//*[@id=\"password\"]//following-sibling::h3")).getText();
                System.out.println("Login failed! Error Message: " + text);
            }
        }
        driver.quit();
    }
}
