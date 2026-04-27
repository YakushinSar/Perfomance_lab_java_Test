package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void checkingFrames() {
        driver.get("https://the-internet.herokuapp.com/frames");
//      Открыть iFrame
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();
        driver.switchTo().frame(0);
//      Проверить, что текст внутри параграфа равен “Your content goes here.”
        WebElement content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));
        assertEquals(content.getText(), "Your content goes here.");
        driver.switchTo().defaultContent();
    }
}
