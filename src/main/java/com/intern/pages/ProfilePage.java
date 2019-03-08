package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ProfilePage extends TestBase {
    public ProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
    AndroidElement PhotoBtn;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement AllowBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    MobileElement CaptureBtn;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='3']")
    MobileElement CeklisBtn;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Full Name*']")
    MobileElement txtFullname1;
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    AndroidElement ListLocation;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/txt_city_name')]")
    List<MobileElement> SelectLocation;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Phone Number']")
    AndroidElement txtPhoneNumber;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='2']")
    MobileElement Skip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='START MY BEAUTY JOURNEY']")
    MobileElement BeautyJourney;

    public void tapPhotoBtn(){
        PhotoBtn.click();
    }
    public void tapAllowBtn(){
        AllowBtn.click();
    }
    public void tapCaptureBtn(){
        CaptureBtn.click();
    }
    public void tapCeklisBtn(){
        CeklisBtn.click();
    }
    public void inputFullname(String name){
        txtFullname1.sendKeys(name);
    }
    public void inputPhoneNumber(String number){
        txtPhoneNumber.sendKeys(number);
    }
    public void inputListLocation(){
        ListLocation.click();
    }
    public void tapSelectLocation(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SelectLocation.size());
        SelectLocation.get(rndInt).click();
    }
    public void tapSkip(){
        Skip.click();
    }
    public void tapBeautyJourney(){
        BeautyJourney.click();
    }
}
