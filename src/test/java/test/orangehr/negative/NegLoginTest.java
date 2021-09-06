package test.orangehr.negative;

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

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class NegLoginTest {

    @BeforeEach
    public void setUp() throws IOException {
        Configuration.startMaximized = true;
    }

    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login invalid login test")
    @Test
    public void negativeloginInTest() throws IOException {
        LoginPage invalidlogin = new LoginPage();
        invalidlogin.openLoginPage();
        invalidlogin.invalidlogin();
        invalidlogin.invalidloginMessage();
    }

    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login invalid password test")
    @Test
    public void negativepasswordInTest() throws IOException {
        LoginPage invalidPassword = new LoginPage();
        invalidPassword.openLoginPage();
        invalidPassword.invalidPassword();
        invalidPassword.invalidloginMessage();
    }

    @Feature("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login invalid login and password test")
    @Test
    public void negativeAllInTest() throws IOException {
        LoginPage invalidAll = new LoginPage();
        invalidAll.openLoginPage();
        invalidAll.invalidAll();
        invalidAll.invalidloginMessage();
    }
    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
