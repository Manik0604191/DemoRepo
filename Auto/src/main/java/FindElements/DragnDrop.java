package FindElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Appy\\Desktop\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		Actions act= new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='treebox1']//span[@class='standartTreeRow']"
				+ "[contains(text(),'Thrillers')]"));
		WebElement target= driver.findElement(By.xpath("//div[@id='treebox2']//"
				+ "span[@class='standartTreeRow'][contains(text(),'Bestsellers')]"));
		act.dragAndDrop(source, target).build().perform();
		
		
		
		
		
		
		driver.quit();
		

	}

}
