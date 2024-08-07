package com.seleniumtraining.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JavscriptClickCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", actualTitle);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Sateesh");
//		WebElement inputdataelement= driver.findElement(By.xpath("//input[@id='userName']"));
//		js.executeScript("arguments[0].value='Sateesh'",inputdataelement);
//		Thread.sleep(2000);	
//		WebElement ele=driver.findElement(By.xpath("//button[@id='submit']"));
//		js.executeScript("arguments[0].click()",ele);
	}

}
