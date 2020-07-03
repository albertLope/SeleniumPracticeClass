package Day10;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;
import java.util.concurrent.TimeUnit;

public class _05_WaitIntro extends BaseDriver {

    public static void main(String[] args) {

        /*
            Implicit wait vs explicit wait.
         */

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        /*
            ImplicitlyWait is for the driver
                Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            Implicit Wait
                Throws a NoSuchElementException when the element is not present in the DOM
                Throws a ElementNotVisibleException when element is present in the DOM, however, it is hidden and cannot be interacted with

            Explicit Wait
                Explicit wait in Selenium throws a WebDriverTimeoutException, depending on your expected condition

            Explicit wait is for the element
                When I finish the action for the element.
                Explicit wait stop effecting to driver.

                Implicit wait should be created for the driver and creating it once is enough.

                Explicit wait should be created for the WebElement and creating it for each element.

                WebDriverWait wait = new WebDriverWait(driver, 30);
                wait.until(ExpectedConditions);
                The above command waits for a stipulated amount of wait time or an expected condition to occur whichever occurs or elapses first.

                titleIs
                   wait.until(ExpectedConditions.titleIs())

                titleContains
                   wait.until(ExpectedConditions.titleContains())

         */

        WebDriverWait wait = new WebDriverWait(driver, 30);


    }
}
