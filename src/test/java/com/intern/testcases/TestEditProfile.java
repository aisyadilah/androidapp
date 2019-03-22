package com.intern.testcases;

import com.github.javafaker.Faker;
import com.intern.base.TestBase;
import com.intern.pages.*;
import com.intern.util.NavigationBar;
import com.intern.util.ScrollDown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestEditProfile extends TestBase {
    private CarouselPage carouselPage;
    private OnBoardingPage onBoardingPage;
    private LoginForm loginForm;
    private HomePage homePage;
    private NavigationBar navigationBar;
    private EditProfilePage editProfilePage;
    private Faker faker;
    private ScrollDown scrollDown;
    private BeautyProfilePage beautyProfilePage;
    private BeautyConcernsPage beautyConcernsPage;

    public TestEditProfile(){
        super();
    }

    @BeforeMethod
    public void SetUp() throws IOException, InterruptedException {
        initialization();
        carouselPage = new CarouselPage();
        onBoardingPage = new OnBoardingPage();
        loginForm = new LoginForm();
        homePage = new HomePage();
        navigationBar = new NavigationBar();
        editProfilePage = new EditProfilePage();
        faker = new Faker();
        scrollDown = new ScrollDown();
        beautyProfilePage = new BeautyProfilePage();
        beautyConcernsPage = new BeautyConcernsPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void tcEditProfile(){
        carouselPage.tapNextBtn();
        carouselPage.tapNextBtn();
        carouselPage.tapGetbtn();
        onBoardingPage.clickLoginBtn();
        loginForm.loginProses(prop.getProperty("username"), prop.getProperty("password"));
        homePage.tapXBtn();
        navigationBar.tapProfileBtn();
        editProfilePage.tapSettingbtn();
        editProfilePage.tapEditProfile();
        editProfilePage.tapPhotoBtn();
        editProfilePage.tapAllowbtn();
        editProfilePage.tapCaptureBtn();
        editProfilePage.tapAllowbtn();
        editProfilePage.tapCeklisBtn();
        editProfilePage.tapEditdob();
        editProfilePage.tapEditMonth();
        editProfilePage.tapEditDate();
        editProfilePage.tapEditYear();
        editProfilePage.tapOKBtn();
        editProfilePage.clearExistingText();
        editProfilePage.setTxtFullName(faker.name().fullName());
        editProfilePage.setLocationBtn();
        editProfilePage.tapSelectLocation();
        editProfilePage.tapEditPhoneNumber(faker.number().digits(11));
        editProfilePage.clearExistingBio();
        editProfilePage.tapeditBio(faker.address().country());
        scrollDown.ScrollDown();
        beautyProfilePage.tapBeautyProfile();
        beautyProfilePage.tapSkinBtn();
        beautyProfilePage.tapToneBtn();
        beautyProfilePage.tapUndertoneBtn();
        beautyProfilePage.tapHairBtn();
        scrollDown.ScrollDown();
        beautyProfilePage.tapColorBtn();
        beautyProfilePage.tapHJBtn();
        beautyProfilePage.tapSaveBtn();
        beautyConcernsPage.tapBeautyConcerns();
        beautyConcernsPage.tapSkinConcerns();
        scrollDown.ScrollDown();
        beautyConcernsPage.tapBodyConcerns();
        beautyConcernsPage.tapHairConcerns();
        beautyConcernsPage.tapSaveBtn();
        beautyConcernsPage.tapSave2Btn();
        editProfilePage.tapBackBtn();
    }
}
