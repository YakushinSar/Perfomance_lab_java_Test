package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        // 1. Проверка начального состояния (до кликов)
        assertAll(
                () -> assertFalse(list.get(0).isSelected(), "Первый чекбокс должен быть не выбран"),
                () -> assertTrue(list.get(1).isSelected(), "Второй чекбокс должен быть выбран")
        );
        // 2. Кликаем по первому чекбоксу
        list.get(0).click();
        // 3. Проверка состояния после клика
        assertAll(
                () -> assertTrue(list.get(0).isSelected(), "После клика первый чекбокс должен быть выбран"),
                () -> assertTrue(list.get(1).isSelected(), "Второй чекбокс не должен измениться")
        );
        // 4. Кликаем по второму чекбоксу
        list.get(1).click();
        // 5. Финальная проверка
        assertAll(
                () -> assertTrue(list.get(0).isSelected(), "Первый чекбокс должен остаться выбранным"),
                () -> assertFalse(list.get(1).isSelected(), "После клика второй чекбокс должен быть не выбран")
        );

        driver.quit();
    }
}
