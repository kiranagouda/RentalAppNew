package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
		@Test
	public void login(WebDriver driver,String BROWSER) {
			//welcome
			
		//public static void main(String[] args) {
	    //  WebDriverManager.chromedriver().setup();
	      //WebDriver driver=new ChromeDriver();
	      
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
	      
	      driver.get("https://www.amazon.com");
	
	      
		}

	}

