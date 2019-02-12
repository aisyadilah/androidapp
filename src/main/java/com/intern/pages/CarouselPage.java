package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CarouselPage extends TestBase {

    @AndroidFindBy (id = "com.fdbr.android.debug:id/rel_next")
    MobileElement btnNext;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_start")
    MobileElement Getbtn;

    public CarouselPage() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapNextBtn() {

        btnNext.click();
    }
    public void tapGetbtn(){
        Getbtn.click();
    }
}
