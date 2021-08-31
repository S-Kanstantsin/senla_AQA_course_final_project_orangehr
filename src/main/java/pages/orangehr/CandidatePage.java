package pages.orangehr;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CandidatePage extends BasePage {

    SelenideElement buttonAddCandidates = $("input[name='btnAdd']");
    SelenideElement buttonDelCandidates = $("input[name='btnDelete']");
    SelenideElement addFirstName = $(By.id("addCandidate_firstName"));
    SelenideElement addMiddleName = $(By.id("addCandidate_middleName"));
    SelenideElement addLastName = $(By.id("addCandidate_lastName"));
    SelenideElement addEmail = $(By.id("addCandidate_email"));
    SelenideElement addContactNo = $(By.id("addCandidate_contactNo"));
    SelenideElement addJobVacancy = $(By.id("addCandidate_vacancy"));
    SelenideElement addJunior = $("option[value='5']");
    SelenideElement addKeywords = $(By.id("addCandidate_keyWords"));
    SelenideElement addComment = $(By.id("addCandidate_comment"));
    SelenideElement checkConsentToKeepData = $(By.id("addCandidate_consentToKeepData"));
    SelenideElement saveAddCandidate = $(By.id("btnSave"));
    SelenideElement editAddCandidate = $(By.id("btnSave"));


    public void addCandidate() throws IOException {

        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        buttonAddCandidates.shouldBe(visible).click();
        addFirstName.sendKeys(props.getProperty("user.first_Name"));
//        employeeNameShould.shouldHave(visible.text(props.getProperty("new_user.name")));
        addMiddleName.sendKeys(props.getProperty("user.middle_name"));
        addLastName.sendKeys(props.getProperty("user.last_Name"));
        addEmail.sendKeys(props.getProperty("user.Email"));
        addJobVacancy.click();
        addJunior.click();
        addContactNo.sendKeys(props.getProperty("user.ContactNo"));
        addKeywords.sendKeys(props.getProperty("user.keywords"));
        addComment.sendKeys(props.getProperty("user.postal_Code"));
        checkConsentToKeepData.click();
        Selenide.sleep(2000);
        saveAddCandidate.shouldBe(visible).click();
        editAddCandidate.shouldBe(visible).click();

    }

//    public void openLoginPage(){
//        open("https://opensource-demo.orangehrmlive.com/");
//    }
}

