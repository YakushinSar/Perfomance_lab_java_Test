package homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class CheckboxesTest {

    /*
2. Checkboxes - проверить, что первый чекбокс unchecked, отметить первый чекбокс, проверить что он checked. Проверить, что второй чекбокс
checked, сделать unheck, проверить, что он unchecked
     */
    @Test
    public void сheckBoxesSelected() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> list = driver.findElements(By.cssSelector("[type=checkbox]"));
        Assertions.assertFalse(list.get(0).isSelected());

        list.get(0).click();
        Assertions.assertTrue(list.get(0).isSelected());

        Assertions.assertTrue(list.get(1).isSelected());

        list.get(1).click();
        Assertions.assertFalse(list.get(1).isSelected());

        driver.quit();
    }
}
