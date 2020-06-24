package Day4.CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_CssDetail {

    public static void main(String[] args) {

        /*

       3)
        in the class
           #u_e8l_4586_0

       4)
        Dot . for class
           .u-full-width
           .label-body
           input[placeholder='Your first name']

       5)
        Tag name
        input
        input[type=text]
        input[type=text][placeholder='Your first name']
        label[class='checkbox-w'][for='u_e8l_4604']
        input[placeholder='URL of your website']

       6)
        By attribute
         h2[data-id=heading_2]

       -->    https://guide.blazemeter.com/hc/en-us/articles/211544089

           ID start with --> div[class^='header-inner']
           ID contains --> div[class*='header-inner']
           ID ends with --> div[class$='der-inner']

          <--

       7)
        What is parent and child relationship in the HTML?
        Parent to Children

            .radio-w>label
            .radio-w>label:nth-child(2)
            label[for='u_bD9_4588']>span


       -->    https://guide.blazemeter.com/hc/en-us/articles/211544089
           Find the any type in the css?
                         Click on "Blazemeter Settings > Account Settings > BlazeMeter's Usage Report: A Tutorial" text
                            li[class='wysiwyg-text-align-left']:nth-of-type(6)
        <--

       8)

                    fieldset[class='radio-w'] span

                        Finding all the child
                        #section_2>input


       9)
        General Sibling
            label[for='u_bD9_89585_0']~label
            input[name='u_e8l_4598']~input

            https://guide.blazemeter.com/hc/en-us/articles/211544089
            li[class='201429665']~li



        13)
        input:not([type='radio'])

        14)
        nth-child

        https://guide.blazemeter.com/hc/en-us/articles/211544089

           How to find the first element?
                ul[id='categories']>li:first-of-type

        15)
           How to find the last child ?
                ul[id='categories']>li:last-of-type



            Click on "Blazemeter Settings > Account Settings > BlazeMeter's Usage Report: A Tutorial" text
               div[class='article-body markdown']>ul>li[class='wysiwyg-text-align-left']:nth-child(3)  We can find better css

            Find the specific child ul[id='categories']>li:nth-child(4)

        16) nth-of-type
        Find the any child in the css?
            #section_1>.radio-w:nth-of-type(3)

         Click on "Blazemeter Settings > Account Settings > BlazeMeter's Usage Report: A Tutorial" text
        div[class='article-body markdown']>p:nth-of-type(8)

        17)
            http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox

        18)

         */


    }
}
