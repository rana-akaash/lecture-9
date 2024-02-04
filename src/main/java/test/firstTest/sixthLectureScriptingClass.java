package test.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sixthLectureScriptingClass {
	
	public void scripting() throws InterruptedException {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/a/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("continue-shopping")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Muhammad");
        driver.findElement(By.id("last-name")).sendKeys("Akaash");
        driver.findElement(By.id("postal-code")).sendKeys("55000");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        
	}

}
