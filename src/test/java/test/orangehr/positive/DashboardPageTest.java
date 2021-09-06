package test.orangehr.positive;

import org.junit.Test;
import pages.orangehr.DashboardPage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import java.io.IOException;

public class DashboardPageTest extends BasesTest {

    @Feature("DashboardPage")
    @Severity(SeverityLevel.MINOR)
    @Description("Checking presence of elements page test")
    @Test
    public void dashboardPageTest() throws IOException {
        DashboardPage findDashboard = new DashboardPage();
        findDashboard.comparisonQuickLaunch();
        findDashboard.comparisonImgQuickLaunch();
        findDashboard.comparisonTablePage();
        findDashboard.comparisonLegend();
        findDashboard.comparisonImgLegend();
        findDashboard.comparisonsTable();
    }
}
