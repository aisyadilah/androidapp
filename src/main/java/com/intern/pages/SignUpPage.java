package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {

    public SignUpPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.fdbr.android.debug:id/edt_email")
    MobileElement txtEmail;
    @AndroidFindBy(id="com.fdbr.android.debug:id/edt_username")
    MobileElement txtUsername;
    @AndroidFindBy(id="com.fdbr.android.debug:id/edt_password")
    MobileElement txtPassword;
    @AndroidFindBy(id="com.fdbr.android.debug:id/rel_register")
    MobileElement btnRegister;

    public void inputEmail(String email){
        txtEmail.sendKeys(email);
    }
    public void inputUsername(String username){
        txtUsername.sendKeys(username);
    }
    public void inputPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void tapbtnRegister(){
        btnRegister.click();
    }
}
