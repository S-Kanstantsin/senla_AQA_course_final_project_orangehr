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

    public static  String ADDUSER;
    SelenideElement adduserRole = $(By.id("systemUser_userType"));
    SelenideElement employeeName = $("input[id = 'systemUser_employeeName_empName']");

    SelenideElement usernameAddUser = $("input[id ='systemUser_userName']");
    SelenideElement addStatus = $(By.id("systemUser_status"));
    SelenideElement passwordAddUser = $(By.id("systemUser_password"));
    SelenideElement confirmPasswordAddUser = $(By.id("systemUser_confirmPassword"));
    SelenideElement saveButtonAddUser = $(By.id("btnSave"));
    SelenideElement tableAddUser = $("table[id='resultTable']");
    SelenideElement tableUser = $("table[id='resultTable']");
    SelenideElement buttonDelUser = $("input[name='btnDelete']");
    SelenideElement buttonYesDelUser = $("input[id='dialogDeleteBtn']");



    public void addUser() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        adduserRole.selectOption(props.getProperty("user_Role"));
        adduserRole.shouldBe(text(props.getProperty("user_Role")));
        employeeName.sendKeys(props.getProperty("new_user.name"));
        employeeName.should(exist).setValue(props.getProperty("new_user.name"));
        usernameAddUser.sendKeys(props.getProperty("new_user.username"));
        usernameAddUser.should(exist).setValue(props.getProperty("new_user.username"));
        addStatus.selectOption(props.getProperty("ser_Status"));
        addStatus.shouldBe(text(props.getProperty("ser_Status")));
        passwordAddUser.sendKeys(props.getProperty("new_user.password"));
        passwordAddUser.should(exist).setValue(props.getProperty("new_user.password"));
        confirmPasswordAddUser.sendKeys(props.getProperty("new_user.password"));
        confirmPasswordAddUser.should(exist).setValue(props.getProperty("new_user.password"));
        Selenide.sleep(3000);
        saveButtonAddUser.shouldBe(visible).click();
        tableAddUser.shouldBe(text(props.getProperty("new_user.name")));
    }

    public  void deleteUser()  throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        ADDUSER = props.getProperty("new_user.username");
        checbDelUser(ADDUSER);
        buttonDelUser.click();
        buttonYesDelUser.click();
        tableUser.shouldNotBe(text(props.getProperty("new_user.name")));
    }

    public void checbDelUser(String str){
        SelenideElement checboxAddJobTitle = $((By.xpath("//a[contains(text(),\'" + str + "\')]/ancestor::tr/td[1]/input[@type='checkbox']")));
        checboxAddJobTitle.click();
    }



}
