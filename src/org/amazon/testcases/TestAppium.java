package org.amazon.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestAppium {
	public static DesiredCapabilities Capabilities;
	public static AndroidDriver<WebElement> driver;

	@Test
	public void test() throws MalformedURLException {
		Capabilities = new DesiredCapabilities();
		Capabilities.setCapability("deviceName", "RZ8M411PQYA");
		Capabilities.setCapability("platformVersion", "9");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("noReset", "True");
		Capabilities.setCapability("fullReset", "False");
		Capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		Capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

}
