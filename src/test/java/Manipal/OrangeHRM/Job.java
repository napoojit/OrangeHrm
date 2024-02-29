package Manipal.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Job {
    @Test
    public void Jobmethod() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Locators for login elements
        By usernameLocator = By.xpath("//input[@name='username']");
        By passwordLocator = By.xpath("//input[@name='password']");
        By loginButtonLocator = By.xpath("//button[@type='submit']");

        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator)).sendKeys("Admin");
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator)).sendKeys("admin123");
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator)).click();
        Thread.sleep(500);

        navigateToAnotherPage("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
        driver.manage().window().maximize();

        WebElement MyInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = 'oxd-main-menu-item active']")));
        MyInfo.click();

        navigateToAnotherPage("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7");
        driver.manage().window().maximize();

       
        // Close the browser
        driver.quit();
    }

    private void navigateToAnotherPage(String url) {
        // TODO: You may implement page navigation logic here
    }
}
