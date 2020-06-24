package Day4;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        driver.manage().window().maximize();


        /*

            basic XPATH
                //a[@id='menu_recruitment_viewRecruitmentModule']

                absolute xpath //*[@id="dashboard-quick-launch-panel-menu_holder"]/table/tbody/tr/td[1]/div/a/span

                Relative xpath //a[@id='menu_time_viewTimeModule']

           difference between absolute vs relative xpath (single slash xpath vs double slash xpath)

           absolute xpath is finding the absolute location of the element it is usually long and easy to break

           Relative xpath is finding from the text or any attribute of the element

            basic xpath - what is xpath
              // tagName [ @ attributeName = ' attributeValue ']

            text
               //b[text()='Recruitment']
               //td[text()='Not assigned to Subunits']

            contains
         //tagName [contains(text(),' elementText ')]
         //tagName [contains(@attributeName,' attributeValue ')]

         //td[contains(text(),'Total : 0 / 0')]
         //input[contains(@data-id,'search')]

            Parent - child
                //div[@class='quickLaunge']//span[text()='Assign Leave']

            Child to parent
               //span[text()='Assign Leave']/parent::a



         */


    }
}
