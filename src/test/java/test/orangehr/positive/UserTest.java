package test.orangehr.positive;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import pages.orangehr.LoginPage;
import java.io.IOException;
import pages.orangehr.AddUser;
import test.base.BasesTest;

@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserTest extends BasesTest {

    @Feature("User")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Adding user test")
    @Order(1)
    @Test
    public void addUserTest() throws IOException {
        AddUser addUser = new AddUser();
        addUser.adminLink();
        addUser.buttonAddSystemUser();
        addUser.addUser();
    }

    @Feature("User")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Deleting user test")
    @Order(2)
    @Test
    public void deleteUserTest() throws IOException {
        AddUser deleteUser = new AddUser();
        deleteUser.adminLink();
        deleteUser.deleteUser();
    }

}
