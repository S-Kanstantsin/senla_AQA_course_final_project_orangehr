package test.orangehr.positive;

import org.junit.Test;
import pages.orangehr.DashboardPage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class DashboardPageTest extends BasesTest {
    @Test
    public void dashboardPageTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        DashboardPage findDashboard = new DashboardPage();
        loginPage.openLoginPage();
        loginPage.login();
        findDashboard.comparisonQuickLaunch();
        findDashboard.comparisonImgQuickLaunch();
        findDashboard.comparisonTablePage();
        findDashboard.comparisonLegend();
        findDashboard.comparisonImgLegend();
        findDashboard.comparisonsTable();

    }
}
