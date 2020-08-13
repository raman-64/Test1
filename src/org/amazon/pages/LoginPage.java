/**
 * 
 */
package org.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author raman.dhiman
 *
 */
public class LoginPage extends BasepageObjects{
	
	public static void enterNumberEmail(String text) {
		String enterNumberEmail_xpath=repo_xpath.getString("enterNumberEmail_xpath");
		enterValue(enterNumberEmail_xpath, text);
		String continuexpath=repo_xpath.getString("continue_xpath");
		 click(continuexpath);
	}
	
	public static void enterPassword(String text) {
		
		String passwordxpath=repo_xpath.getString("password_xpath");
		clickAndEnterValue(passwordxpath,text);
 	}
	

}
