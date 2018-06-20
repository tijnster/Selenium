package nl.telfort.tests.nl.telfort.opening;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InloggenTelfortTest {

@Test
  public void main () {

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\martijn\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      WebDriverWait wait=new WebDriverWait(driver, 10);
      driver.manage().window().maximize() ;

      // open chrome browser
      driver.get("https://testa.1mijn.telfort.nl");

      // accepteer de cookiemelding
      driver.findElement(By.name("cookies-accepteren")).click();

     // Klik op service
     WebElement SpanService = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='mainNavigation_list']/li[4]")));
     SpanService.click();

      // Klik op Inloggen mijn telfort
     driver.findElement(By.linkText("Inloggen Mijn Telfort")).click();
     Assert.assertEquals("Inloggen Mijn Telfort | Telfort", driver.getTitle());

     // Klik op gebruikersnamen veld
     driver.findElement(By.name("username")).click();

      // Vul gebruikersnaam in
      driver.findElement(By.name("username")).sendKeys("aa436669");

      // Klik op wachtwoord veld
      driver.findElement(By.name("password")).click();

      // Vul wachtwoord in
      driver.findElement(By.name("password")).sendKeys("lpORUAc1Kh");

      // Klik op inloggen
     driver.findElement(By.xpath("//button[@class='button--service--fullwidth']")).click();
     Assert.assertEquals("Mijn Telfort Thuis | Telfort", driver.getTitle());

     driver.close();

  }



}
