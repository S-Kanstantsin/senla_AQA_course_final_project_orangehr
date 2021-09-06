package test.orangehr.positive;

import org.junit.Test;
import pages.orangehr.LoginPage;
import pages.orangehr.SalesPage;
import test.base.BasesTest;

import java.io.IOException;

public class SalesPageTest extends BasesTest {
    @Test
    public void shouldElementPersonalDetails() throws IOException {
        LoginPage loginPage = new LoginPage();
        SalesPage natan = new SalesPage();
        loginPage.openLoginPage();
        loginPage.login();
        natan.linkEmployeeList();
        natan.goToPagePersonalDetails();
        natan.shouldElementPersonalDetails();
    }
}
