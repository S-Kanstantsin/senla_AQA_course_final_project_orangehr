package pages.orangehr;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddUser extends BasePage {
    SelenideElement userRole = $(By.id("txtUsername"));
    SelenideElement employeeName = $(By.id("systemUser_employeeName_empName"));
    SelenideElement employeeNameShould = $(By.id("systemUser_employeeName_empName"));
    SelenideElement usernameAddUser = $(By.id("systemUser_userName"));
    SelenideElement statusAddUser = $(By.id("btnLogin"));
    SelenideElement passwordAddUser = $(By.id("systemUser_password"));
    SelenideElement confirmPasswordAddUser = $(By.id("systemUser_confirmPassword"));
    SelenideElement saveButtonAddUser = $(By.id("btnSave"));


    public void addUser() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));

        employeeName.sendKeys(props.getProperty("new_user.name"));
//        employeeNameShould.shouldHave(visible.text(props.getProperty("new_user.name")));
        usernameAddUser.sendKeys(props.getProperty("new_user.username"));
        passwordAddUser.sendKeys(props.getProperty("new_user.password"));
        confirmPasswordAddUser.sendKeys(props.getProperty("new_user.password"));
        Selenide.sleep(2000);
        saveButtonAddUser.shouldBe(visible).click();
    }

//    public void openLoginPage(){
//        open("https://opensource-demo.orangehrmlive.com/");
//    }
}
