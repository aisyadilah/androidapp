package com.intern.pages;

import com.intern.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class AddProduct extends TestBase {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_add_product")
    MobileElement AddProductBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement PhotoBtn;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement AllowBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    MobileElement CaptureBtn;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='3']")
    MobileElement CeklisBtn;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_brand")
    MobileElement BrandName;
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/tv_title')]")
    List<MobileElement> SelectBrand;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_product_cat")
    MobileElement ProductCategory;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Make Up']")
    MobileElement MakeUp;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Face']")
    MobileElement Face;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Foundation']")
    MobileElement Foundation;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Creme']")
    MobileElement Creme;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_name")
    MobileElement ProductName;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_shade")
    MobileElement txtShade;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_desc")
    MobileElement txtDesc;
    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_price")
    MobileElement Price;

    public AddProduct(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapAddProductBtn(){
        AddProductBtn.click();
    }
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
    public void tapBrandName(){
        BrandName.click();
    }
    public void tapProductCategory(){
        ProductCategory.click();
    }
    public void tapSelectBrand(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(SelectBrand.size());
        SelectBrand.get(rndInt).click();
    }
    public void tapMakeUp(){
        MakeUp.click();
    }
    public void tapFace(){
        Face.click();
    }
    public void tapFoundation(){
        Foundation.click();
    }
    public void tapCreme(){
        Creme.click();
    }
    public void setTxtProductName(String name){
        ProductName.sendKeys(name);
    }
    public void setTxtShade(String shade){
        txtShade.sendKeys(shade);
    }
    public void setTxtDesc(String desc){
        txtDesc.sendKeys(desc);
    }
    public void setPrice(String number){
        Price.sendKeys(number);
    }
}
