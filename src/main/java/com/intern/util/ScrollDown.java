package com.intern.util;

import com.intern.base.TestBase;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class ScrollDown extends TestBase {
    public void ScrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        Double screenHighStart = dimension.getHeight() * 0.5;
        Double screenHighEnd = dimension.getHeight() * 0.2;
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
