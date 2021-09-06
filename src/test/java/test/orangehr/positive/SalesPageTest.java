package test.orangehr.positive;

import org.junit.Test;
import pages.orangehr.LoginPage;
import pages.orangehr.SalesPage;
import test.base.BasesTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import java.io.IOException;


public class SalesPageTest extends BasesTest {

    @Feature("SalesPage")
    @Severity(SeverityLevel.MINOR)
    @Description("Checking the form test")
    @Test
    public void shouldElementPersonalDetails() throws IOException {
        SalesPage natan = new SalesPage();
        natan.linkEmployeeList();
        natan.goToPagePersonalDetails();
        natan.shouldElementPersonalDetails();
    }
}
