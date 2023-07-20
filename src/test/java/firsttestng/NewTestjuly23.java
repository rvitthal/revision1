package firsttestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestjuly23 {
	@Parameters("browsername")
 
  @Test
  public void cbt(String bname) throws InterruptedException
  {
	  WebDriver driver = null;
		if(bname.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(bname.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		driver.get("https:/www.facebook.com");
		Thread.sleep(2000);
		driver.close();
  }
  
}
