
    import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
    import com.codeborne.selenide.logevents.SelenideLogger;
    import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
    import io.qameta.allure.selenide.AllureSelenide;
    import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.open;

    abstract public class BaseClass {
        @BeforeEach
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "Chrome";
            Configuration.browserSize = "1920x1080";
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        }
        @BeforeEach
        public void baseURL() {
            open("https://shop.lenovo.kz/");
        }
        @BeforeEach
        public void init() {
            setUp();
        }

        @AfterEach
        public void tearDown() {
            Selenide.closeWebDriver();
        }
    }

