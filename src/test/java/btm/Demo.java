package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	@Test
	public void example() {
		//welcome
	   WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.meesho.com");
}
}
