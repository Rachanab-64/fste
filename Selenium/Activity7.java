import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title: " + driver.getTitle());

        WebElement textfield = driver.findElement(By.id("textInput"));
        System.out.println("Input field is enabled: " + textfield.isEnabled());
        driver.findElement(By.id("textInputButton")).click();
        
        System.out.println("Input field is enabled: " + textfield.isEnabled());
        
        textfield.sendKeys("Rachana");
        System.out.println(textfield.getDomProperty("value"));

       
        driver.quit();
    }
}
