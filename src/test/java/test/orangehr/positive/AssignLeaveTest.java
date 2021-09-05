package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.AssignLeavePage;
import pages.orangehr.LoginPage;
import java.io.IOException;

public class AssignLeaveTest {
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
