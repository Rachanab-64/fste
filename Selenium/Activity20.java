
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/alerts");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement promptButton = driver.findElement(By.id("prompt"));
        promptButton.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert promptAlert = driver.switchTo().alert();

        System.out.println("Prompt Alert Text: " + promptAlert.getText());

        promptAlert.sendKeys("Awesome!");

        promptAlert.accept();

        driver.quit();
    }
}

