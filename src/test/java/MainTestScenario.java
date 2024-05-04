import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class MainTestScenario extends BaseClass{
    MainPage mainPage = new MainPage();

    @BeforeEach
    @Order(1)
    @DisplayName("Базовое открытие главной страницы сайта")
    @Test
    public void checkOpenMainPage() {
        mainPage.checkOpenMainPageFromHeaders();
    }
    @DisplayName("Переход на страницу авторизации")
    @Test
    public void transitionRegPage() {
        mainPage.transitionInLoginPage();
    }
    @DisplayName("Ввод валидных данных для входа, вход в ЛК")
    @Test
    public void enterValidInf() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
    }
    @DisplayName("Выбор пола в ЛК")
    @Test
    public void changesGenderCheck() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
        mainPage.setGenderSelectionManActions();
    }
    @DisplayName ("Проверка корректности выхода из ЛК")
    @Test
    public void exitFromPersonalAccount () {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
        mainPage.setGenderSelectionManActions();
        mainPage.exitFromPersAccount();
    }
    @DisplayName("Полный тест сценарий входа, выбора гендера и выхода из ЛК")
    @Test
    public void fullScenarioMain() {
    mainPage.transitionInLoginPage();
    mainPage.enterValidInfo();
    mainPage.setGenderSelectionManActions();
    mainPage.exitFromPersAccount();
    }
}
