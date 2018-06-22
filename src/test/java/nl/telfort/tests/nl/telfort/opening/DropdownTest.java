package nl.telfort.tests.nl.telfort.opening;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\martijn\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://spicejet.com/");

        /* Dropdown menu's
        Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("AED");
        */

        // Checkboxes



    }

}
