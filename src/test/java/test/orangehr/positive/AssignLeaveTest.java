package test.orangehr.positive;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import pages.orangehr.AssignLeavePage;

import test.base.BasesTest;

import java.io.IOException;

public class AssignLeaveTest extends BasesTest {

    @Feature("CandidatePage")
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding a candidate")
    @Test
    public void addAssignLeaveTest() throws IOException {
        AssignLeavePage addAssign = new AssignLeavePage();
        addAssign.linkAssignLeave();
        addAssign.addAssignLeave();
    }
}
