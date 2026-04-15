package lesson1;

public class BrowserActions {
    /*
# Работа с браузером
driver.get("http://onliner.by"); - Открыть Браузер/URL
driver.close(); - Закрыть вкладку браузера
driver.quit(); - Закрыть браузер
getWindowHandle() - Возвращает идентификатор текущего окна/вкладки
getTitle() - Возвращает заголовок (title) текущей страницы
getCurrentUrl() - Возвращает текущий URL-адрес страницы
getPageSource() - Возвращает HTML-код текущей страницы в виде строки
getWindowHandles() - Возвращает набор идентификаторов всех открытых окон/вкладок

# Работа с размерами окна: driver.manage().window().
maximize() - Разворачивает окно на весь экран
minimize() - Сворачивает окно
fullscreen() - Переводит в полноэкранный режим (F11)
setSize(Dimension) - Устанавливает определённый размер окна
setPosition(Point) - Устанавливает позицию окна
getSize() - Возвращает текущий размер окна
getPosition() - Возвращает текущую позицию окна

# Работа с таймаутами
driver.manage().timeouts();
driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10)); - браузер будет ждать каждый элемент до 10 секунд, прежде чем выбросить исключение, что элемент не найден.

# Работа с cookies: driver.manage().
addCookie() - Добавляет cookie
deleteAllCookies() - Удаляет все cookies
deleteCookie() - Удаляет конкретный cookie
deleteCookieNamed() - Удаляет cookie по имени
getCookieNamed() - Получает cookie по имени
getCookies() - Получает все cookies

# Действия: driver.navigate().
back() - Возвращается на предыдущую страницу (как кнопка "Назад" в браузере)
forward() - Переходит на следующую страницу (как кнопка "Вперёд")
to(URL url) - Переходит по указанному URL-адресу (объект URL)
to(String url) - Переходит по указанному URL-адресу (строка)
refresh() - Обновляет текущую страницу

# Переключения: driver.switchTo().
activeElement() - Переключается на активный элемент на странице
alert() - Переключается на всплывающее окно (alert/confirm/prompt)
defaultContent() - Возвращается к основному содержимому страницы (выход из фреймов)
frame(int index) - Переключается во фрейм по индексу
frame(String nameOrId) - Переключается во фрейм по имени или ID
frame(WebElement frameElement) - Переключается во фрейм по WebElement
newWindow(WindowType typeHint) - Создаёт и переключается в новое окно или вкладку
parentFrame() - Переключается в родительский фрейм
window(String nameOrHandle) - Переключается между окнами/вкладками по дескриптору


# Переключение между вкладками браузера: driver.getW.
getWindowHandle() - Возвращает идентификатор (handle) текущего окна/вкладки
getWindowHandles() - Возвращает набор идентификаторов всех открытых окон/вкладок

# Поиск: driver.find
findElement(By by) - Возвращает WebElement. Находит один элемент. Если не найден — выбрасывает NoSuchElementException
findElements(By by) - Возвращает List<WebElement>. Находит все подходящие элементы. Если не найдены — возвращает пустую коллекцию (не null)




     */
}
