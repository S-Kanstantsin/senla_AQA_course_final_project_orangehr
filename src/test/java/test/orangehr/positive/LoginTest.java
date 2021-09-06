package test.orangehr.positive;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.orangehr.LoginPage;
import java.io.IOException;

import test.base.BasesTest;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginTest  {

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
    }
    @Feature("Login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login test")
    @Test
    public void loginInTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
    }

    @Feature("LoginOut")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login out test")
    @Test
    public void loginOutTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.linkwelcomeMessage();
        loginPage.linkLogout();
        loginPage.loginPanelMessage();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
