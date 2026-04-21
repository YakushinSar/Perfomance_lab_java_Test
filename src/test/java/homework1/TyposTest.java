package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TyposTest {

    /*
5. Typos - Проверить соответствие параграфа орфографии
Локатор: By.tagName(“p”)
     */
    @Test
    public void checkParagraphSpelling() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/typos");

        String textBefore = driver.findElements(By.tagName("p")).get(1).getText();
        String textAfter = textBefore;
        int refreshCount = 0;

        while (textAfter.equals(textBefore) && refreshCount < 10) {
            driver.navigate().refresh();
            textAfter = driver.findElements(By.tagName("p")).get(1).getText();
            refreshCount++;
        }

        assertNotEquals(textBefore, textAfter, "Текст не изменился после " + refreshCount + " перезагрузок");
        System.out.println("Текст изменился после " + refreshCount + " перезагрузок");

        driver.quit();
    }
}