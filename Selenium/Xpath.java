
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");
     System.out.println(driver.getTitle());

     driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).click();
     System.out.println("About Us Page Title: " + driver.getTitle());


    
    driver.quit();
  }
}

