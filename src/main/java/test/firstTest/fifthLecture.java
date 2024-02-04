package test.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fifthLecture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://ultimateqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Q1. What is XPath , & create one XPath by using this site 
		// https://demo.applitools.com/app.html 
		//driver.findElement(By.xpath("//div[@class='element-search autosuggest-search-activator']//input[@placeholder='Start typing to search...']")).sendKeys("Hello");
		
		// Q.2 What is CSS selector & & create one CSS Selector by using any site.
		// https://demo.applitools.com/app.html 
		// driver.findElement(By.cssSelector("div[class='element-search autosuggest-search-activator'] input[placeholder='Start typing to search...']")).sendKeys("Hello");

		
		// Q.4 What are the types of CSS selector  , Give example of each.
		// driver.findElement(By.cssSelector("#id-search-field")).sendKeys("Hello");
	    // driver.findElement(By.cssSelector("input.search-field")).sendKeys("Hello World");
		// driver.findElement(By.cssSelector("input#id-search-field")).sendKeys("Hello Pakistan");
		// driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Hello QA");
		
		
		// Q5. Use ID, Name, Class name, Tag name, Link text, Partial Link Text on any website.
		//driver .findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.id("email")).sendKeys("Hi");
		//driver.findElement(By.className("search-field")).sendKeys("Hey");
		//driver.findElement(By.name("q")).sendKeys("Name");
		//driver.findElement(By.tagName("input")).sendKeys("Tag Name");
		
		
		// Q.3 What are the types of XPath , Give example of each.
		// Absolute xpath
		//  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form/div/div[1]/input")).sendKeys("Testing");
 
		// Relative xpath with tagname
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Absolute xpath practice");

		
		// Relative xpath with and
		// driver.findElement(By.xpath("//input[@name='s' and @placeholder='Search']")).sendKeys("Absolute xpath practice");

		// Relative xpath with *
		// driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("Absolute xpath practice");

	}

}
