package test.orangehr;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.orangehr.AddUser;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class AddUsertest extends BasesTest {
    @Test
    public void AddUserTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        AddUser addUser = new AddUser();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.adminLink();
        loginPage.buttonAddSystemUser();
        addUser.addUser();

    }
}
