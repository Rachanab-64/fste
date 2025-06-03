
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    
    driver.get("https://training-support.net");
     System.out.println(driver.getTitle());

     driver.findElement(By.id("About Us")).click();
     System.out.println("About Us Page Title: " + driver.getTitle());
    driver.quit();
  }
}
