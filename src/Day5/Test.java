package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        driver.manage().window().maximize();

        // write me java code to print label of adjacent to #u_Uj7_4586_lbl
        WebElement adjacent = driver.findElement( By.cssSelector("#u_Uj7_4586_lbl + label") );
        System.out.println(adjacent.getText());

        // write me java code to print label second adjacent to #u_Uj7_4586_lbl
        WebElement nextAdjacent = driver.findElement( By.cssSelector("#u_Uj7_4586_lbl + label + label") );
        System.out.println(nextAdjacent.getText());
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
