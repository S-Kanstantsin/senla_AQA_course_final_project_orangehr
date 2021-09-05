package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class LoginTest extends BasesTest {

    @Test
    public void loginInTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
    }


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
}
