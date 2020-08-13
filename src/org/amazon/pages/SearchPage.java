/**
 * 
 */
package org.amazon.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * @author raman.dhiman
 *
 */
public class SearchPage  extends BasepageObjects {
	public static void randomSelect() {
		String searchlistxpath=repo_xpath.getString("searchlistxpath");
		@SuppressWarnings("unchecked")
		List<MobileElement> elements = (List<MobileElement>) driver.findElements(By.xpath(searchlistxpath));
		Random rnd = new Random();
		int rndInt = rnd.nextInt(elements.size());
		elements.get(rndInt).click();
		
	}

}
