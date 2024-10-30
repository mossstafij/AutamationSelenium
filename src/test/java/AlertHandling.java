import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://demoqa.com/alerts");
        WebDriver.Timeouts timeouts = webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)", "");

        //webDriver.findElement(By.id("alertButton")).click();
        //Alert alert = webDriver.switchTo().alert();
        //Thread.sleep(5000);
        //alert.accept();


        //webDriver.findElement(By.id("timerAlertButton")).click();
        //Alert alert1 = webDriver.switchTo().alert();
        //alert1.accept();

        //webDriver.findElement(By.id("confirmButton")).click();
        //Alert alert2= webDriver.switchTo().alert();
        //alert2.dismiss();

        webDriver.findElement(By.id("promtButton")).click();
        Alert alert3= webDriver.switchTo().alert();
        alert3.sendKeys("KeysSEND");
        alert3.accept();

        String text = webDriver.findElement(By.id("promptResult")).getText();
        System.out.println("Enterd text is: " +text);

    }
}
