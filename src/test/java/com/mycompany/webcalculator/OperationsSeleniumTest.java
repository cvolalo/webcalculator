/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webcalculator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.validation.constraints.AssertTrue;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class OperationsSeleniumTest {
	private static WebDriver augmentedDriver;
	static ScreenShot screenshot = new ScreenShot();
	//private String screenShotPath = "target/screenshots"
	String imageLocation = "C:/Users/christine.m.v.olalo/DocumentsCIOTest/WebCalculator";
	
	//String imageLocation = "/var/jenkins_home/jobs/cio-admin/jobs/Project_Management/jobs/Test_Selenium/workspace/target/screenshots/";
	
	/*public void takeScreenShot(String caseName) {
		String datePrefix = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
		String path = imageLocation + caseName.replace(" ", "_") + ".jpeg";
		String ssPath = imageLocation;
		try {
			File ssDir = new File(ssPath);
			if (!ssDir.exists())
				ssDir.mkdir();
			File dir = new File(path);
			if (!dir.exists()) {
				System.out.println("The location " + path + " does not exist.");
				dir.mkdir();
				System.out.println("A directory " + path + " is created.");
			}

			File screenshot;

			screenshot = ((org.openqa.selenium.TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);

			File screenshotFile = new File(MessageFormat.format("{0}/{1}-{2}",path, datePrefix, caseName.replace(" ", "_") + ".png"));

			
			FileOutputStream outputStream = new FileOutputStream(screenshotFile);
			try {
				//outputStream.write(screenshot);
				System.out.println("Screen shot "+ screenshotFile.toString().substring(path.length() + 1) + " saved in "+ path);
			} finally {
				outputStream.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	/*public void takeScreenShot(String caseName) {
        String datePrefix = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
        String path = workspace_path + screenShotPath + caseName.replace(" ", "_") + "";
        String ssPath = workspace_path + screenShotPath;
        try {
                        File ssDir = new File(ssPath);
                        if (!ssDir.exists())
                                        ssDir.mkdir();
                        File dir = new File(path);
                        if (!dir.exists()) {
                                        System.out.println("The location " + path + " does not exist.");
                                        dir.mkdir();
                                        System.out.println("A directory " + path + " is created.");
                        }

                        byte[] screenshot;

                        screenshot = ((org.openqa.selenium.TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES);

                        File screenshotFile = new File(MessageFormat.format("{0}/{1}-{2}",path, datePrefix, caseName.replace(" ", "_") + ".png"));

                        FileOutputStream outputStream = new FileOutputStream(screenshotFile);
                        try {
                                        outputStream.write(screenshot);
                                        System.out.println("Screen shot "+ screenshotFile.toString().substring(path.length() + 1) + " saved in "+ path);
                        } finally {
                                        outputStream.close();
                        }

        } catch (Exception e) {
                        e.printStackTrace();
        }
}*/


	public static class ScreenShot {
		
		public String Capture(WebDriver driver, String imageLocation) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			File scrFile = ((org.openqa.selenium.TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy
			// somewhere
			imageLocation = imageLocation + scrFile.getName();// goes to the
			// path and
			// automatically
			// gives name
			try {
				// copies the screenshot file to the given path.
				FileUtils.copyFile(scrFile, new File(imageLocation));
				System.out.print("Pumasok na");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			return scrFile.getName().toString();
		}
	}
	
	public void login(WebDriver driver, String siteURL, String username, String password) {
		
    	
		driver.get(siteURL);
		System.out.println(siteURL);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userid")));
		System.out.println("Loading URL..");
		
		//extent.log(LogStatus.INFO, "Images", "Image:", imageMap + imageName);
		// takeScreenShot(caseName);
		
		screenshot.Capture(driver, imageLocation);
		
		driver.findElement(By.name("em")).clear();
		System.out.println("Waiting for User Id...");
		driver.findElement(By.name("em")).sendKeys(username);
		System.out.println("User Id " + username + " entered.");
		screenshot.Capture(driver, imageLocation);
		
		//takeScreenShot("test 2");
		driver.findElement(By.name("pw")).clear();
		System.out.println("Waiting for Password...");
		driver.findElement(By.name("pw")).sendKeys(password);
		System.out.println("Password ******* entered.");
		screenshot.Capture(driver, imageLocation);
		
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.name("Login")).click();
		System.out.println("Logging in...");
		screenshot.Capture(driver, imageLocation);
		
		
		assertTrue(driver.getPageSource().contains("Invalid login. Please try again"));
		
		
		
    }
	
	public void dispose(WebDriver driver) {
		driver.close();
		driver.quit();
	
	}
	
	
    
    @Test
    public void AdditionSeleniumtest() throws Exception {

        //System.setProperty("webdriver.firefox.bin", "C:\\Users\\katrina.h.quililan\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
    	DesiredCapabilities capability = DesiredCapabilities.firefox();
    	//WebDriver driver = new RemoteWebDriver(new URL("http://cioadmin:cio_1234@selenium.52.54.45.25.xip.io///wd/hub"), capability);

    	WebDriver driver = new RemoteWebDriver(new URL("http://cioadmin:initial_1234@selenium.52.70.111.102.xip.io///wd/hub"), capability);
        //WebDriver driver = new FirefoxDriver();
    	
        //driver.get("http://www.google.com");
        
        
        login(driver, "https://www.tests.com/login", "katrinablanca", "sticker");
        
        dispose(driver);
    }
        
        
    		
    		// Screenshot
    		

    		

    	//WebDriver driver = new FirefoxDriver();
    	
        
        /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        String expectedResult = "5.0";

        driver.findElement(By.name("num1")).sendKeys("3");
        Thread.sleep(1000);
        
        driver.findElement(By.name("num2")).sendKeys("2");
        Thread.sleep(1000);
        
        Select operationSelect = new Select(driver.findElement(By.name("op")));
        
        operationSelect.selectByVisibleText("Add");
        Thread.sleep(1000);
        
        driver.findElement(By.name("submit")).submit(); 
        Thread.sleep(1000);
        
        String actualResult;
        actualResult = driver.findElement(By.name("result")).getAttribute("value");
        
        assertEquals(expectedResult,actualResult);
        Thread.sleep(1000);
		
		*/
		
		//driver.findElement
        //Close the browser
        
    
}
