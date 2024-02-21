package Iblesoft.AmericanEgal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basecls {
	
 public static	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iblesoft.smarteweb.com/");
		System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
		String expectedTitle = "IBLESOFT";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);
	}

	
	@AfterClass
	public void Teardown() {
		driver.quit();
	}
    
	public void captureScreenshot(String fileName) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+ fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
}

