package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.BaseDriver;

public class _03_XPathLoginFunction extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String[] users = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        String password = "secret_sauce";
        for (String user : users) {
            long startTime = System.currentTimeMillis();
            String result = login(password, user);
            System.out.println("For " + user + " result is: " + result);
            long endTime = System.currentTimeMillis();
            System.out.println("Execution time in milliseconds: " + (endTime - startTime));

            if(result.equals("Login successful!")) {
               driver.navigate().back(); // log out equivalent
            }
        }
        driver.quit();
    }

    public static String login( String user , String password) {
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
