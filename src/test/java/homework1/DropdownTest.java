package homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropdownTest {

    /*
3. Dropdown - Взять все элементы дроп-дауна и проверить их наличие. Выбрать первый, проверить, что он выбран, выбрать
 второй, проверить, что он выбран
Локатор: By.id(“dropdown”)
     */
    @Test
    public void dropdownSelect() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownElement);

        List<WebElement> allOptions = select.getOptions();
        Assertions.assertEquals(3, allOptions.size());

        select.selectByIndex(1);
        Assertions.assertEquals("Option 1", select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option 2");
        Assertions.assertEquals("Option 2", select.getFirstSelectedOption().getText());

        driver.quit();
    }
}
