package test.orangehr.negative;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import pages.orangehr.LoginPage;
import java.io.IOException;

import test.base.BasesTest;


public class NegLoginTest extends BasesTest {

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
}
