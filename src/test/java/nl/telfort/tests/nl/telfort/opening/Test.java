package nl.telfort.tests.nl.telfort.opening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    @org.junit.Test

public void main() {

     // create driver object for chromebrowser
     // implement methods of webdriver
     // invoke exe file first
        
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\martijn\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://telfort.nl");
    driver.getTitle();
    System.out.println(driver.getTitle());


    // another method for validating the URL of a page
        System.out.println(driver.getCurrentUrl());

     /*
     driver.navigate().back();
     driver.navigate().forward();
     driver.close();        // closes the current browser
     driver.quit();         // closes all the browsers opened by selenium script
        */

     driver.findElement(By.id("email")).sendKeys("vul in");




}


}
