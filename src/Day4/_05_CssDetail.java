package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_CssDetail {

    public static void main(String[] args) {

        /*

            https://guide.blazemeter.com/hc/en-us/articles/211544089

            What is parent and child relationship in the HTML?

            Find the any type in the css?
                         Click on "BlazeMeter's Usage Report: A Tutorial" text
                            li[class='wysiwyg-text-align-left']:nth-of-type(6)

            How to find the first element?
                ul[id='categories']>li:first-of-type

            How to find the last child ?
                ul[id='categories']>li:last-of-type

             Find the any child in the css?
             Click on "BlazeMeter's Usage Report: A Tutorial" text
               div[class='article-body markdown']>ul>li[class='wysiwyg-text-align-left']:nth-child(3)  We can find better css

            ID start with --> ul[id^='categories']
            ID contains --> ul[id*='ories']
            ID ends with --> ul[id$='categories']

            Find the specific child ul[id='categories']>li:nth-child(4)

         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwNumberFormat");

        driver.manage().window().maximize();

        WebElement currency = driver.findElement(By.cssSelector("select[class='gwt-ListBox']>option:nth-child(2)"));
        System.out.println(currency.getText());


    }
}
