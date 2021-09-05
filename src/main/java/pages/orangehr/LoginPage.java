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
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    SelenideElement loginField = $(By.id("txtUsername"));
    SelenideElement passwordField = $(By.id("txtPassword"));
    SelenideElement signInButton = $(By.id("btnLogin"));

    public void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        loginField.sendKeys(props.getProperty("user.username"));
        passwordField.sendKeys(props.getProperty("user.password"));
        signInButton.shouldBe(visible).click();
    }

    public void invalidlogin() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        loginField.sendKeys(props.getProperty("negative_user.username"));
        passwordField.sendKeys(props.getProperty("user.password"));
        signInButton.shouldBe(visible).click();
    }

    public void invalidPassword() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        loginField.sendKeys(props.getProperty("user.username"));
        passwordField.sendKeys(props.getProperty("negative_user.password"));
        signInButton.shouldBe(visible).click();
//        Selenide.sleep(2000);
    }

    public void invalidAll() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/use.properties"));
        loginField.sendKeys(props.getProperty("negative_user.username"));
        passwordField.sendKeys(props.getProperty("negative_user.password"));
        signInButton.shouldBe(visible).click();
    }
    public void openLoginPage(){
        open("https://opensource-demo.orangehrmlive.com/");
    }


}
