package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class BeautyConcernsPage extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_concern")
    MobileElement BeautyConcerns;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id= 'com.fdbr.android.debug:id/fl_skin']" +
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> SkinConcerns;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id= 'com.fdbr.android.debug:id/fl_body']" +
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> BodyConcerns;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id= 'com.fdbr.android.debug:id/fl_hair']" +
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> HairConcerns;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_continue")
    MobileElement SaveBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_save")
    MobileElement Save2Btn;

    public BeautyConcernsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapBeautyConcerns(){
        BeautyConcerns.click();
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
    public void tapSaveBtn(){
        SaveBtn.click();
    }
    public void tapSave2Btn(){
        Save2Btn.click();
    }
}
