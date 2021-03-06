package tests.qa.guru.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Owner("gregoryamelin")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Создание новой задачи")
    @DisplayName("Проверка создания issue для авторизованного пользователя")
    @Description("Этот тест проверяет создание Issue, когда происходит какое-то действие.")
    // УРЛ страницы, которую тестируем
    @Link(value = "testing", url = "https://github.com")

    public void testAnnotatedLabels() {

    }

    @Test
    @Feature("Задачи в репозитории")
    @Story("Создание следующей задачи")
    public void testAnnotatedLabelsTwo() {

    }

    @Test
    public void testDynamicLabels() {

        Allure.label("owner", "gregoryamelin");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Удаление новой задачи");
        Allure.getLifecycle().updateTestCase(testCase -> {
            testCase.setName("Проверка удаления issue для авторизованного пользователя");
        });
        Allure.description("Этот тест проверяет создание Issue, когда происходит другое действие");
        Allure.link("testing", "https://github.com\"");
    }


    @Test
    public void testParameters() {
        Allure.parameter("Регион", "Москвская область");
        Allure.parameter("Город", "Москва");
    }
}
