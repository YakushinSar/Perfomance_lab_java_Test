package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputsTest {

    /*
4. Inputs - Проверить на возможность ввести различные цифровые и нецифровые значения, используя Keys.ARROW_UP и Keys.ARROW_DOWN
Локатор: By.tagName(“input”)
     */
    @Test
    public void inputs() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));

        input.sendKeys("test");
        assertEquals("", input.getAttribute("value"));

        input.clear();
        input.sendKeys("10");
        assertEquals("10", input.getAttribute("value"));

        input.sendKeys(Keys.ARROW_UP);
        assertEquals("11", input.getAttribute("value"));

        input.sendKeys(Keys.ARROW_DOWN);
        assertEquals("10", input.getAttribute("value"));
        driver.quit();
    }
}