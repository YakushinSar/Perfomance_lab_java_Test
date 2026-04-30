package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControls() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        SoftAssert softAssert = new SoftAssert();
        //нажать на кнопку Remove около чекбокса
        driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
        WebElement textRemove = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        //дождаться надписи “It’s gone”
        softAssert.assertEquals(textRemove.getText(), "It's gone!");
        //проверить, что чекбокса нет
        boolean isCheckboxPresent = driver.findElements(By.id("checkbox")).size() > 0;
        softAssert.assertFalse(isCheckboxPresent, "Чекбокс всё ещё присутствует");
        //найти инпут
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"text\"]")));
        softAssert.assertTrue(input.isDisplayed());
        //проверить, что он Disabled (неактивный)
        softAssert.assertFalse(input.isEnabled());
        //нажать на кнопку
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Enable']"))).click();
        //дождаться надписи “It's enabled!”
        WebElement enabledText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        softAssert.assertEquals(enabledText.getText(), "It's enabled!");
        //проверить, что инпут Enabled (активный)
        softAssert.assertTrue(input.isEnabled());
        softAssert.assertAll();
    }
}
