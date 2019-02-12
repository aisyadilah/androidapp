package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ComentPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_comment")
    MobileElement txtFieldComent;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_post")
    MobileElement PostBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement BackBtn;

    public ComentPage(){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void comentproses(String coment){

        txtFieldComent.sendKeys(coment);
    }
    public void tapPostBtn(){
        PostBtn.click();
    }
    public void tapBackBtn(){
        BackBtn.click();
    }
}
