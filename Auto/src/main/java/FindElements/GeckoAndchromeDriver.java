package FindElements;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoAndchromeDriver {



	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Appy\\Desktop\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
		
	}
}
