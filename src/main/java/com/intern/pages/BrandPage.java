package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_container")
    MobileElement PLBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_product")
    MobileElement PDBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/review_1")
    MobileElement RDBtn;

    public BrandPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void tapPLBtn(){
        PLBtn.click();
    }
    public void tapPDBtn(){
        PDBtn.click();
    }
    public void tapRDBtn(){
        RDBtn.click();
    }
}
