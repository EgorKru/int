import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class MainTestScenario extends BaseClass{
    MainPage mainPage = new MainPage();

    @Order(1)
    @DisplayName("Basic Open Main Page")
    @Test
    public void checkOpenMainPage() {
        mainPage.checkOpenMainPageFromHeaders();
    }
    @DisplayName("Transition In Authorisation Page")
    @Test
    public void transitionRegPage() {
        mainPage.transitionInLoginPage();
    }
    @DisplayName("Input valid data")
    @Test
    public void enterValidInf() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
    }
    @DisplayName("Choice gender in Personal Area")
    @Test
    public void changesGenderCheck() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
        mainPage.setGenderSelectionManActions();
    }
    @DisplayName ("Check correct exit from Personal Area")
    @Test
    public void exitFromPersonalAccount () {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
        mainPage.setGenderSelectionManActions();
        mainPage.exitFromPersAccount();
    }
    @DisplayName("Full test scenario entry, choice gender and exit from Personal Area")
    @Test
    public void fullScenarioMain() {
    mainPage.transitionInLoginPage();
    mainPage.enterValidInfo();
    mainPage.setGenderSelectionManActions();
    mainPage.exitFromPersAccount();
    }
    
}
