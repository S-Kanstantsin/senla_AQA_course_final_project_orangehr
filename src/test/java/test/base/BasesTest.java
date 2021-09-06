package test.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.orangehr.LoginPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BasesTest {

    @BeforeEach
    public void setUp() throws IOException {
        Configuration.startMaximized = true;
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
    }



    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
