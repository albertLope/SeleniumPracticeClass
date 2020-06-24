package Day4.CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");  // this will open the website and wait until full load


        driver.findElement(By.cssSelector("input[value='Business']")).click();
        driver.findElement(By.cssSelector("input[value='Once a Week']")).click();


        driver.findElement(By.cssSelector("select[name='u_SCX_4588']")).click();
        driver.findElement(By.cssSelector("option[value='Referred by Existing Customer']")).click();

        driver.findElement(By.cssSelector("input[value='Average']")).click();

        driver.findElement(By.cssSelector("#u_SCX_4597")).click();

        driver.findElement(By.cssSelector("select[name='u_SCX_4597']")).click();
        driver.findElement(By.cssSelector("option[value*='XYZ yet, but I will in the future']")).click();

        driver.findElement(By.cssSelector("textarea[class='u-full-width'][name='u_SCX_89597']")).sendKeys("Hello");

        driver.findElement(By.cssSelector("input[placeholder='Your first name']")).sendKeys("james");

        driver.findElement(By.cssSelector("input[placeholder='Your last name']")).sendKeys("james");

        driver.findElement(By.cssSelector("input[placeholder='Your email']")).sendKeys("james@gmail.com");

        driver.findElement(By.cssSelector("div[class='date-t']>input")).sendKeys("11112000");

        driver.findElement(By.cssSelector("input[placeholder='URL of your website']")).sendKeys("google.com");

        driver.findElement(By.cssSelector(".button-primary")).click();



    }

    /*
      WebElement shopNowNinja = driver.findElement(By.xpath("(//button[@class='ui purple compact button'])[1]"));
        shopNowNinja.click();

        WebElement clothName = driver.findElement(By.xpath("ui center aligned header break-words"));
        String nameOfCloth = clothName.getText();

        WebElement priceElement = driver.findElement(By.xpath(" (//div[@class='content'])[3]"));
        String price = priceElement.getText();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='ui purple fluid button']"));
        addToCart.click();

        WebElement nameInTheCart = driver.findElement(By.xpath("//div[@class='four wide column break-words']"));
        String nameOfTheClothInCart= nameInTheCart.getText();

        WebElement priceInTheCartElement = driver.findElement(By.xpath("(//div[text()='Happy Ninja']/parent::div/div)[4]"));
        String priceInTheCart = priceInTheCartElement.getText();

        Assert.assertEquals(price , priceInTheCart);
        Assert.assertEquals(nameOfCloth , nameOfTheClothInCart);

     */
}
