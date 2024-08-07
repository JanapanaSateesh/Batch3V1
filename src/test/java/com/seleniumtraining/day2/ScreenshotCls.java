package com.seleniumtraining.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCls {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		GetScreenshotMethod(driver);
	
		
		
	}
	
	public static void GetScreenshotMethod(WebDriver driver) throws IOException {
		File sourcescreenshotfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./Screenshots/image1.png");
		FileUtils.copyFile(sourcescreenshotfile, destinationfile);	
	}

}
