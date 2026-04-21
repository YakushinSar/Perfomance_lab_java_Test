package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddRemoveElementTest {

    /*
    1. Add/Remove Elements - добавить 2 элемента, удалить элемент, проверить количество элементов DELETE
    Локаторы xpath:
    a. By.xpath("//button[text()='Add Element']")
    b. By.xpath("//button[text()='Delete']")
     */
    @Test
    public void checkAddRemoveElement() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-notfications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        int size = driver.findElements(By.xpath("//button[text()='Delete']")).size();

        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int size1 = driver.findElements(By.xpath("//button[text()='Delete']")).size();

        assertAll(
                () -> assertEquals(2, size),
                () -> assertEquals(1, size1)
        );

        driver.quit();
    }
}
