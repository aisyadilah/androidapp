package com.intern.testcases;

import com.intern.base.TestBase;
import com.intern.pages.*;
import com.intern.util.NavigationBar;
import com.intern.util.ScrollDown;
import com.intern.util.ScrollUp;
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
    private ScrollUp scrollUp;

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
        scrollUp = new ScrollUp();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testMix() throws InterruptedException {
        carouselPage.tapNextBtn();
        carouselPage.tapNextBtn();
        carouselPage.tapGetbtn();
        onboardingpage.clickLoginBtn();
        loginForm.loginProses(prop.getProperty("username"), prop.getProperty("password"));
        homepage.tapXBtn();
        homepage.tapNotifBtn();
        Thread.sleep(5000);
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollUp.ScrollUp();
        scrollUp.ScrollUp();
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
        navigationBar.tapProfileBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollUp.ScrollUp();
        scrollUp.ScrollUp();
        navigationBar.tapHomeBtn();
        scrollUp.ScrollUp();
        scrollUp.ScrollUp();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapBrandBtn();
        brandPage.tapPLBtn();
        brandPage.tapPDBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapRLBtn();
        reviewPage.tapOKBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        Thread.sleep(2000);
        scrollUp.ScrollUp();
        scrollUp.ScrollUp();
        brandPage.tapPDBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
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
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
        brandPage.tapRDBtn();
        reviewPage.tapBackBtn();
        reviewPage.tapBackBtn();
        brandPage.tapPDBtn();
        scrollDown.ScrollDown();
        scrollDown.ScrollDown();
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
        notifPage.tapPostImg();
        notifPage.tapComentBtn();
        comentPage.comentproses("Test");
        comentPage.tapPostBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        comentPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        navigationBar.tapProfileBtn();
        navigationBar.tapHomeBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
        navigationBar.tapProfileBtn();
        navigationBar.tapHomeBtn();
        homepage.tapNotifBtn();
        notifPage.tapBackBtn();
    }
}
