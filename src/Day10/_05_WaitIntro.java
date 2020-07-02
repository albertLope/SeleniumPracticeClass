package Day10;

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
                Implicit wait is stop effecting to all elements until driver.quit or execution end.

            Explicit wait is for the element
                When I finish the action for the element.
                Explicit wait stop effecting to driver.

                Implicit wait should be created for the driver and creating it once is enough.

                Explicit wait should be created for the WebElement and creating it for each element.

         */

    }
}
