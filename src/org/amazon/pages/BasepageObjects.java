/**
 * 
 */
package org.amazon.pages;

import org.amazon.commonfunctions.DriverActions;

/**
 * @author raman.dhiman
 *
 */
public class BasepageObjects extends DriverActions {
	public static void clickDrawer() {
		String drawer_xpath = repo_xpath.getString("drawer_xpath");
		click(drawer_xpath);
	}

	public static void clickSignin_drawer() {
		String signin_xpath = repo_xpath.getString("signin_xpath");
		click(signin_xpath);
	}
	
	

}
