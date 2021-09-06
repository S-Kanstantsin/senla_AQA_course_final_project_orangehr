package pages.orangehr;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static com.codeborne.selenide.Condition.text;
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
    SelenideElement addJResume = $("input[name='addCandidate[resume]']");
    SelenideElement addJunior = $("option[value='5']");
    SelenideElement addKeywords = $(By.id("addCandidate_keyWords"));
    SelenideElement addComment = $(By.id("addCandidate_comment"));
    SelenideElement addDate = $(By.name("addCandidate[appliedDate]"));
    SelenideElement checkConsentToKeepData = $(By.id("addCandidate_consentToKeepData"));
    SelenideElement saveAddCandidate = $(By.id("btnSave"));
    SelenideElement backAddCandidate = $(By.id("btnSave"));
    SelenideElement editAddCandidate = $(By.id("btnBack"));
    SelenideElement tableAddCandidate = $("table[id='resultTable']");
    SelenideElement buttonDelCandidate = $("input[name='btnDelete']");
    SelenideElement buttonYesDelCandidate = $("input[id='dialogDeleteBtn']");


    public void addCandidate() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        buttonAddCandidates.shouldBe(visible).click();
        addFirstName.sendKeys(props.getProperty("user.first_Name"));
        addMiddleName.sendKeys(props.getProperty("user.middle_name"));
        addLastName.sendKeys(props.getProperty("user.last_Name"));
        addEmail.sendKeys(props.getProperty("user.Email"));
        addJobVacancy.selectOption("Associate IT Manager");
        addContactNo.sendKeys(props.getProperty("user.ContactNo"));
        addJResume.uploadFile(new File("src/main/resources/cv.doc"));
        addKeywords.sendKeys(props.getProperty("user.keywords"));
        addComment.sendKeys(props.getProperty("user.postal_Code"));
        addDate.clear();
        addDate.sendKeys(props.getProperty("From_Date"));
        checkConsentToKeepData.click();
        saveAddCandidate.shouldBe(visible).click();
        editAddCandidate.shouldBe(visible).click();
        tableAddCandidate.shouldBe(text("Alex Tor Odin"));
    }

    public void addDeleteCandidate() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        buttonAddCandidates.shouldBe(visible).click();
        addFirstName.sendKeys(props.getProperty("delete_user.first_Name"));
        addMiddleName.sendKeys(props.getProperty("user.middle_name"));
        addLastName.sendKeys(props.getProperty("user.last_Name"));
        addEmail.sendKeys(props.getProperty("user.Email"));
        addJobVacancy.selectOption("Associate IT Manager");
        addContactNo.sendKeys(props.getProperty("user.ContactNo"));
        addJResume.uploadFile(new File("src/main/resources/cv.doc"));
        addKeywords.sendKeys(props.getProperty("user.keywords"));
        addComment.sendKeys(props.getProperty("user.postal_Code"));
        addDate.clear();
        addDate.sendKeys(props.getProperty("From_Date"));
        checkConsentToKeepData.click();
        saveAddCandidate.shouldBe(visible).click();
        editAddCandidate.shouldBe(visible).click();
        tableAddCandidate.shouldBe(text("Loki Tor Odin"));
    }

    public  void DeleteCandidate()  throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        findElementAndClickBox(props.getProperty("delete_user.first_Name"));
        buttonDelCandidate.click();
        buttonYesDelCandidate.click();
        tableAddCandidate.shouldNotBe(text("Loki Tor Odin"));
    }
}

