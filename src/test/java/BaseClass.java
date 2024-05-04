
    import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.open;

    abstract public class BaseClass {
        public void setUp() {

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

