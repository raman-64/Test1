/**
 * 
 */
package org.amazon.base;

import java.util.ResourceBundle;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import java.awt.Robot;
import java.io.File;
import java.net.URI;
import java.util.Properties;

import org.amazon.pages.HomePage;
import org.amazon.pages.ProductDetailPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
 /**
 * @author raman.dhiman
 *
 */
public class Initializer {
	public static ResourceBundle resourcebundle = ResourceBundle
			.getBundle("org.amazon.object_repo.CONFIG.MobileConfig");
	public static ResourceBundle repo_xpath = ResourceBundle
			.getBundle("org.amazon.object_repo.object_repository_xpath_homepage");
	public static ResourceBundle login_repo = ResourceBundle
			.getBundle("org.amazon.object_repo.object_repository_inputdata_login");
	public static String deviceName;
	public static String udid;

	public static String platformVersion;
	//public static String androidSearchTimeout;
	public static String remoteUrl;
	public static String mainActivity;
	public static String appPackage;
	public static String port;
	public static String mobileOS;
	//public static String deviceType;
	public static String automationName;
	public static String virtualDeviceName;
	public static String virtualDeviceVersion;
	public static String implicitWait;
	//public static String filePath;

	@BeforeClass
	public static void setdata() {
		resourcebundle = ResourceBundle.getBundle("org.amazon.object_repo.CONFIG.MobileConfig");
		deviceName = resourcebundle.getString("ANDROID_DEVICE_NAME");
		udid = resourcebundle.getString("udid");
		platformVersion = resourcebundle.getString("ANDROID_PLATFORM_VERSION");
		remoteUrl = resourcebundle.getString("MOBILE_REMOTE_URL");
		mainActivity = resourcebundle.getString("ANDROID_MAIN_ACTIVITY");
		appPackage = resourcebundle.getString("ANDROID_APP_PACKAGE");
		port = resourcebundle.getString("PORT");
		mobileOS = resourcebundle.getString("MOBILE_OS_2");
		implicitWait = resourcebundle.getString("ImplicitWait");
		automationName=resourcebundle.getString("ANDROID_AUTOMATION_NAME");
	}

	public static String FS = File.separator;
	public static String OSName = System.getProperty("os.name");
	public static String OSArchitecture = System.getProperty("os.arch");
	public static String OSVersion = System.getProperty("os.version");
	public static String OSBit = System.getProperty("sun.arch.data.model");
	public static String ProjectWorkingDirectory = System.getProperty("user.dir");
	public static String TestData = "./src/test/resources/ConfigData-TestData/";
	public static String Reports = "./src/test/resources/Reports/";
	public static String reportImages = ProjectWorkingDirectory + "\\src\\test\\resources\\Reports\\Images\\";
	public static final String FILE_NAME = "Extent_Report.html";

	// classes refrences used in core framework

	public static Alert al;
	public static Select se;
	public static SoftAssert softAssert;
	public static ITestResult result;
	public static URI uri;
	public static ExtentReports extent;
	public static AppiumDriver<?> driver;
	public static DesiredCapabilities capabilities;
	public static int PortNumber;
	// Page Objects
	public static HomePage homePage = new HomePage();
	public static ProductDetailPage detailPage=new ProductDetailPage();
	
	/*public static DealsPage dealsPage = new DealsPage();
	public static CategoriesPage categoriesPage = new CategoriesPage();*/

}
