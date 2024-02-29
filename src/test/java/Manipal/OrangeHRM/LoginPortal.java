package Manipal.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPortal {
  @Test
  public void LoginPortalmethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");
		
	  WebDriver driver = new ChromeDriver();
		
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
	  driver.manage().window().maximize();
	  
	  Thread.sleep(500);
	  
	  WebElement usernameinput = driver.findElement(By.xpath("//input[@name = 'username']"));
	  
      WebElement passwordinput = driver.findElement(By.xpath("//input[@name = 'password']"));
      
      WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
      
      usernameinput.sendKeys("Admin");
      
      Thread.sleep(500);
	  
      passwordinput.sendKeys("admin123");
      
      Thread.sleep(500);
	  
      loginbutton.click();
      
      Thread.sleep(500);
      
      
  }
}