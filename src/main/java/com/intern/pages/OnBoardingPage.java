package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_login")
    MobileElement Loginbtn;
    @AndroidFindBy(id="com.fdbr.android.debug:id/rel_signup")
    MobileElement btnSignUp;

    public OnBoardingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickLoginBtn(){
        Loginbtn.click();
    }

    public void tapBtnSignUp(){
        btnSignUp.click();
    }
}
