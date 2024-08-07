package com.seleniumtraining.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FirstAutomationCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String firstname="Sateesh Janapana";
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(firstname);
		
		driver.findElement(By.id("userEmail")).sendKeys("sateeshabc@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		String extractedName= driver.findElement(By.xpath("//p[@id='name']")).getText();
		
		String afterSubstring= extractedName.substring(5);
		
		Assert.assertEquals(firstname, afterSubstring);
		
		
//		if(firstname.equals(afterSubstring)) {
//			System.out.println("String entered in the filed is matched with after submit");
//		}
//		else {
//			System.out.println("It didn't not matched");
//		}
	
				
		
		
	}

}
