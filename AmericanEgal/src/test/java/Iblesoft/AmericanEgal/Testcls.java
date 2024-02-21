package Iblesoft.AmericanEgal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcls extends Basecls {
	
	
	 @Test(testName = "Login")
		public void lnc() throws InterruptedException { 
			 Logincls lc = new Logincls();
			 lc.Login(driver);
		 }
		 @Test(testName = "prealert")
		 public void pretest() throws InterruptedException {
			 Prealertcls pt = new Prealertcls();
			 pt.Testpre(driver);
			
		 }
		 
		 @Test(testName = "pickuporder")
		 public void pickup() throws InterruptedException {
			 Pickupo po = new Pickupo();
			 po.Testpick(driver);
		 }

}