package pages.orangehr;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AssignLeavePage extends BasePage {


    SelenideElement addEmployeeName = $(By.id("assignleave_txtEmployee_empName"));
    SelenideElement addLeaveType = $(By.id("assignleave_txtLeaveType"));
    SelenideElement addUSPersonal = $("option[value='4']");
    SelenideElement seeLeaveBalance = $(By.id("addCandidate_lastName"));
    SelenideElement addFromDate = $(By.name("assignleave[txtFromDate]"));
    SelenideElement clickToDate = $("label[for= 'assignleave_txtToDate']");
    SelenideElement addToDate = $(By.name("assignleave[txtToDate]"));

    SelenideElement addPartialDays = $(By.name("assignleave[partialDays]"));
    SelenideElement addHalfDays = $("select[id='assignleave_firstDuration_duration']");
    SelenideElement addTimeOfDay = $("select[id='assignleave_firstDuration_ampm']");
    SelenideElement addComment = $(By.id("assignleave_txtComment"));
    SelenideElement leave_Balance = $("div[id='assignleave_leaveBalance']");
    SelenideElement assignAssignLeavePage = $(By.id("assignBtn"));
    SelenideElement oKAssignLeavePage = $(By.id("confirmOkButton"));
    SelenideElement assignLeavelMessage = $("div[class='head']");


    public void addAssignLeave() throws IOException {

        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));

        addEmployeeName.sendKeys(props.getProperty("Employee_Name"));
        addEmployeeName.should(exist).setValue(props.getProperty("Employee_Name"));

        addLeaveType.selectOption((props.getProperty("Leave_Type")));
        addLeaveType.shouldBe(text(props.getProperty("Leave_Type")));
        Selenide.sleep(3000);
//        employeeNameShould.shouldHave(visible.text)(props.getProperty("new_user.name")));
        addFromDate.click();
        addFromDate.sendKeys(props.getProperty("From_Date"));
        addFromDate.pressEnter();
        addFromDate.should(exist).setValue(props.getProperty("From_Date"));
//        clickToDate.click();
        addToDate.clear();
        addToDate.sendKeys(props.getProperty("To_Date"));
        addToDate.should(exist).setValue(props.getProperty("To_Date"));
        addToDate.should(exist).setValue(props.getProperty("To_Date"));
        addToDate.pressEnter();
        Selenide.sleep(2000);
        addPartialDays.shouldBe(visible).selectOption((props.getProperty("partial_Days")));
        addPartialDays.shouldBe(text(props.getProperty("partial_Days")));
        Selenide.sleep(2000);
        addHalfDays.shouldBe(visible).selectOption((props.getProperty("duration_Days")));
        addHalfDays.shouldBe(text(props.getProperty("duration_Days")));
        addTimeOfDay.shouldBe(visible).selectOption((props.getProperty("duration_TimeOfDay")));
        addTimeOfDay.shouldBe(text(props.getProperty("duration_TimeOfDay")));
        addComment.sendKeys(props.getProperty("user.Comment"));
        addComment.should(exist).setValue(props.getProperty("user.Comment"));
        assignAssignLeavePage.shouldBe(visible).click();
//        oKAssignLeavePage.shouldBe(visible).click();
        leave_Balance.shouldBe(visible.text(props.getProperty("leave_Balance")));
//        assignAssignLeavePage.shouldBe(visible).click();
//        assignLeavelMessage.shouldBe(text("Overlapping Leave Requests Found"));
    }


}
