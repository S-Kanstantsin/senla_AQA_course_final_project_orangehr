package test.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BasesTest {

    @BeforeEach
    public void setUp() {
//        Configuration.headless = true;
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
