package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qait.automation.tatoc_maven.Base;

public class GreenBox  extends Base {
	public GreenBox(WebDriver driver) {
		this.driver= driver;
	}
	By clickgreenbox =By.className("greenbox");
	public void action() {
		driver.findElement(clickgreenbox).click();
		System.out.println(" Successfully clicked on Green Box");
	}
	
}
