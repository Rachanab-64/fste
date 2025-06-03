import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity18{
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page Title: " + driver.getTitle());

        WebElement simpleAlertBtn = driver.findElement(By.id("simple"));
        simpleAlertBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simpleAlert = driver.switchTo().alert();

        System.out.println("Simple Alert Text: " + simpleAlert.getText());

        simpleAlert.accept();

       

        
        driver.quit();
    }
}
