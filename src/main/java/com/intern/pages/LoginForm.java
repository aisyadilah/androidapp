package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginForm extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtFieldUsername;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtFieldPassword;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signin")
    MobileElement Loginbtn;

    public LoginForm(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void loginProses(String uname, String password){
        txtFieldUsername.sendKeys(uname);
        txtFieldPassword.sendKeys(password);
        Loginbtn.click();
    }
}
