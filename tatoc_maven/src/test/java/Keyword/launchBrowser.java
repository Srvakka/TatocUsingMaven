package Keyword;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.automation.tatoc_maven.Base;

public class launchBrowser extends Base {
	
	public launchBrowser(WebDriver driver) {
	this.driver =driver;
	}
	public void openbrowser() {
		driver.get("http://10.0.1.86/tatoc");
	    String pagetitle = driver.getTitle();
	    Assert.assertEquals("Welcome - T.A.T.O.C", pagetitle);
	   System.out.println("Page verified"); 
	} 
}


