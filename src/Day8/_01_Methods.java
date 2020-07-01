package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _01_Methods extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        Thread.sleep(3000);

//      //label[@id='gwt-debug-cwCheckBox-Friday-label']  <-- this will not work for is selected
        WebElement element = driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Friday-input']"));

        /*
            Check is Friday element displayed enabled and selected

                if we want to check is the element is selected then we need to use input tag
                    We can first show with label then it will not work then we can show with input then this will work.

         */

        boolean displayed = element.isDisplayed();
        boolean enabled = element.isEnabled();
        boolean selected = element.isSelected();

        System.out.println("Friday before click "+displayed);
        System.out.println("Friday before click "+enabled);
        System.out.println("Friday before click "+selected);

        /*
            Click on the element and check is element displayed enabled and selected
         */
        element.click();

        displayed = element.isDisplayed();
        enabled = element.isEnabled();
        selected = element.isSelected();

        System.out.println("Friday after click "+displayed);
        System.out.println("Friday after click "+enabled);
        System.out.println("Friday after click "+selected);

        /*
        Task 1:
           Check is the saturday is selected or not?

         */

        WebElement inputSaturday = driver.findElement(By.xpath("//label[text()='Saturday']/preceding-sibling::input"));

        System.out.println("Saturday selected "+inputSaturday.isSelected());

        /*
        Task 2:
           Check is the saturday is enabled or not?

         */
        System.out.println("Saturday enabled "+inputSaturday.isEnabled());

        /*
           Task 3:
            If isDisplayed result is false then no such element exception will be throw

            to handle this we need to use try catch

        This will throw exception
         WebElement inputNotAvailable = driver.findElement(By.xpath("//label[text()='wrongXpath']/preceding-sibling::input"));

        System.out.println(inputNotAvailable.isDisplayed());
         */

        System.out.println("-------------");
        System.out.println(driver.findElement(By.xpath("(//*[@aria-hidden='true'])[10]")).isDisplayed());

    }

}


