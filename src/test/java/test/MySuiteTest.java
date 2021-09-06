package test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import test.orangehr.negative.NegLoginTest;
import test.orangehr.positive.*;

@RunWith(JUnitPlatform.class)
@SelectClasses({LoginTest.class, JobTitleTest.class, SalesPageTest.class, DashboardPageTest.class,
        CandidatePageTest.class, UserTest.class, AssignLeaveTest.class, NegLoginTest.class})
public class MySuiteTest {
}
