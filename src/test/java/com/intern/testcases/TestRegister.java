package com.intern.testcases;

import com.github.javafaker.Faker;
import com.intern.base.TestBase;
import com.intern.pages.*;
import com.intern.util.ScrollDown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRegister extends TestBase {

    private CarouselPage carouselpage;
    private OnBoardingPage onboardingpage;
    private SignUpPage signuppage;
    private Faker faker;
    private FormUser formUser;
    private ScrollDown scrollDown;
    private ProfilePage profilePage;

    public TestRegister(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        onboardingpage = new OnBoardingPage();
        carouselpage = new CarouselPage();
        signuppage = new SignUpPage();
        faker = new Faker();
        formUser = new FormUser();
        scrollDown = new ScrollDown();
        profilePage = new ProfilePage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void tcRegister(){
        carouselpage.tapNextBtn();
        carouselpage.tapNextBtn();
        carouselpage.tapGetbtn();
        onboardingpage.tapBtnSignUp();
        signuppage.inputEmail(faker.internet().safeEmailAddress());
        signuppage.inputUsername(faker.internet().slug());
        signuppage.inputPassword(faker.internet().password());
        signuppage.tapbtnRegister();
        formUser.inputDmy();
        formUser.tapMonthBtn();
        formUser.tapDateBtn();
        formUser.tapYearBtn();
        formUser.tapOKBtn();
        formUser.tapNextBtn();
        formUser.tapSkinBtn();
        formUser.tapToneBtn();
        formUser.tapUndertoneBtn();
        formUser.tapNextBtn();
        formUser.tapHairBtn();
        formUser.tapColorBtn();
        formUser.tapHJBtn();
        formUser.tapNextBtn();
        formUser.tapSkinConcerns();
        scrollDown.ScrollDown();
        formUser.tapNextBtn();
        formUser.tapBodyConcerns();
        scrollDown.ScrollDown();
        formUser.tapNextBtn();
        formUser.tapHairConcerns();
        formUser.tapNextBtn();
        profilePage.tapPhotoBtn();
        profilePage.tapAllowBtn();
        profilePage.tapCaptureBtn();
        profilePage.tapAllowBtn();
        profilePage.tapCeklisBtn();
        profilePage.inputFullname(faker.name().fullName());
        profilePage.inputListLocation();
        profilePage.tapSelectLocation();
        profilePage.inputPhoneNumber(faker.phoneNumber().phoneNumber());
        formUser.tapNextBtn();
        profilePage.tapSkip();
        profilePage.tapBeautyJourney();

    }

}
