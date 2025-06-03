import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page Title: " + driver.getTitle());

        WebElement confirmAlertBtn = driver.findElement(By.id("confirmation"));
        confirmAlertBtn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmAlert = driver.switchTo().alert();

        System.out.println("Confirm Alert Text (Accept): " + confirmAlert.getText());
        confirmAlert.accept();
        confirmAlertBtn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmAlert2 = driver.switchTo().alert();

        System.out.println("Confirm Alert Text (Dismiss): " + confirmAlert2.getText());
        confirmAlert2.dismiss();

        driver.quit();
    }
}
