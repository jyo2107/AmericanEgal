package Iblesoft.AmericanEgal;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Pickupo {
	public void Testpick(WebDriver driver) throws InterruptedException {
		
	driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/div/div[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();    
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div/a")).click();
	Select drpcountry = new Select(driver.findElement(By.name("txtShipperName")));
	drpcountry.selectByVisibleText("Tom crusi");
	driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[2]/div[1]/div/select")).click();
	Select txtConsigneeName = new Select(driver.findElement(By.name("txtConsigneeName")));
	txtConsigneeName.selectByVisibleText("Tom crusi");
	driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[3]/div[1]/div/select")).click();
	Select txtThirdPartyName = new Select(driver.findElement(By.name("txtThirdPartyName")));
	txtThirdPartyName.selectByVisibleText("Tom crusi");
	driver.findElement(By.xpath("//*[@id=\"txtSourceCntry\"]")).click();
	Select txtSourceCntry = new Select(driver.findElement(By.id("txtSourceCntry")));
	txtSourceCntry.selectByVisibleText("UNITED STATES");
	driver.findElement(By.xpath("//*[@id=\"txtDestinationCntry\"]")).click();
	Select txtDestinationCntry = new Select(driver.findElement(By.id("txtDestinationCntry")));
	txtDestinationCntry.selectByVisibleText("INDIA");
	driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[5]/div[1]/div/select")).click();
	Select dropdown = new Select(driver.findElement(By.name("txtTypeOfShipperName")));
	dropdown.selectByVisibleText("Air");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[5]/div[3]/div/select")).click();
	Select txtWeightUnits = new Select(driver.findElement(By.name("txtWeightUnits")));
	txtWeightUnits.selectByVisibleText("Kilograms");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[5]/div[4]/div/select")).click();
	Select txtMeasurementUnits = new Select(driver.findElement(By.name("txtMeasurementUnits")));
	txtMeasurementUnits.selectByVisibleText("FEET");
	driver.findElement(By.name("txtChargableWeight")).click();
	
	//*[@id="dp1702551668241"]
	
	//*[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[5]/a
	Thread.sleep(1000);
    driver.findElement( By.xpath("//input[@id='dp1702551668241']")).click();
    
  //input[@id='dp1702551668241']
    driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click();                      
    driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click(); 
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
	driver.findElement(By.name("txtNotes[]")).sendKeys("Bata");
	
	Thread.sleep(1000);
	driver.findElement(By.name("txtItemName[]")).sendKeys("TATA");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
	Select txtPack = new Select(driver.findElement(By.name("txtPackageList[]")));
	txtPack.selectByVisibleText("Box Demo");
	Thread.sleep(1000);
	driver.findElement(By.name("txtQuantity[]")).sendKeys("5");
	driver.findElement(By.name("txtLength[]")).sendKeys("12");
	driver.findElement(By.name("txtWidth[]")).sendKeys("14");
	driver.findElement(By.name("txtHeight[]")).sendKeys("13");
	driver.findElement(By.name("txtWeight[]")).sendKeys("10");
	driver.findElement(By.name("btnCalculate")).click();
	Thread.sleep(1000);
	
	
}
}



