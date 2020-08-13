package org.amazon.commonfunctions;

import java.util.NoSuchElementException;

import org.amazon.base.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

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
		MobileElement el2 =  (MobileElement) driver.findElementByXPath(xpath);
		System.out.println(value);
		el2.sendKeys(value);
		 

	}

}