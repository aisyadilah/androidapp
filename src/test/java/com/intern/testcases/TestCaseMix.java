package com.intern.testcases;

import com.intern.base.TestBase;
import com.intern.pages.*;
import com.intern.util.NavigationBar;
import com.intern.util.ScrollDown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCaseMix extends TestBase {
    private CarouselPage carouselPage;
    private OnBoardingPage onboardingpage;
    private LoginForm loginForm;
    private HomePage homepage;
    private NotifPage notifPage;
    private ComentPage comentPage;
    private BrandPage brandPage;
    private ReviewPage reviewPage;
    private NavigationBar navigationBar;
    private ScrollDown scrollDown;

    public TestCaseMix(){
        super();
    }

    @BeforeMethod
    public void setup() throws IOException, InterruptedException{
        initialization();
        carouselPage = new CarouselPage();
        onboardingpage = new OnBoardingPage();
        loginForm = new LoginForm();
        homepage = new HomePage();
        notifPage = new NotifPage();
        comentPage = new ComentPage();
        brandPage = new BrandPage();
        reviewPage = new ReviewPage();
        navigationBar = new NavigationBar();
        scrollDown = new ScrollDown();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testMix(){
        carouselPage.tapNextBtn();
        carouselPage.tapNextBtn();
        carouselPage.tapGetbtn();
        onboardingpage.clickLoginBtn();
        loginForm.loginProses("putwid", "tester123");
        homepage.tapXBtn();
        homepage.tapNotifBtn();
        notifPage.tapPostImg();
        notifPage.tapComentBtn();
        comentPage.comentproses("Test");
        comentPage.tapPostBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        navigationBar.tapFeedBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        navigationBar.tapProfileBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        navigationBar.tapHomeBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapBrandBtn();
        brandPage.tapPLBtn();
        brandPage.tapPDBtn();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        brandPage.tapPDBtn();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapBrandBtn();
        brandPage.tapPLBtn();
        brandPage.tapPDBtn();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        brandPage.tapPDBtn();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapUserBtn();
        notifPage.tapImgPost();
        notifPage.tapComentBtn();
        comentPage.comentproses("Test");
        comentPage.tapPostBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        navigationBar.tapProfileBtn();
        homepage.tapHomeBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        navigationBar.tapProfileBtn();
        homepage.tapHomeBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
    }
}
