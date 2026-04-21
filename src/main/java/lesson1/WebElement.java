package lesson1;

public class WebElement {
    /*
# действия
getAttribute("value") - Возвращает значение атрибута (например, value, id, class),	element.getAttribute("value")
getAttribute("innerText") - Возвращает видимый текст элемента (даже если элемент скрыт),	element.getAttribute("innerText")
getText() - Возвращает видимый текст элемента (только видимые элементы),	element.getText(), не работает для <input>,
 потому что у него нет текстового содержимого между тегами.Для получения введённого значения используй getAttribute("value").
getCssValue("font-size") - Возвращает значение CSS-свойства,	element.getCssValue("color")
getTagName() - Возвращает имя HTML-тега элемента,	element.getTagName() → "div"



click() - Выполняет клик по элементу
sendKeys("text") - Вводит текст в поле (или отправляет нажатия клавиш)
submit() - Отправляет форму (если элемент находится внутри формы)
clear() - Очищает текстовое поле (удаляет весь текст)

Keys — это набор констант для специальных клавиш, который представляет непечатные клавиши (клавиши, у которых нет видимого символа).
input.sendKeys(Keys.ARROW_UP);
// Ctrl+A (выделить всё). Keys.chord() — это статический метод в Selenium, который объединяет несколько клавиш в одну последовательность для отправки через sendKeys().
input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
Стрелка вверх	Keys.ARROW_UP	Перемещает курсор вверх / увеличивает число
Стрелка вниз	Keys.ARROW_DOWN	Перемещает курсор вниз / уменьшает число
Enter	Keys.ENTER	Нажимает Enter
Tab	Keys.TAB	Переключает фокус на следующий элемент
Escape	Keys.ESCAPE	Отменяет действие
Backspace	Keys.BACK_SPACE	Удаляет символ слева
Delete	Keys.DELETE	Удаляет символ справа
Control	Keys.CONTROL	Для комбинаций (например, Ctrl+A)

# проверки
isSelected() - Проверяет, выбран ли элемент (checkbox, radio button, option)	true / false
isDisplayed() - Проверяет, видим ли элемент на странице (не скрыт через CSS)	true / false
isEnabled() - Проверяет, активен ли элемент (например, кнопка не заблокирована)	true / false
     */
}
