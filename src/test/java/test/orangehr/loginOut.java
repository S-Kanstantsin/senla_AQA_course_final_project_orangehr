package test.orangehr;

import org.junit.jupiter.api.Test;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class loginOut extends BasesTest {

    @Test
    public void loginOut() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.linkwelcomeMessage();
        loginPage.linkLogout();
        loginPage.loginPanelMessage();
    }


}
