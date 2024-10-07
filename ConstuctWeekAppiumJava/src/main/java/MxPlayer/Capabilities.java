package MxPlayer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	@SuppressWarnings("deprecation")
	public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
		
		// Desired Capabilities are assigned here 
		
		// Desired Capabilities object is assigned here
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		// Device name is assigned here
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
		
		// Platform name is assigned here
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		// App-Package is assigned here
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mxtech.videoplayer.ad");
		
		// App-Activity is assigned here
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mxtech.videoplayer.ad.ActivityWelcomeMX");

		// Server URL is assigned here
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		// Returing the driver with these capabilities 
		
		return driver;
		
	}
	
}
