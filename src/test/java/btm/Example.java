package btm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
		@Test
		public void example() {
		   WebDriverManager.chromedriver().setup();
		      WebDriver driver=new ChromeDriver();
		      driver.get("https://www.myntra.com");
}
}