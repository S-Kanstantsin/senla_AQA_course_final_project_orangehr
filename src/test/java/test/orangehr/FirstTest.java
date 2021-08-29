package test.orangehr;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.orangehr.LoginPage;
import test.base.BasesTest;


import java.io.IOException;


//@ExtendWith({TextReportExtension.class})
public class FirstTest extends BasesTest {

    @Test
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();


    }








}
