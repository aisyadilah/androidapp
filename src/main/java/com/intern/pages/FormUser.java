package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class FormUser extends TestBase {
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='1']")
    AndroidElement txtDmy;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Feb']")
    AndroidElement MonthBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='02']")
    AndroidElement DateBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2006']")
    AndroidElement YearBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    AndroidElement OKBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/tv_next")
    MobileElement NextBtn;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']" +
    "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement>SkinBtn;

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

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/rv_skin_concerns']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> SkinConcerns;

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/rv_body_concerns']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> BodyConcerns;

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/rv_hair_concerns']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> HairConcerns;


    public FormUser(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void inputDmy(){
        txtDmy.click();
    }
    public void tapOKBtn(){
        OKBtn.click();
    }
    public void tapNextBtn(){
        NextBtn.click();
    }
    public void tapMonthBtn(){
        MonthBtn.click();
    }
    public void tapDateBtn(){
        DateBtn.click();
    }
    public void tapYearBtn(){
        YearBtn.click();
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
    public void tapSkinConcerns(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SkinConcerns.size());
        SkinConcerns.get(rndInt).click();
    }
    public void tapBodyConcerns(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(BodyConcerns.size());
        BodyConcerns.get(rndInt).click();
    }
    public void tapHairConcerns(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(HairConcerns.size());
        HairConcerns.get(rndInt).click();
    }
}
