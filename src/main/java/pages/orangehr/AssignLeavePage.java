package pages.orangehr;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
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
    SelenideElement addAllDays = $("option[value='all']");
    SelenideElement addComment = $(By.id("assignleave_txtComment"));
    SelenideElement assignAssignLeavePage = $(By.id("assignBtn"));
    SelenideElement oKAssignLeavePage = $(By.id("confirmOkButton"));
    SelenideElement assignLeavelMessage =  $("div[class='head']");


    public void addAssignLeave() throws IOException {

        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));

        addEmployeeName.sendKeys(props.getProperty("Employee_Name"));
        addLeaveType.click();
        addUSPersonal.click();
//        employeeNameShould.shouldHave(visible.text(props.getProperty("new_user.name")));
        addFromDate.click();
        addFromDate.sendKeys(props.getProperty("From_Date"));
        addFromDate.pressEnter();
//        clickToDate.click();
        addToDate.clear();
        addToDate.sendKeys(props.getProperty("To_Date"));
        addToDate.pressEnter();

        addPartialDays.click();
        addAllDays.click();

        addComment.sendKeys(props.getProperty("user.Comment"));
        assignAssignLeavePage.shouldBe(visible).click();
        Selenide.sleep(2000);
//        oKAssignLeavePage.shouldBe(visible).click();
//        Selenide.sleep(2000);
        assignLeavelMessage.shouldBe(text("Overlapping Leave Requests Found"));
        Selenide.sleep(2000);
    }

//    public void openLoginPage(){
//        open("https://opensource-demo.orangehrmlive.com/");
//    }
}
