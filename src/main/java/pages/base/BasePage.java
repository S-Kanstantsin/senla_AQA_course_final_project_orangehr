package pages.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class BasePage {

    public SelenideElement linkwelcomeMessage = $(By.id("welcome"));
    public SelenideElement linkLogout = $(byText("Logout"));
    public SelenideElement adminLink = $(By.className("firstLevelMenu"));
    public SelenideElement buttonAddSystemUser = $("input[name='btnAdd']");
    public SelenideElement linkJob = $("a[id='menu_admin_Job']");
    public SelenideElement linkJobTitle = $("a[id='menu_admin_viewJobTitleList']");
    public SelenideElement linkRecruitment = $("a[id= 'menu_recruitment_viewRecruitmentModule']");
    public SelenideElement linkCandidates = $("a[id= 'menu_recruitment_viewCandidates']");
    public SelenideElement linkLeave = $("a[id= 'menu_leave_viewLeaveModule']");
    public SelenideElement linkAssignLeave = $("a[id= 'menu_leave_assignLeave']");
    public SelenideElement linkPIM = $("a[id= 'menu_pim_viewPimModule']");
    public SelenideElement linkEmployeeList = $("a[id= 'menu_pim_viewEmployeeList']");
    public SelenideElement linkDashboard = $("a[id= 'menu_dashboard_index']");

    public SelenideElement welcomeMessage = $(By.id("welcome"));
    public SelenideElement loginPanelMessage = $(By.id("logInPanelHeading"));
    public SelenideElement invalidloginMessage = $(By.id("spanMessage"));
    public SelenideElement jobTitleslMessage = $(By.className("head"));
    public SelenideElement dashboardMessage = $("div[class= 'head']");


    public void linkwelcomeMessage() {
        linkwelcomeMessage.click();
    }

    public void linkEmployeeList() {
        linkPIM.click();
        linkEmployeeList.click();
    }

    public void linkLogout() {
        linkLogout.click();
    }

    public void adminLink() {
        adminLink.click();
    }

    public void buttonAddSystemUser() {
        buttonAddSystemUser.click();
    }

    public void linkJob() {
        linkJob.click();
    }

    public void pathToCandidates() {
        linkRecruitment.click();
        linkCandidates.click();
    }

    public void linkJobTitle() {
        linkJobTitle.click();
        jobTitleslMessage.shouldBe(text("Job Titles"));

    }

    public void linkAssignLeave() {
        linkLeave.click();
        linkAssignLeave.click();

    }

    public void linkDashboard() {
        linkDashboard.click();
        dashboardMessage.shouldBe(text("Dashboard"));

    }

    public void welcomeMessage() {
        welcomeMessage.shouldBe(text("Welcome "));
    }

    public void loginPanelMessage() {
        loginPanelMessage.shouldBe(text("LOGIN Panel"));
    }

    public void invalidloginMessage() {
        invalidloginMessage.shouldBe(text("Invalid credentials"));
    }


    public void findElementAndClickBox(String str) {
        $(By.xpath("//a[contains(text(),\'" + str + "\')]/ancestor::tr/td[1]/input[@type='checkbox']")).click();
    }


    public SelenideElement findElement(String str) {
        return $(By.xpath("//a[contains(text(),\'" + str + "\')]"));
    }


    public SelenideElement findFourthColumnElement(String str) {
        return $(By.xpath("//a[contains(text(),\'" + str + "\')]/ancestor::tr/td[4]/a"));
    }
}