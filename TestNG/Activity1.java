package suiteExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        

        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    @Test
    public void getTitleTest() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
