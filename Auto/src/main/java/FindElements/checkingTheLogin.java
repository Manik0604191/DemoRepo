package FindElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class checkingTheLogin {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Appy\\Desktop\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.com/");
		Actions Act= new Actions(driver); 
		Act.moveToElement(driver.findElement(By.xpath("//*[@class='nav-line-2'][contains(text(),'Account & Lists')]"))).build().perform();
		
		Thread.sleep(1000);
		
		// Clicking on sign in Button home page
		driver.findElement(By.xpath("//*[@class='nav-action-inner']")).click();
		
		//Enetering on email id
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mnksaha031@gmail.com");
		
		//Entering the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manik");
		
		//Clicking on Sing in button of login page
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	
		
	}

}
