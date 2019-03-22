package com.intern.util;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends TestBase {
    public NavigationBar(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view1']")
    MobileElement HomeBtn;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view2']")
    MobileElement FeedBtn;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view3']")
    MobileElement PlusBtn;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view4']")
    MobileElement DisBtn;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view5']")
    MobileElement ProfileBtn;


    public void tapHomeBtn(){
        HomeBtn.click();
    }
    public void tapFeedBtn(){
        FeedBtn.click();
    }
    public void tapPlusBtn(){
        PlusBtn.click();
    }
    public void tapDisBtn(){
        DisBtn.click();
    }
    public void tapProfileBtn(){
        ProfileBtn.click();
    }
}
