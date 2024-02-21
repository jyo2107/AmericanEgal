package Iblesoft.AmericanEgal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.model.NavigatedWithinDocument;
import org.openqa.selenium.support.ui.Select;

public class Prealertcls {
	public void Testpre(WebDriver driver) throws InterruptedException {
	    driver.findElement( By.xpath ("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a")).click();
	    driver.findElement(By.id("mnameTxt")).sendKeys("TATA");
	    driver.findElement(By.id("carrierTxt")).sendKeys("DTDC");
	    driver.findElement(By.id("carriertrackingTxt")).sendKeys("98745685");
 		driver.findElement(By.xpath("//*[@id=\"orderdateTxt\"]")).click();
 		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click();
 		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click();
 		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")).click();
//	    driver.findElement( By.xpath("//*[@id=\"orderdateTxt\"]")).click();
//	    driver.findElement( By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
	    driver.findElement(By.id("country3Txt")).click();
	    Select drpcountry = new Select (driver.findElement(By.id("country3Txt")));
	    drpcountry.selectByVisibleText("UNITED STATES");
	    driver.findElement(By.id("1")).sendKeys("Iphone");
	    driver.findElement(By.id("2")).sendKeys("3");
	    driver.findElement(By.id("3")).sendKeys("234");
	    driver.findElement(By.id("rmavalue_1")).sendKeys("12352");
	    driver.findElement(By.id("orderidTxt_1")).sendKeys("123652");
	    WebElement FileUpload = driver.findElement(By.xpath("//*[@id=\"addinvoiceTxtMul_1\"]"));
	    FileUpload.sendKeys("C:\\Users\\Jyotheeswar\\Pictures\\Saved Pictures\\bb.png");
	    System.out.println("File is Uploaded Successfully");
	    driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[7]/div/div/input[2]")).click();
		driver.findElement(By.id("lengthTxt_1")).sendKeys("5");
		driver.findElement(By.id("widthTxt_1")).sendKeys("5");
		driver.findElement(By.id("heightTxt_1")).sendKeys("3");
	    driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[7]/div/div/input[2]")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//*[@id=\"theme_nav\"]/div/ul/li[1]/a")).click();
	    
	  //*[@id="userprofileFormOne"]/div[7]/div/div/input[2]
	    
	  //*[@id="userprofileFormOne"]/div[7]/div/div/input[2]
	    Thread.sleep(1000);
		try {
	        assertEquals(driver.findElement(By.className("alert-message")).getText(), "Pre alerts added successfully");

	        System.out.println("PASS");
	        driver.findElement(By.className("alert-message")).getText();  

	    } catch (Exception e) {

	        equals(driver.findElement(By.className("alert-message")).getText());
	        System.out.println("FAIL");
}
		
}
}
