package com.seleniumtraining.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//iframe[@id='frame1']"))
		driver.switchTo().frame(4);
		String text= driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text);
		js.executeScript("window.scrollBy(0,-200)");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		String heading= driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
		System.out.println(heading);
		
	}

}
