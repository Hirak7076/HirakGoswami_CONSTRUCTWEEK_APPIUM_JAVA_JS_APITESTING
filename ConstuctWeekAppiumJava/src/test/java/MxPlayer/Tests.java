package MxPlayer;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Tests extends Capabilities{
	
	// calling the capabilities by inharitance the capabilities to Tests
	// initializing global driver, reports and test
	
	AndroidDriver<AndroidElement> driver;

	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		// Initializing all report's location and test's name
		
		reports = new ExtentReports("C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\ConstuctWeekAppiumJava\\CWreport.html");
		test = reports.startTest("AppiumTEST");
		
		// calling the capabilities from cap method from capabilities class
		
		driver = cap();
		
		// adding implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void searchTest() {
		
		// Printing Device and App Opened in the console if the app is opened in the emulator
		
		System.out.println("Device and App Opened");
		
		// Logging in reports that the App is Opened
		
		test.log(LogStatus.PASS, "Opened the APP");
		
		// The test of search input field is started
		
		driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		test.log(LogStatus.PASS, "Allowed");
		
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		AndroidElement searchINPUTFIELD = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/search_src_text"));
		searchINPUTFIELD.sendKeys("Movies");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		String result = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/search_no_result_tv")).getText();
		Assert.assertEquals(result, "No results found");
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
		test.log(LogStatus.PASS, "Search test worked");
		
		// The test of search input field is ended and logging that the search tests worked
		
		// The tests of the Menu started by applying each options one by one
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_choice\" and @text=\"Folders\"]")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_choice\" and @text=\"Files\"]")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_choice\" and @text=\"All folders\"]")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Grid\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"List\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_choice\" and @text=\"Date\"]")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Played time\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Status\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Length\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Size\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Resolution\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Path\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Frame rate\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Type\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Title\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/view_fields\").instance(0)")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Thumbnail\")")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Length\"]")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"File extension\")")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Played time\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Resolution\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Frame rate\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Path\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Size\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Date\"]")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Thumbnail\")")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Length\"]")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"File extension\")")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Played time\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Resolution\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Frame rate\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Path\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Size\"]")).click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@resource-id=\"com.mxtech.videoplayer.ad:id/tv_checkbox\" and @text=\"Date\"]")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/view_fields\").instance(0)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		driver.findElement(MobileBy.AccessibilityId("View Menu")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/view_fields\").instance(1)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(0)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(2)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(0)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(1)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(2)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/deactivated_track\").instance(1)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/view_fields\").instance(1)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_done")).click();
		
		test.log(LogStatus.PASS, "All the Menu Options Tested and all worked correctly");
		
		// The test of the View menu options are done and Logged in the reports that All the Menu Options Tested and all worked correctly
		
		// The tests of the privacy feature starts here
		
		driver.findElement(MobileBy.xpath("//*[@text='Privacy']")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/fab_add")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
		test.log(LogStatus.PASS, "Privacy feature Done");
		
		// The tests of the privacy feature ended here and logged that the privacy feature is done
		
		// The tests of the Share feature starts here 
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(2)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/send")).click();
		String sendText = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/toolbar_title")).getText();
		Assert.assertEquals(sendText, "Select Files To Share");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/receive")).click();
		String shareText = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/mxshare_desc")).getText();
		Assert.assertEquals(shareText, "Let's Set it Up");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(2)")).click();
		String text = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/mxshare_desc")).getText();
		Assert.assertEquals(text, "Let's Set it Up");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(3)")).click();
		String History = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad.tr:id/mxshare_title")).getText();
		Assert.assertEquals(History, "History");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		
		test.log(LogStatus.PASS, "Share feature worked");
		
		// The tests of the Share feature ends here and logged that the Share feature worked
		
		// The tests of the Playlist feature starts here
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"androidx.appcompat.widget.LinearLayoutCompat\").instance(3)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(1)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/edit")).sendKeys("Hirak's Playlist");
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_create")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_add_video")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/close_img")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		String PlayName = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_name")).getText();
		Assert.assertEquals(PlayName, "Hirak's Playlist");
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_more")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Delete\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_ok")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/close_img")).click();
		
		test.log(LogStatus.PASS, "Playlist feature done");
		
		// The tests of the Playlist feature starts here and logged that the Playlist feature worked
		
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/btn_cancel")).click();
		
		test.log(LogStatus.PASS, "Local page done");
		
		// The tests of the Local page is done here and logged that the Local page done
		
		// The tests of the Music page starts here
		
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/music_tab")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Playlists\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Albums\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Artists\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Folders\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tracks\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_menu_more")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/add_to_home_screen")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"CANCEL\")")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_change")).click();
		
		test.log(LogStatus.PASS, "Music page done");
		
		// The tests of the Music page is done here and logged that the Music page done
		
		// The tests of the Download page starts here
		
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/download_tab")).click();
		driver.findElement(MobileBy.AccessibilityId("Download")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/home_link_bg\").instance(0)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/rb_whats_app_business")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/tv_cancel")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/home_link_bg\").instance(1)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_close")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_back")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/home_link_item_logo\").instance(2)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/home_link_item_logo\").instance(7)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
		test.log(LogStatus.PASS, "Download page done");
		
		// The tests of the Download page is done here and logged that the Download page done
		
		// The tests of the Me page starts here
		
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/me_tab")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(4)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(5)")).click();
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(6)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(7)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/close_img")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(8)")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_back")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(9)")).click();
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(10)")).click();
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(11)")).click();
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/app_theme")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/app_theme")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/settings")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(5)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(6)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(7)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(8)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(9)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(10)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(11)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(12)")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/custom_pip_control")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/video_select\").instance(1)")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mxtech.videoplayer.ad:id/video_select\").instance(0)")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/legal")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
		test.log(LogStatus.PASS, "Me page Done");
		
		// The tests of the Me page is done here and logged that the Download page done 
		
		driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/local_tab")).click();
		
		// Returned to the home page
		
		test.log(LogStatus.PASS, "App done");
		
		// Logged that the Mx Player Testing is done logged
		
		// Opening Notifications
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.openNotifications();
		
		test.log(LogStatus.PASS, "Notification Done");
		
		// Notifications are opened and logged
		
		driver.findElements(MobileBy.className("android.view.ViewGroup")).get(3).click();
		driver.findElements(MobileBy.className("android.view.ViewGroup")).get(3).click();
		
		// Turned the battery saver on and off and logged
		
		test.log(LogStatus.PASS, "Battery done");
		
		// Switching the app
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
		test.log(LogStatus.PASS, "Switched");
		
		// Switched the apps is done and logged
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		// Navigated home page of the Emulator
		
		test.log(LogStatus.PASS, "Compleated mobile testing using Appium Java");
		
		// Compleated the Testings and automations and logged
		
	}
	
	@AfterTest
	public void flush() {
		
		// Flushing the reports generating the reports file
		
		reports.flush();
		reports.endTest(test);
		
		// Ending of the tests
		
	}
	
}
