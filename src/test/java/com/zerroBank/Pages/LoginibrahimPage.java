package com.zerroBank.Pages;

import com.zerroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginibrahimPage {
    public LoginibrahimPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="signin_button")
    public WebElement signinButton;
    @FindBy(id="user_login")
    public WebElement userName;
    @FindBy(id="user_password")
    public WebElement password;
    @FindBy(name="submit")
    public WebElement signIn;
    @FindBy(xpath = "//div[class='alert alert-error']")
    public WebElement errorMessage;

    public void Loginibrahim(String username1, String password1){
        userName.sendKeys(username1);
        password.sendKeys(password1);
        signIn.click();
    }
}
