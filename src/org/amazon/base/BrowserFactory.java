/**
 * 
 */
package org.amazon.base;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author raman.dhiman
 *
 */
public class BrowserFactory extends Initializer {
	@BeforeClass
	public DesiredCapabilities getDesiredCapabilites() {

		PortNumber = Integer.parseInt(port);
		capabilities = new DesiredCapabilities();
		if (mobileOS.equalsIgnoreCase("Android")) {
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			capabilities.setCapability(CapabilityType.PLATFORM, mobileOS);
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyboard", true);
			capabilities.setCapability("automationName", automationName);
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appWaitPackage", appPackage);
			capabilities.setCapability("appActivity", mainActivity);

		} else {
			Assert.fail("Entered mobile's value is wrong. Mobile value can be 'Android'. Insert correct value.");
		}
		return capabilities;
	}

	public AppiumDriver<?> launchApplication() throws MalformedURLException {
		capabilities = getDesiredCapabilites();
		driver = new AndroidDriver<MobileElement>(new URL(remoteUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
	}
}
