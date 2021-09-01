package test.orangehr;

import org.junit.jupiter.api.Test;
import pages.orangehr.AssignLeavePage;
import pages.orangehr.JobTitlePage;
import pages.orangehr.LoginPage;

import java.io.IOException;

public class AssignLeaveTest {

    @Test
    public void addAssignLeaveTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        AssignLeavePage addAssign = new AssignLeavePage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        addAssign.linkAssignLeave();
        addAssign.addAssignLeave();
//        jobsTitlePage.dellAllJob();
//        jobsTitlePage.buttonAddJobTitle();
//        jobsTitlePage.addJobTitleFirst();
//        jobsTitlePage.buttonAddJobTitle();
//        jobsTitlePage.addJobTitleSecond();
//        jobsTitlePage.buttonAddJobTitle();
//        jobsTitlePage.addJobTitleThird();
//        jobsTitlePage.checboxAddJobTitle();
    }
}
