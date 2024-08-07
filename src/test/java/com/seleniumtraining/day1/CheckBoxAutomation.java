package com.seleniumtraining.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);

		boolean isSelected= driver.findElement(By.xpath("svg[class='rct-icon rct-icon-check']")).isSelected();
		if(isSelected) {
			
		}
		else {
			driver.findElement(By.xpath("//span[@class='rct-title']")).click();
		}
		
		
	}

}
