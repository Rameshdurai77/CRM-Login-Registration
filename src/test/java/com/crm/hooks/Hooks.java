package com.crm.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.utilities.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{
	Utility util = new Utility();

	@Before
	public void launchApplication(Scenario scenario) {
		
		util.launchDriver();
		 byte[] image = ((TakesScreenshot)Utility.driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(image, "image/png", "Launching Browser");
	}
	
	@After
	public void closeApplication(Scenario scenario) {
		 byte[] image = ((TakesScreenshot)Utility.driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(image, "image/png", "Closing Browser");
		util.close();
	}
}
