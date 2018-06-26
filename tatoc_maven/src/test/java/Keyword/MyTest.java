package Keyword;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.automation.tatoc_maven.Base;

public class MyTest {
	WebDriver driver;
	@BeforeClass
	public void launch_Browser() {
		Base a = new Base();
		driver = a.getDriver();
		launchBrowser obj = new launchBrowser(driver);
		obj.openbrowser();
		
	}
	@Test(priority = 1)
	public void Basic_Course_Click() {
		BasicCourseClick obj = new BasicCourseClick(driver);
		obj.action();
		
	}
	@Test(priority = 2)
	public void Green_Box_Click() {
		GreenBox obj = new GreenBox(driver);
		obj.action();
		
	}
	@Test(priority = 3)
	public void color_box_matching() {
		Boxcolormatch obj = new Boxcolormatch(driver);
		obj.boxcolor();	
	}
	@Test(priority = 4)
	public void Drag_and_Drop_Test() {
		DragandDrop obj = new DragandDrop(driver);
		obj.draganddropfunction();		
	}
	@Test(priority = 5)
	public void NewTab_And_Submit_Text() {
		NewTabAndSearch obj = new NewTabAndSearch(driver);
		obj.action("Aaa");
		
	}
	@Test(priority = 6)
	public void check_token_generation() {
		TokenGeneration obj= new TokenGeneration(driver);
		obj.token();
		
	}
	@AfterClass
	public void close_the_browser() {
		CloseBrowser obj = new CloseBrowser(driver);
		obj.close();
	}
		
	
}



