package com.zerroBank.StepDef;

import com.zerroBank.Pages.LoginPageSelim;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SelimNegativeLogInTestStepDef {
    LoginPageSelim myLoginPage = new LoginPageSelim();

    @When("I have my username and wrong password entered")
    public void i_have_my_username_and_wrong_password_entered() {
        myLoginPage.signinButton.click();
        myLoginPage.userName.sendKeys("Selim");
        myLoginPage.password.sendKeys("1455ASdf");
        myLoginPage.signIn.click();
    }

    @Then("I can get failed-error message")
    public void i_can_get_failed_error_message() {
        String errorMessage = myLoginPage.errorMessage.getText();
        System.out.println("errorMessage = " + errorMessage);
        Assert.assertEquals("Login and/or password are wrong.", errorMessage);
        System.out.println("THIS TEST IS PASSED- IT WAS INTENDED TO FAIL");
    }
}
