package Keyword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

import com.qait.automation.tatoc_maven.Base;

public class BasicCourseClick extends Base {
	public BasicCourseClick(WebDriver driver) {
		this.driver= driver;
	}
	By clickbasiccourse =By.linkText("Basic Course");
	public void action() {
		driver.findElement(clickbasiccourse).click();
		System.out.println(" Successfully click on Basic Course");
	}

}
