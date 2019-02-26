package FindElements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception, Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Appy\\Desktop\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.com/");
		
	List<WebElement>	LinkLists=  driver.findElements(By.tagName("a"));
	           LinkLists.addAll(driver.findElements(By.tagName("img")));
	           
	           System.out.println(LinkLists.size());
		
	         List<WebElement>  Activelinks= new ArrayList<WebElement>();
	         
	         for(int i=0;i<LinkLists.size();i++){
	        	 System.out.println(LinkLists.get(i).getAttribute("href"));
	        	 
	        	 if(LinkLists.get(i).getAttribute("href")!=null && 
	        			 (!LinkLists.get(i).getAttribute("href").contains("javascript")));
	        	 
	        	 
	        	 Activelinks.add(LinkLists.get(i));
	         } 
	        	 System.out.println(Activelinks.size());
	        	 
	        	 for(int j=0;j<Activelinks.size();j++){
	        		 
	        HttpURLConnection Connections=(HttpURLConnection)new URL(Activelinks.get(j).getAttribute("href")).openConnection();
	        	Connections.connect();	        
	              String response= Connections.getResponseMessage();
	              Connections.disconnect();
	              System.out.println(Activelinks.get(j).getAttribute("href")+"--->"+ response);
	        	 
	        	 
	        	 }
	        	 
	        	 
	        	 
	         }
	
	}
    
