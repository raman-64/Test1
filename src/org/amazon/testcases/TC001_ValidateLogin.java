package org.amazon.testcases;

/**
 * @author raman.dhiman
 *
 */
import java.net.MalformedURLException;

import org.amazon.commonfunctions.DriverActions;
import org.amazon.pages.BasepageObjects;
import org.amazon.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC001_ValidateLogin extends LoginPage {
	@Test
	public void testlogin() throws MalformedURLException {
		launchApplication();
		clickDrawer();
		clickSignin_drawer();
		String loginnumber = login_repo.getString("number");
		String password = login_repo.getString("password");
		enterNumberEmail(loginnumber);
		enterPassword(password);
		String loginbutton = repo_xpath.getString("login_button");
		click(loginbutton);
		
		
		/*	
		
		Assertion to verify that user is successfully logined or not by searching the signin xpath
				
		*/
		clickDrawer();
		String signin_xpath = repo_xpath.getString("signin_xpath");
		if (driver.findElement(By.xpath(signin_xpath)).isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
