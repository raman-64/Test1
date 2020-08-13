package org.amazon.pages;

import java.util.ResourceBundle;

import org.amazon.commonfunctions.DriverActions;
import org.openqa.selenium.By;
public class HomePage extends SearchPage {
//public class HomePage extends BasepageObjects {
	ResourceBundle input_repo = ResourceBundle.getBundle("org.amazon.object_repo.object_repository_xpath_homepage");
	
	
	public void signIn(){
	 
		clickSignin_drawer();
		
	}
	
	void clickSignInButton(){
		String signinbutton=repo_xpath.getString("sign_in_button_xpath");
		driver.findElement(By.xpath(signinbutton)).click();
		
	}
	
	public void search(String searchText) {
		String searchfieldxpath=repo_xpath.getString("searchfieldxpath");
		click(searchfieldxpath);
		enterValue(searchfieldxpath, searchText);
		String selectsearchtext=repo_xpath.getString("selectsearchtext");
		click(selectsearchtext);
		
 	}
	
	
}
