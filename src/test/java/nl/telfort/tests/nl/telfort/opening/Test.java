package nl.telfort.tests.nl.telfort.opening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    @org.junit.Test

public void openingBrowser() {

     // create driver object for chromebrowser
     // implement methods of webdriver
     // invoke exe file first
        
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\martijn\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://telfort.nl");
    driver.getTitle();
    System.out.println(driver.getTitle());

}


}
