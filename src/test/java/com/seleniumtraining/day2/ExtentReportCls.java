package com.seleniumtraining.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportCls {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MM-dd HH-mm-ss");
		LocalDateTime now=LocalDateTime.now();
		String time=dtf.format(now);
		
		 extent=new ExtentReports();
		 
		 spark=new ExtentSparkReporter("./Reports/Summary Report_"+time+".html");
		 spark.config().setTheme(Theme.DARK);
		 spark.config().setDocumentTitle("Final Test Report");
		 
		 extent.attachReporter(spark);
		 
		 test=extent.createTest("OrangeHRM Login Test");
		
		 
			WebDriver driver =new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			test.info("Launched the website");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			test.info("Entered the user name Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			test.info("Entered the password admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			test.info("Clicked on login button");
			
			extent.flush();
			
		 
		 

	}

}
