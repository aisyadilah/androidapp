package com.intern.util;

import com.intern.base.TestBase;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class ScrollUp extends TestBase {
    public void ScrollUp(){
        Dimension dimension = driver.manage().window().getSize();
        Double screenHighStart = dimension.getHeight() * 0.5;
        Double screenHighEnd = dimension.getHeight() * 0.8;
        int scrollStart = screenHighStart.intValue();
        int scrollEnd = screenHighEnd.intValue();

        new AndroidTouchAction(driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction()
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }
}
