package com.seleniumtraining.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).build().perform();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions actions = new Actions(driver);
		WebElement rightclickxpath= driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightclickxpath).build().perform();
		
		
		
	}

}
