package pages.orangehr;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.base.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SalesPage extends BasePage {

    SelenideElement firstName = $(By.id("personal_txtEmpFirstName"));
    SelenideElement middleName = $(By.id("personal_txtEmpMiddleName"));
    SelenideElement lastName = $(By.id("personal_txtEmpLastName"));
    SelenideElement employeeId = $(By.id("personal_txtEmployeeId"));
    SelenideElement otherID = $(By.id("personal_txtOtherID"));
    SelenideElement driverLicenseNumber = $(By.id("personal_txtLicenNo"));
    SelenideElement numberSSN = $(By.id("personal_txtNICNo"));
    SelenideElement licenseExpiryDate = $(By.id("personal_txtLicExpDate"));
    SelenideElement numberSIN = $(By.id("personal_txtSINNo"));
    SelenideElement genderMale = $(By.id("personal_optGender_1"));
    SelenideElement nationality = $(By.id("personal_cmbNation"));
    SelenideElement nationalValueAmerican = $(By.xpath("//option[contains(text(),'American')]"));
    SelenideElement maritalStatus = $(By.id("personal_cmbMarital"));
    SelenideElement dataBirth = $(By.id("personal_DOB"));
    SelenideElement nickName = $(By.id("personal_txtEmpNickName"));
    SelenideElement militaryService = $(By.id("personal_txtMilitarySer"));
    SelenideElement smokerBox = $(By.id("personal_chkSmokeFlag"));
    SelenideElement buttonSave = $(By.id("btnSave"));

    SelenideElement addEmployeeName = $("input[class='ac_input inputFormatHint']");
    SelenideElement buttonSearch = $(By.id("searchBtn"));

    public void goToPagePersonalDetails() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        addEmployeeName.sendKeys(props.getProperty("employee_Name"));
        buttonSearch.shouldBe(visible).click();
        findFourthColumnElement((props.getProperty("Natan_first_Name"))).click();
    }

    public void shouldElementPersonalDetails() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));

        firstName.shouldHave(value(props.getProperty("Natan_first_Name")));
        middleName.should(visible);
        Selenide.sleep(3000);
        lastName.shouldHave(value(props.getProperty("Natan_last_Name")));
        employeeId.shouldHave(value(props.getProperty("Natan_employee_Id")));
        driverLicenseNumber.should(exist);
        numberSSN.should(exist);
        otherID.should(exist);
        licenseExpiryDate.should(exist);
        numberSIN.should(exist);
        genderMale.should(selected);
        nationality.should(exist);
        nationalValueAmerican.shouldBe(selected);
        maritalStatus.shouldHave(value(props.getProperty("Natan_marital_Status")));
        dataBirth.shouldHave(value(props.getProperty("Natan_date_of_Birth")));
        nickName.should(exist);
        militaryService.should(exist);
        smokerBox.should(disabled);
        buttonSave.should(exist);
    }


}
