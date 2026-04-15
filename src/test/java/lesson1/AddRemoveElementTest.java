package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AddRemoveElementTest {
//      должно в названии класса в начале или конце присутствовать слово Test

    @Test
/*
Слово test в названии метода необязательно писать(В JUnit 3 нужно было, чтобы метод начинался с test (т.к. аннотаций
ещё не было), В JUnit 4 и 5 — достаточно аннотации @Test, название может быть любым), а аннотация @Test обязательна
*/
    public void checkAddRemoveElement() {
        //задаем опции для нашего драйвера
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-notfications");

        //определяем браузер с которым хотим работать
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //открывает страницу по указанному url
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        int size = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assertions.assertEquals(2, size);

        driver.findElement(By.xpath("//button[text()='Delete']")).click();

        int size1 = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assertions.assertEquals(1, size1);

        //закрывает браузер
        driver.quit();
    }
}
