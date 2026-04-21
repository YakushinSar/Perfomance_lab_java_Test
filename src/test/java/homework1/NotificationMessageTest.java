package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificationMessageTest {

    /*
8. * Notification Messages - кликнуть на кнопку, дождаться появления
нотификации, проверить соответствие текста ожиданиям
     */
    @Test
    public void notificationMessage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

        driver.findElement(By.xpath("//a[normalize-space()='Click here']")).click();
        WebElement notificationText = driver.findElement(By.id("flash"));
        String actualText = notificationText.getText().replace("×", "").trim();
        boolean isValid = actualText.equals("Action successful") || actualText.equals("Action unsuccesful, please try again");

        assertTrue(isValid, actualText);

        driver.quit();
    }
}