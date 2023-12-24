import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static java.lang.System.out;

public class TestAmazon {

    @Test
    public void checkJava(){
        System.out.println("Slava Ukraine!");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        driver.quit();
    }

}
