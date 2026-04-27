package homework4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest {

    //правый клик по элементу
    @Test
    public void rightClickOnElement() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions
                .contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']")))
                .perform();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        assertNotNull(alert);
        alert.accept();
    }

    //валидация текста на алерте
    @Test
    public void textToAlert() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions
                .contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']")))
                .perform();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();

        assertEquals(text, "You selected a context menu");
        alert.accept();
    }

    //закрытие алерта
    @Test
    public void closeAlert() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions
                .contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']")))
                .perform();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        boolean alertIisClosed = wait.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));

        assertTrue(alertIisClosed, "Alert не закрылся");
    }
}
