package com.seleniumtraining.day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String mainwindow= driver.getWindowHandle(); //mainwidnow is
		System.out.println(mainwindow);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
		Set<String> windowslist= driver.getWindowHandles();
	    Iterator<String> itr=windowslist.iterator();
	    while(itr.hasNext()) {
	    	String childwindowid= itr.next(); //firstwindow id, second window id
	    	if(!mainwindow.equals(childwindowid)) 
	    	{
	    		int y=10;
	    		driver.switchTo().window(childwindowid);
	    		
	    		js.executeScript("window.scrollBy(0,500)");
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
	    	}
	    	
	    }
	   
	    driver.switchTo().window(mainwindow);
	    Thread.sleep(3000);
	    driver.findElement(By.id("created")).click();
		
	}

}
