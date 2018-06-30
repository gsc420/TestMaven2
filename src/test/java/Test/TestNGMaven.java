package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGMaven {
	
	
	@Test
	public void testlogin(){
		WebDriver wb = new FirefoxDriver();
		wb.get("http://www.gmail.com");
		wb.getTitle();
		wb.quit();
	}

}
