package test.orangehr.positive;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import pages.orangehr.CandidatePage;
import pages.orangehr.LoginPage;
import test.base.BasesTest;

import java.io.IOException;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CandidatePageTest extends BasesTest {

    @Feature("CandidatePage")
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding a candidate test")
    @Order(1)
    @Test
    public void addCandidateTest() throws IOException {
        CandidatePage addCandidate = new CandidatePage();
        addCandidate.pathToCandidates();
        addCandidate.addCandidate();
    }

    @Feature("CandidatePage")
    @Severity(SeverityLevel.NORMAL)
    @Description("Deleting a candidate test")
    @Order(2)
    @Test
    public void deleteCandidateTest() throws IOException {
        CandidatePage deleteCandidate = new CandidatePage();
        deleteCandidate.pathToCandidates();
        deleteCandidate.addDeleteCandidate();
        deleteCandidate.DeleteCandidate();

    }
}
