package com.intern.util;

import com.intern.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assertions extends TestBase {

    private WebDriverWait wait;

    public Assertions(){
        super();
    }

    public void waitForNotificationIcon(){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fdbr.android.debug:id/toolbar_notification_button")));
    }

}
