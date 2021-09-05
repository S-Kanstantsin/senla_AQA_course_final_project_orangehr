package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.AddUser;
import pages.orangehr.JobTitlePage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class JobTitleTest extends BasesTest {
    @Test
    public void addJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        JobTitlePage jobsTitlePage = new JobTitlePage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcomeMessage();
        loginPage.adminLink();
        jobsTitlePage.linkJob();
        jobsTitlePage.linkJobTitle();
//        jobsTitlePage.dellAllJob();
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleFirst();
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleSecond();
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleThird();
        jobsTitlePage.checboxAddJobTitle();
    }

}
