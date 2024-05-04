import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class UITest extends BaseClass{
    MainPage mainPage = new MainPage();

    @BeforeEach
    @Test
    public void checkOpenMainPage() {
        open("https://shop.lenovo.kz/");
        mainPage.checkOpenMainPageFromHeaders();
    }
    @Test
    public void transitionRegPage() {
        mainPage.transitionInLoginPage();
    }
    @Test
    public void enterValidInf() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
    }
    @Test
    public void changesGenderCheck() {
        mainPage.transitionInLoginPage();
        mainPage.enterValidInfo();
        mainPage.setGenderSelectionManActions();
    }

}
