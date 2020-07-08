package com.zerroBank.StepDef;

import com.github.javafaker.Faker;
import com.zerroBank.Pages.LoginPage_Ahmet;
import com.zerroBank.Utilities.ConfigurationReader;
import com.zerroBank.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef_Ahmet {


    @Given("user on login page")
    public void user_on_login_page() {
        String url = ConfigurationReader.get("url") + "/login.html";
        Driver.getDriver().get(url);
    }


    @When("user enter the valid credential")
    public void user_enter_the_valid_credential() {
        LoginPage_Ahmet loginPage = new LoginPage_Ahmet();
        loginPage.Login(ConfigurationReader.get("user_username"), ConfigurationReader.get("user_password"));
    }


    @Then("user can land the correct page")
    public void user_can_land_the_correct_page() {

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains("Account Summary"));

    }

    @When("user enter the invalid credential")
    public void userEnterTheInvalidCredential() {
        Faker faker = new Faker();
        String username = faker.name().username();
        String pass = faker.name().username();
        LoginPage_Ahmet loginPage = new LoginPage_Ahmet();
        loginPage.Login(username, pass);


    }

    @Then("user can not login and {string} should displayed")
    public void userCanNotLoginAndShouldDisplayed(String expectedMessage) {
        LoginPage_Ahmet loginPage = new LoginPage_Ahmet();
        String actualMsg = loginPage.alertError.getText();
        Assert.assertEquals(expectedMessage, actualMsg);

    }
}
