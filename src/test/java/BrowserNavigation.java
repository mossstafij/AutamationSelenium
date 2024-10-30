import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.table.TableRowSorter;
import java.time.Duration;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.selenium.dev/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Downloads")).click();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep((5000));

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.get("https://www.selenium.dev/");
        driver.quit();
    }
}
