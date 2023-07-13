package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
		@Test
		public void example(WebDriver driver,String BROWSER) {
		  // WebDriverManager.chromedriver().setup();
		   //   WebDriver driver=new ChromeDriver();
		      
		    //welcome
				if(BROWSER.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
				}else if(BROWSER.equalsIgnoreCase("firefox")) {
					//WebDriverManager.firefoxdriver().setup();
					//driver = new FirefoxDriver();
				}else if(BROWSER.equalsIgnoreCase("edge")) {
					driver = new EdgeDriver();
				}else {
				    driver = new ChromeDriver();
				}
		      
		      driver.get("https://www.myntra.com");
}
}