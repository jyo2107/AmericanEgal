package Iblesoft.AmericanEgal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logincls {
	WebDriver driver;
	public void Login(WebDriver driver) throws InterruptedException {
	//	this.driver = driver;
		driver.get("https://iblesoft.smarteweb.com/");
		driver.findElement(By.name("unameTxt")).clear();
		driver.findElement(By.name("unameTxt")).sendKeys("IBLEC1101");
		driver.findElement(By.name("passwordTxt")).clear();
		driver.findElement(By.name("passwordTxt")).sendKeys("Iblesoft@123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
	//	driver.findElement(By.xpath("//*[@id=\"notificationModal\"]/div/div/div[3]/button")).click();
		
		try {
	        assertEquals(driver.findElement(By.className("alert-message")).getText(), "You have successfully logged in");

	        System.out.println("PASS");
	        driver.findElement(By.className("alert-message")).getText();  

	    } catch (Exception e) {

	        assertEquals(driver.findElement(By.className("alert alert-danger alert-dismissible")).getText(), "Your username OR password is incorrect or inactive");
	        System.out.println("FAIL");
}
}
}