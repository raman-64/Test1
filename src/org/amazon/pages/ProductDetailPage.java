/**
 * 
 */
package org.amazon.pages;

/**
 * @author raman.dhiman
 *
 */
public class ProductDetailPage extends BasepageObjects {

	public static void buyNowButton() throws InterruptedException {
		scrollHalfScreen();
		scrollHalfScreen();
		String buynowbuttonxpath = login_repo.getString("buynowXpath");
		click(buynowbuttonxpath);

	}

}
