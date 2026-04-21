package lesson1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;

public class Cookies {
    @Test
/*
Слово test в названии метода необязательно писать(В JUnit 3 нужно было, чтобы метод начинался с test (т.к. аннотаций
ещё не было), В JUnit 4 и 5 — достаточно аннотации @Test, название может быть любым), а аннотация @Test обязательна
*/
    public void checkAddRemoveElement() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://www.onliner.by/");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Наши куки:");
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getValue());
        }
        Cookie perfLab = new Cookie("perf_lab", "QA");
        driver.manage().addCookie(perfLab);

        Cookie perfLab1 = driver.manage().getCookieNamed("perf_lab");

        driver.quit();
    }
}

