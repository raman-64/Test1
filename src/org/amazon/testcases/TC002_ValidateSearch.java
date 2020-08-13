/**
 * 
 */
package org.amazon.testcases;

import java.net.MalformedURLException;
import org.amazon.pages.HomePage;
import org.amazon.pages.ProductDetailPage;
import org.testng.annotations.Test;

/**
 * @author raman.dhiman
 *
 */
public class TC002_ValidateSearch extends HomePage{
	@Test
	public void ValidateSearch() throws MalformedURLException {
		
		launchApplication();
		String searchText=login_repo.getString("searchText");
		search(searchText);		
		randomSelect();
		ProductDetailPage.buyNowButton();
		 
		
	 
		
	}

}
