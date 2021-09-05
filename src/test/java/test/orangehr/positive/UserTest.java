package test.orangehr.positive;

import org.junit.jupiter.api.Test;

import pages.orangehr.AddUser;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class UserTest extends BasesTest {
    @Test
    public void addUserTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        AddUser addUser = new AddUser();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.adminLink();
        loginPage.buttonAddSystemUser();
        addUser.addUser();
    }
    @Test
    public void deleteUserTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        AddUser deleteUser = new AddUser();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.adminLink();
        deleteUser.deleteUser();
    }

}
