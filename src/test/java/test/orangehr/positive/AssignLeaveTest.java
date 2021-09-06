package test.orangehr.positive;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import pages.orangehr.AssignLeavePage;
import pages.orangehr.LoginPage;
import java.io.IOException;

public class AssignLeaveTest {

    @Feature("CandidatePage")
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding a candidate")
    @Test
    public void addAssignLeaveTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        AssignLeavePage addAssign = new AssignLeavePage();
        loginPage.openLoginPage();
        loginPage.login();
        addAssign.linkAssignLeave();
        addAssign.addAssignLeave();
    }
}
