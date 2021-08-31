package pages.orangehr;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class JobTitlePage extends BasePage {

    SelenideElement jobTitle = $("input[id='jobTitle_jobTitle']");
    SelenideElement jobDescription = $("textarea[id='jobTitle_jobDescription']");
    SelenideElement jobSpecification = $("input[id='jobTitle_jobSpec']");
    SelenideElement jobNote = $("textarea[id='jobTitle_note']");
    SelenideElement saveButtonAddJobTitle = $("input[name='btnSave']");
    SelenideElement buttonAddJobTitle = $("input[name='btnAdd']");
    //    SelenideElement checboxAddJobTitle =  $(By.name("chkSelectRow[]"));
    SelenideElement checboxAddJobTitle = $(By.id("resultTable"));
    SelenideElement buttonDelJobTitle = $("input[name='btnDelete']");
    SelenideElement checboxAllJobTitle = $("input[id='ohrmList_chkSelectAll']");
    SelenideElement buttonYesDelJobTitle = $("input[id='dialogDeleteBtn']");


    public void addJobTitleFirst() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        jobTitle.sendKeys(props.getProperty("job_first.title"));
        jobDescription.sendKeys(props.getProperty("job_first.description"));
        //jobSpecification.sendKeys(props.getProperty("job_first.specification"));
        jobNote.sendKeys(props.getProperty("job_first.Note"));
//        Selenide.sleep(2000);
        saveButtonAddJobTitle.shouldBe(visible).click();
    }

    public void addJobTitleSecond() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        jobTitle.sendKeys(props.getProperty("job_second.title"));
        jobDescription.sendKeys(props.getProperty("job_first.description"));
        //jobSpecification.sendKeys(props.getProperty("job_first.specification"));
        jobNote.sendKeys(props.getProperty("job_first.Note"));

        saveButtonAddJobTitle.shouldBe(visible).click();
    }

    public void addJobTitleThird() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        jobTitle.sendKeys(props.getProperty("job_third.title"));
        jobDescription.sendKeys(props.getProperty("job_first.description"));
        //jobSpecification.sendKeys(props.getProperty("job_first.specification"));
        jobNote.sendKeys(props.getProperty("job_first.Note"));

        saveButtonAddJobTitle.shouldBe(visible).click();
    }


    public void buttonAddJobTitle() {
        buttonAddJobTitle.click();
    }

    public void dellAllJob() {
        checboxAllJobTitle.click();
        buttonDelJobTitle.click();
        buttonYesDelJobTitle.click();

    }

    public void checboxAddJobTitle() {
        checboxAddJobTitle.shouldBe(visible);
        ElementsCollection buttonsRemove = checboxAddJobTitle.$$("input[name='chkSelectRow[]']");
        for (SelenideElement item : buttonsRemove)
//            System.out.println(item);
            item.click();
        buttonDelJobTitle.click();
        buttonYesDelJobTitle.click();


        Selenide.sleep(2000);
    }
//    public void checboxAddJobTitle() {
//        checboxAddJobTitle.click();
//        Selenide.sleep(2000);
//    }
}

