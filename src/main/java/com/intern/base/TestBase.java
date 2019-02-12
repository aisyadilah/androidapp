package com.intern.base;

import com.intern.util.TestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties prop;
    private static String cwd = System.getProperty("user.dir");
    public static AppiumDriver driver;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(cwd+"/src/main/java/com/intern/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void initialization() throws IOException, InterruptedException{
        String device = prop.getProperty("deviceName");
        String platform = prop.getProperty("platformName");
        String serverLoc = prop.getProperty("server");
        String portNumber = prop.getProperty("port");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", device);
        caps.setCapability("platformName", platform);
        caps.setCapability("app", cwd+"/src/app/app-debug (2).apk");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }


}
