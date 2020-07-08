package com.zerroBank.Pages;

import com.zerroBank.Utilities.BrowserUtilities;
import com.zerroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Ahmet {
    public LoginPage_Ahmet(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "user_login")
    public WebElement userName;

    @FindBy(id = "user_password")
    public WebElement passWord;

    @FindBy(name = "submit")
    public WebElement submitSignin;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertError;


    public void Login(String username1, String password1){
        userName.sendKeys(username1);
        passWord.sendKeys(password1);
        BrowserUtilities.wait(2);
        submitSignin.click();
    }


}
