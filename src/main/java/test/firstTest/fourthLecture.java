package test.firstTest;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class fourthLecture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Q1: Open facebook.com application using edge and Firefox browser.

		 //Firefox driver
//		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");		
//		driver.manage().window().maximize();
//		driver.close();
		
		// Edge driver
//		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.close();
	
		
		// Q2: Open linkedin.com application using edge and Firefox browser.

//				// Firefox driver
//				System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
//				WebDriver driver = new FirefoxDriver();
//				driver.get("https://www.linkedin.com/");
//		        driver.manage().window().maximize(); 
//				driver.close();
				
//				// Edge driver
//				System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\edgedriver_win64\\msedgedriver.exe");
//				WebDriver driver = new EdgeDriver();
//				driver.get("https://www.linkedin.com/");
//				driver.manage().window().maximize();
//				//driver.close();
//		
		      // Q3: How to Handle Multiple Windows in Selenium WebDriver? Give one code example.
			  System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\edgedriver_win64\\msedgedriver.exe");
			  WebDriver driver = new EdgeDriver();
			  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
			  String parentHandle=driver.getWindowHandle();
			  
			  driver.findElement(By.id("newWindowBtn")).click();
			  Thread.sleep(6000);
			  Set<String> handles = driver.getWindowHandles();
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  System.out.println(handles);
			  
			  for(String handle :  handles) {
				  if(!handle.equals(parentHandle))
				  {
					  driver.switchTo().window(handle);
					  driver.findElement(By.id("firstName")).sendKeys("Test");
					  Thread.sleep(2000);
				  }
				  
			  }
			  driver.switchTo().window(parentHandle);
			  driver.findElement(By.id("name")).sendKeys("Testing");
			  
			  
			  
			  
			  // Q4: How to Handle Frames in Selenium WebDriver? Give one code example. 

//			  driver.get("https://blogpendingtasks.blogspot.com/");
//			  driver.manage().window().maximize();
//			  Thread.sleep(2000);
//			  driver.switchTo().frame("navbar-iframe");
//			  driver.findElement(By.id("b-query")).sendKeys("Hello");
			  
	}

}

