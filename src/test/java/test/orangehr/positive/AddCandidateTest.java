package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.AddUser;
import pages.orangehr.CandidatePage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class AddCandidateTest extends BasesTest {

    @Test
    public void addCandidateTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        CandidatePage addCandidate = new CandidatePage();
        loginPage.openLoginPage();
        loginPage.login();
//        loginPage.welcomeMessage();
        addCandidate.pathToCandidates();
        addCandidate.addCandidate();
    }
}
