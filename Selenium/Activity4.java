import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/target-practice");

        System.out.println("Page Title: " + driver.getTitle());

        WebElement thirdHeader = driver.findElement(By.xpath("(//h3)[1]"));
        System.out.println("3rd Header Text: " + thirdHeader.getText());

        WebElement fifthHeader = driver.findElement(By.xpath("(//h5)[1]"));
        System.out.println("5th Header Color: " + fifthHeader.getCssValue("color"));

        WebElement purpleButton = driver.findElement(By.xpath("//button[contains(@class, 'purple')]"));
        System.out.println("Purple Button Classes: " + purpleButton.getDomAttribute("class"));

      
        WebElement slateButton = driver.findElement(By.xpath("//button[contains(@class, 'slate')]"));
        System.out.println("Slate Button Text: " + slateButton.getText());

        driver.quit();
    }
}
