package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage extends TestBase {
    @AndroidFindBy(id ="com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement BackBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_more_reviews")
    MobileElement RLBrn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_2")
    MobileElement OKBtn;

    public ReviewPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void tapBackBtn(){
        BackBtn.click();
    }
    public void tapRLBtn(){
        RLBrn.click();
    }
    public void tapOKBtn(){
        OKBtn.click();
    }
}
