package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUpload() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        File file = new File("src/test/resources/Для проверки загрузки файла.png");
//      загрузить файл
        fileInput.sendKeys(file.getAbsolutePath());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='file-submit']"))).click();
//        проверить, что имя файла на странице совпадает с именем загруженного файла
        WebElement uploadedFilesText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='uploaded-files']")));
        assertEquals(uploadedFilesText.getText(), "Для проверки загрузки файла.png");
    }
}
