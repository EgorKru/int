import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage{
    private final SelenideElement headerMainPage = $(By.xpath("//div[@class='header__container js-header-container']"));

    public void checkOpenMainPageFromHeaders() {
        headerMainPage.shouldBe(visible);
    }
    private final SelenideElement loginPage = $(By.xpath("//a[@class='header__right-btn m-fifth']"));
    private final SelenideElement buttonLoginSubmit = $(By.xpath("//button[@class='button m-block m-primary m-large m-blue ']"));

    public void transitionInLoginPage() {
        loginPage.click();
        buttonLoginSubmit.shouldBe(visible);
    }
    private final SelenideElement emailField = $(By.xpath("//input[@name='USER_LOGIN']"));
    private final SelenideElement passwordField = $(By.xpath("//input[@name='USER_PASSWORD']"));

    private final SelenideElement checkVisibleAfterEnter = $(By.xpath("//a[@href='/lk/orders/']"));
    public void enterValidInfo() {
        emailField.sendKeys("vitaerota@mail.ru");
        passwordField.sendKeys("8919561za");
        buttonLoginSubmit.click();
        checkVisibleAfterEnter.shouldBe(visible);
    }
    private final SelenideElement genderSelectionMan = $(By.xpath("//label[@for='lk-male']"));
    private final SelenideElement saveChanges = $(By.xpath("//button[@class='button m-block m-primary m-large m-blue lkPersonalDataForm__save ']"));
    private final SelenideElement popUpWindow = $(By.xpath("//div[@class='alert alert-success js-success-text']"));
    private final SelenideElement mainCab = $(By.xpath("//a[@class='lkBreed__card m-purple']"));
    private final SelenideElement agreeWindow = $(By.xpath("//button[@class='button m-block m-primary m-small m-blue useCookiesInfoAgree']"));

    public void setGenderSelectionManActions() {
        mainCab.click();
        agreeWindow.click();
        genderSelectionMan.click();
        saveChanges.click();
        popUpWindow.shouldBe(visible);
    }
    private final SelenideElement exitFromPersonalAccount = $(By.xpath("//span[@class='page-text m-s14']"));

    public void exitFromPersAccount () {
        exitFromPersonalAccount.click();
        buttonLoginSubmit.shouldBe(visible);
    }
}
