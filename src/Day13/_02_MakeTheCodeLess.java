package Day13;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class _02_MakeTheCodeLess extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://pwa-woo.wpmobilepack.com/#/category/88");

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        ArrayList<String> nameList = new ArrayList<>();

        ArrayList<String> priceList = new ArrayList<>();

        ArrayList<Integer> RandomNumbers = new ArrayList<>();

        for(int i = 0 ; i < 2 ; i++){

            WebDriverWait wait = new WebDriverWait(driver,10);

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Shop Now >']")));

            List<WebElement> shopNowElements = driver.findElements(By.xpath("//button[text()='Shop Now >']"));

            int random = RandomGenerator(shopNowElements.size());

            boolean isRandomDuplicate = false;

            while(!isRandomDuplicate){

                System.out.println("ramdom in  --->>>>   "+random);
                if(!RandomNumbers.contains(random)){
                    RandomNumbers.add(random);
                    isRandomDuplicate=true;
                }else{
                    random = RandomGenerator(shopNowElements.size());
                }
            }

            System.out.println("ramdom after --->>>>   "+random);
            shopNowElements.get(random).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'ADD TO CART')]")));

            nameList.add(driver.findElement(By.xpath("//div[@class='ui center aligned header break-words']")).getText());

            priceList.add(driver.findElement(By.xpath("(//div[@class='content'])[3]")).getText());

            WebDriverWait wait2 = new WebDriverWait(driver,3);

            try{
                wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui fluid selection dropdown']")));

            }catch (Exception e){
                System.out.println("There is no any dropdown bitch.");
            }

            List<WebElement> dropDownCount = driver.findElements(By.xpath("//div[@class='ui fluid selection dropdown']"));

            for(WebElement eachDrop:dropDownCount) {

                eachDrop.click();

                driver.findElement(By.xpath("(//div[@class='visible menu transition']/div)[1]")).click();

            }

            WebElement addToCart = driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]"));
            addToCart.click();

            List<WebElement> ButtonX = driver.findElements(By.xpath("//button[@class='close-toastr']"));

            for(WebElement XBut:ButtonX){
                try{
                    XBut.click();
                }catch (StaleElementReferenceException e){
                    System.out.println("Not able to click on X ");
                }
            }

            driver.navigate().back();

        }

        driver.findElement(By.xpath("//i[@class='cart large icon shop-icon']")).click();

//        _01_RecapCode is finish here

        List<WebElement> priceListInTheCart = driver.findElements(By.xpath("//div[@class='right aligned four wide column']/div"));

        compareTwoList(priceList,priceListInTheCart);

        List<WebElement> ItemNamesInTheCart = driver.findElements(By.cssSelector("div[class='four wide column break-words']"));

        compareTwoList(nameList,ItemNamesInTheCart);

        double totalItemNumbers = totalNumber(priceListInTheCart);

        String totalNumber = driver.findElement(By.xpath("//div[@class='right aligned five wide column']")).getText();

        Assert.assertTrue("total Number --> "+stringToDouble(totalNumber) + "totalItemNumbers --> " + totalItemNumbers,stringToDouble(totalNumber) == totalItemNumbers);

        driver.findElement(By.xpath("//button[text()='Checkout']")).click();

        driver.quit();
    }

    public static int RandomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);

    }

     public static void compareTwoList(List<String> l1 ,List<WebElement> l2){

        for(int i = 0 ; i < l1.size() ; i++){

            Assert.assertEquals(l1.get(i) ,l2.get(i).getText());
        }

     }

     public static double stringToDouble(String number){

        number = number.replaceAll("[^\\d.]","");

        double d1 = Double.parseDouble(number);

        return d1;
     }

     public static double totalNumber(List<WebElement> l1){

        double total = 0;
        for(int i = 0 ; i < l1.size() ; i++){

            total += stringToDouble(l1.get(i).getText());

        }
        return total;
     }

}
