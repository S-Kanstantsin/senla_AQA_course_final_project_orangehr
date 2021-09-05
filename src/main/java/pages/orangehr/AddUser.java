package pages.orangehr;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AddUser extends BasePage {

    SelenideElement adduserRole = $(By.id("systemUser_userType"));
    SelenideElement addAdmin = $("option[value='1']");
    SelenideElement employeeName = $("input[id = 'systemUser_employeeName_empName']");
    SelenideElement employeeNameShould = $(By.id("systemUser_employeeName_empName"));
    SelenideElement usernameAddUser = $("input[id ='systemUser_userName']");
    SelenideElement addStatus = $(By.id("systemUser_status"));
    SelenideElement addEnabled = $("option[value='0']");
    SelenideElement passwordAddUser = $(By.id("systemUser_password"));
    SelenideElement confirmPasswordAddUser = $(By.id("systemUser_confirmPassword"));
    SelenideElement saveButtonAddUser = $(By.id("btnSave"));
    SelenideElement tableAddUser = $("table[id='resultTable']");
    ElementsCollection tableADUser = $$("table[id='resultTable']");

    public void addUser() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        adduserRole.selectOption("Admin");
        adduserRole.shouldBe(text("Admin "));
        employeeName.sendKeys(props.getProperty("new_user.name"));
        usernameAddUser.sendKeys(props.getProperty("new_user.username"));
//        usernameAddUser.getText("AlexxGun").should(visible);
        addStatus.selectOption("Enabled");
        addStatus.shouldBe(text("Enabled"));
//        employeeName.matchText("Fiona Grace"));
//        employeeNameShould.shouldHave(visible.text(props.getProperty("new_user.name")));

        Selenide.sleep(3000);

//        addEnabled.click();
//        addStatus.);
        passwordAddUser.sendKeys(props.getProperty("new_user.password"));
        confirmPasswordAddUser.sendKeys(props.getProperty("new_user.password"));
        Selenide.sleep(3000);
//        adduserRole.shouldHave(visible.text("Fiona Grace"));
//        usernameAddUser.shouldHave(text("AlexxGun"));

//
//        passwordAddUser.shouldHave(text("qwerty123789 "));
//        confirmPasswordAddUser.shouldHave(text("qwerty123789 "));

        saveButtonAddUser.shouldBe(visible).click();
        tableAddUser.shouldBe(text("AlexxGun"));
    }

//    public void openLoginPage(){
//        open("https://opensource-demo.orangehrmlive.com/");
//    }
}
