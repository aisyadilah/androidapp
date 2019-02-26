package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NotifPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_picture")
    MobileElement PostImg;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_comment")
    MobileElement ComentBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement BackBtn;


    public NotifPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void tapPostImg(){
        PostImg.click();
    }
    public void tapComentBtn(){
        ComentBtn.click();
    }
    public void tapBackBtn(){
        BackBtn.click();
    }
}
