package org.amazon.commonfunctions;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.amazon.base.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DriverActions extends BrowserFactory {

	public void mobileObjectClick(MobileElement mobileElement, String objLogicalName) {
		mobileElement.click();

	}

	public static void click(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
	}

	public static void enterValue(String xpath, String value) {

		driver.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public void aenterValue(By by, String value) {

		MobileElement mobileElement = null;
		try {
			mobileElement = (MobileElement) driver.findElement(by);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		mobileElement.click();
		Actions actions = new Actions(driver);
		actions.sendKeys(value);
		actions.perform();

	}

	public static void clickAndEnterValue(String xpath, String value) {
		MobileElement el2 = (MobileElement) driver.findElementByXPath(xpath);
		System.out.println(value);
		el2.sendKeys(value);
	}

	public static void scrollAndTapByText(String Text) {

		try {
 
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""
							+  Text + "\").instance(0));")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scroll_click() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		
	}
	
	 
	@SuppressWarnings("deprecation")
	public static void scrollHalfScreen() throws InterruptedException {
		Dimension dim = driver.manage().window().getSize();
		int xx = dim.getWidth();
		int x = dim.getWidth() / 2;
		int y = dim.getHeight();
		int starty = (int) (dim.getHeight() * 0.8);
		int endY = (int) (dim.getHeight() * 0.6);

		/*System.out.println("x -> " + xx);
		System.out.println("x/2 -> " + x);
		System.out.println("y :->" + y);
		System.out.println("Height-> " + dim.getHeight());
		System.out.println("StartY -> " + starty);
		System.out.println("End y :->" + endY);*/
	 	 
		// driver.swipe(startx, starty, endx, endy, duration);
		driver.swipe(x, starty, x, endY, 300);

	}
}