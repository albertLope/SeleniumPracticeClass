package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

import java.awt.*;


public class _05_Exercise2 extends BaseDriver {

    public static void main(String[] args) throws AWTException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\halit\\Documents\\Selenium\\chromedriver\\chromedriver.exe");

            driver.manage().window().maximize();

            driver.get("http://demo.automationtesting.in/Register.html");

            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Halit");

            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mark");

            driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("455 crooks ave.");

            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcdeqwewsadfgh@gmail.com");

            driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8649902547");

            driver.findElement(By.xpath("//label[text()=' Male ']")).click();

            driver.findElement(By.xpath("//input[@id='checkbox3']")).click();

            driver.findElement(By.xpath("//div[@id='msdd']")).click();

            driver.findElement(By.xpath("//a[contains(text(),'Turkish')]")).click();

            WebElement skilss = driver.findElement(By.xpath("//select[@id='Skills']"));

            Select slc = new Select(skilss);

            slc.selectByValue("C");

            WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));

            slc = new Select(countries);

            slc.selectByValue("Belgium");

            driver.findElement(By.xpath("//span[@role='combobox']")).click();

            driver.findElement(By.xpath("//li[contains(text(),'United States of America')]")).click();

            WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));

            Select slc4 = new Select(year);

            slc4.selectByVisibleText("1940");

            WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

            Select slc5 = new Select(month);

            slc5.selectByVisibleText("January");

            WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));

            Select slc3 = new Select(day);

            slc3.selectByVisibleText("25");

            driver.findElement(By.xpath("//input[@onblur='validatepattern(this)']")).sendKeys("ABC123456abc");

            driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abc123456ABC");

            driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

            String url = driver.getCurrentUrl();

            System.out.println(url);

        }
    }