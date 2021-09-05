package test.orangehr.positive;

import org.junit.jupiter.api.Test;
import pages.orangehr.CandidatePage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

public class CandidatePageTest extends BasesTest {

    @Test
    public void addCandidateTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        CandidatePage addCandidate = new CandidatePage();
        loginPage.openLoginPage();
        loginPage.login();
        addCandidate.pathToCandidates();
        addCandidate.addCandidate();
    }

    @Test
    public void deleteCandidateTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        CandidatePage deleteCandidate = new CandidatePage();
        loginPage.openLoginPage();
        loginPage.login();
        deleteCandidate.pathToCandidates();
        deleteCandidate.addDeleteCandidate();
        deleteCandidate.DeleteCandidate();

    }
}
