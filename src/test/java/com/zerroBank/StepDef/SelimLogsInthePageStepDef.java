package com.zerroBank.StepDef;

import com.zerroBank.Pages.LoginPageSelim;
import com.zerroBank.Utilities.ConfigurationReader;
import com.zerroBank.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SelimLogsInthePageStepDef {
    LoginPageSelim myLoginPage = new LoginPageSelim();

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I have my username and password entered")
    public void i_have_my_username_and_password_entered() {
        myLoginPage.signinButton.click();
        myLoginPage.userName.sendKeys(ConfigurationReader.getProperty("user_username"));
        myLoginPage.password.sendKeys(ConfigurationReader.getProperty("user_password"));

    }

    @Then("I click on the signin button")
    public void i_click_on_the_signin_button() {
        myLoginPage.signIn.click();
    }

    @Then("I can navigate to the next page")
    public void i_can_navigate_to_the_next_page() {
        String titleOfThePage = Driver.getDriver().getTitle();
        System.out.println("titleOfThePage = " + titleOfThePage);
        Assert.assertEquals("Zero - Account Summary", titleOfThePage);
        System.out.println("CONGRATULATIONS TEST PASSED");
    }

}
