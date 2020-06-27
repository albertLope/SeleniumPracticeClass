package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _04_Exercise extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("u_0_m")).sendKeys("TestingTT@gmail.com");

        driver.findElement(By.id("u_0_o")).sendKeys("123Qweasd.");

        driver.findElement(By.id("u_0_r")).sendKeys("123Qweasd.");

        driver.findElement(By.id("password_step_input")).sendKeys("123Qweasd.");

        WebElement day = driver.findElement(By.id("day"));

        Select dayDropdown = new Select(day);

        Random rnd = new Random();

        List<WebElement> a1 = dayDropdown.getOptions();
        int randomNum = rnd.nextInt(a1.size());

        dayDropdown.selectByIndex(randomNum);

        WebElement month = driver.findElement(By.id("month"));

        Select monthDropdown = new Select(month);

        rnd = new Random();

        randomNum = rnd.nextInt(dayDropdown.getOptions().size());

        monthDropdown.selectByIndex(randomNum);

        WebElement year = driver.findElement(By.id("year"));

        Select yearDropdown = new Select(year);

        rnd = new Random();

        randomNum = rnd.nextInt(dayDropdown.getOptions().size());

        yearDropdown.selectByIndex(randomNum);


    }
}
