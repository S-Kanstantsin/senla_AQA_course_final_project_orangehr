package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.JobTitlePage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import java.io.IOException;


public class JobTitleTest extends BasesTest {

    @Feature("JobTitle")
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding job title test")
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
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleFirst();
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleSecond();
        jobsTitlePage.buttonAddJobTitle();
        jobsTitlePage.addJobTitleThird();
        jobsTitlePage.checboxAddJobTitle();
    }

}
