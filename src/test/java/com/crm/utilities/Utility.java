package com.crm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
public static WebDriver driver;
public static Wait wait;
public static JavascriptExecutor js;
public static Actions actions;

public void launchDriver() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	js = (JavascriptExecutor)driver;
	actions = new Actions(driver);
}

//public WebDriver initializedDriver() {
//	return this.driver;
//}

public void launchApplication() {
	System.out.println("-----Launching Application-----");
	driver.get(accessProperties("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

public void setText(WebElement ele, String input) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		ele.clear();
		ele.sendKeys(input);
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void jsSetText(WebElement ele, String input) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		ele.clear();
		js.executeScript("arguments[0].setAttribute('value','"+input+"')", null);
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void actionsSetText(WebElement ele, String input) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		ele.clear();
		actions.sendKeys(ele, input).build().perform();
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void button(WebElement ele) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		ele.click();
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void jsClick(WebElement ele) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		js.executeScript("arguments[0].click();",ele);
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void actionsClick(WebElement ele) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	try {
	if(ele.isDisplayed() && ele.isEnabled()) {
		actions.click(ele).build().perform();
	}
	else {
		System.out.println("Desired Element not found or not displayed");
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
}


public static void storeProperties(String key, String value) {
	File file = new File(".\\src\\test\\resources\\Environment_Variables\\user.properties");
	Properties properties = new Properties();
	FileOutputStream fileOutputStream;
	try {
		fileOutputStream = new FileOutputStream(file);
		properties.setProperty(key, value);
		properties.save(fileOutputStream, "Updated");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static String accessProperties(String key) {
	File file = new File(".\\src\\test\\resources\\Environment_Variables\\env.properties");
	Properties properties = new Properties();
	try {
		FileInputStream fileInputStream = new FileInputStream(file);
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String value =(String) properties.get(key);
	return value;
}

public void verifyCurrentUrl(String pageName) {
	wait.until(ExpectedConditions.urlContains(this.accessProperties(pageName)));
	String currentUrl = driver.getCurrentUrl();
	if(currentUrl.contains(this.accessProperties("dashboardPage"))) {
		System.out.println("User successfully logged into CRM Application and on Dashboard Page");
	}
	else {
		System.err.println("User not logged into CRM Application or Invalid Email and Password");
	}
}
public void close() {
	try{
		if(driver!=null) {
		driver.quit();
		driver=null;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
public String getText(WebElement ele) {
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	if(ele.isDisplayed()) {
	String text = ele.getText();
	return text;
	}
	else {
		return null;
	}
}

}
