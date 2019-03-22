package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class BeautyProfilePage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_id")
    MobileElement BeautyProfile;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> SkinBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded_titled')]")
    List<MobileElement>ToneBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_undertones']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> UndertoneBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id= 'com.fdbr.android.debug:id/ll_hair_types']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> HairBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id= 'com.fdbr.android.debug:id/ll_hair_colors']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> ColorBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id= 'com.fdbr.android.debug:id/ll_hijabs']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> HJBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_save")
    MobileElement SaveBtn;

    public BeautyProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapBeautyProfile(){
        BeautyProfile.click();
    }
    public void tapSkinBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SkinBtn.size());
        SkinBtn.get(rndInt).click();
    }
    public void tapToneBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ToneBtn.size());
        ToneBtn.get(rndInt).click();
    }
    public void tapUndertoneBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(UndertoneBtn.size());
        UndertoneBtn.get(rndInt).click();
    }
    public void tapHairBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(HairBtn.size());
        HairBtn.get(rndInt).click();
    }
    public void tapColorBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ColorBtn.size());
        ColorBtn.get(rndInt).click();
    }
    public void tapHJBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(HJBtn.size());
        HJBtn.get(rndInt).click();
    }
    public void tapSaveBtn(){
        SaveBtn.click();
    }
}
