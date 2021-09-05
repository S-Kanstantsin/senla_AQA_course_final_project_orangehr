package test.orangehr.negative;

import org.junit.jupiter.api.Test;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class NegLoginTest extends BasesTest {
    @Test
    public void negativeloginInTest() throws IOException {
        LoginPage invalidlogin = new LoginPage();
        invalidlogin.openLoginPage();
        invalidlogin.invalidlogin();
        invalidlogin.invalidloginMessage();
    }

    @Test
    public void negativepasswordInTest() throws IOException {
        LoginPage invalidPassword = new LoginPage();
        invalidPassword.openLoginPage();
        invalidPassword.invalidPassword();
        invalidPassword.invalidloginMessage();
    }

    @Test
    public void negativeAllInTest() throws IOException {
        LoginPage invalidAll = new LoginPage();
        invalidAll.openLoginPage();
        invalidAll.invalidAll();
        invalidAll.invalidloginMessage();
    }
}
