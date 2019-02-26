package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_close")
    MobileElement XBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_notification_button")
    MobileElement btnNotif;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/container_tab")
    MobileElement HomeBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/item_brand")
    MobileElement BrandBtn;

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapXBtn()
    {
        XBtn.click();
    }
    public void tapNotifBtn(){
        btnNotif.click();
    }
    public void tapHomeBtn(){
        HomeBtn.click();
    }
    public void tapBrandBtn(){
        BrandBtn.click();
    }
}
