package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class EditProfilePage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_settings")
    MobileElement SettingBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_editprofile")
    MobileElement EditProfile;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement PhotoBtn;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement AllowBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    MobileElement CaptureBtn;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='3']")
    MobileElement CeklisBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_dob")
    MobileElement Editdob;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Jun']")
    AndroidElement EditMonth;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='10']")
    AndroidElement EditDate;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2001']")
    AndroidElement EditYear;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    AndroidElement OKBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement txtFullName;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/txt_city_name')]")
    List<MobileElement> SelectLocation;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_phone_number")
    MobileElement EditPhoneNumber;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_bio")
    MobileElement EditBio;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_location")
    MobileElement LocationBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button")
    MobileElement BackBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    public WebElement textBox;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_bio")
    public WebElement textBio;

    public EditProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapSettingbtn(){
        SettingBtn.click();
    }
    public void tapEditProfile(){
        EditProfile.click();
    }
    public void tapPhotoBtn(){
        PhotoBtn.click();
    }
    public void tapAllowbtn(){
        AllowBtn.click();
    }
    public void tapCaptureBtn(){
        CaptureBtn.click();
    }
    public void tapCeklisBtn(){
        CeklisBtn.click();
    }
    public void tapEditdob(){
        Editdob.click();
    }
    public void tapEditMonth(){
        EditMonth.click();
    }
    public void tapEditDate(){
        EditDate.click();
    }
    public void tapEditYear(){
        EditYear.click();
    }
    public void tapOKBtn(){
        OKBtn.click();
    }
    public void setTxtFullName(String name){
        txtFullName.sendKeys(name);
    }
    public void tapSelectLocation(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SelectLocation.size());
        SelectLocation.get(rndInt).click();
    }
    public void tapEditPhoneNumber(String number){
        EditPhoneNumber.sendKeys(number);
    }
    public void tapeditBio(String bio){
        EditBio.sendKeys(bio);
    }
    public void setLocationBtn(){
        LocationBtn.click();
    }
    public void tapBackBtn(){
        BackBtn.click();
    }
    public void clearExistingText(){
        textBox.clear();
    }
    public void clearExistingBio(){
        textBio.clear();
    }
}
