import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	
	
		@Test
		public void Method001()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.goindigo.in/");
	}

}
